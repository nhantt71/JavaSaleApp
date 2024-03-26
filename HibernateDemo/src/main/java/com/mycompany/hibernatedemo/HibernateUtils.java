package com.mycompany.hibernatedemo;


import com.mycompany.pojo.Category;
import com.mycompany.pojo.Comment;
import com.mycompany.pojo.OrderDetail;
import com.mycompany.pojo.ProdTag;
import com.mycompany.pojo.Product;
import com.mycompany.pojo.SaleOrder;
import com.mycompany.pojo.Tag;
import com.mycompany.pojo.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win11
 */
public class HibernateUtils {
    private static final SessionFactory factory;
    
    static{
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(User.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(registry);
    }
    
    public static SessionFactory getFactory(){
        return factory;
    }
}
