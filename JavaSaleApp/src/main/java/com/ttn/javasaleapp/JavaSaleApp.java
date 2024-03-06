/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ttn.javasaleapp;

import com.ttn.pojo.Product;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author admin
 */
public class JavaSaleApp {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.getFactory();

        Session session = factory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);
        Root<Product> root = query.from(Product.class);
        query.select(root);

        var q = session.createQuery(query);
        List<Product> rs = q.getResultList();
        rs.forEach(p -> System.out.printf("%s - %d\n", p.getName(), p.getCategoryId().getId()));
    }
}
