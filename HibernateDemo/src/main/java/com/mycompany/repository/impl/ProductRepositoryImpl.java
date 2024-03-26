package com.mycompany.repository.impl;

import com.mycompany.hibernatedemo.HibernateUtils;
import com.mycompany.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Win11
 */
public class ProductRepositoryImpl {

    public List<Product> getProducts(Map<String, String> params) {
        try ( Session session = HibernateUtils.getFactory().openSession()) {
            CriteriaBuilder b = session.getCriteriaBuilder();
            CriteriaQuery<Product> q = b.createQuery(Product.class);
            Root root = q.from(Product.class);
            q.select(root);

            List<Predicate> pre = new ArrayList<>();

            String kw = params.get("kw");
            if (kw != null && !kw.isEmpty()) {
                pre.add(b.like(root.get("name"), String.format("%%%s%%", kw)));
            }

            String fromPrice = params.get("fromPrice");
            String toPrice = params.get("toPrice");

            if (fromPrice != null && !fromPrice.isEmpty()) {
                pre.add(b.greaterThanOrEqualTo(root.get("price"), Double.parseDouble(fromPrice)));
            }

            if (toPrice != null && !toPrice.isEmpty()) {
                pre.add(b.lessThanOrEqualTo(root.get("price"), Double.parseDouble(toPrice)));
            }

            String cateId = params.get("cateId");
            if (cateId != null && !cateId.isEmpty()) {
                pre.add(b.equal(root.get("category").as(Integer.class), Integer.parseInt(cateId)));
            }

            q.where(pre.toArray(Predicate[]::new));

            q.orderBy(b.asc(root.get("id")));

            Query query = session.createQuery(q);
            List<Product> products = query.getResultList();

            return products;
        }
    }

    public Product getProductById(int id) {
        try ( Session session = HibernateUtils.getFactory().openSession()) {
            return session.get(Product.class, id);
        }
    }

    public void addOrUpdateProduct(Product p) {
        try ( Session session = HibernateUtils.getFactory().openSession()) {
            session.persist(p);
        }
    }
}
