/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hibernatedemo;

import com.mycompany.pojo.Product;
import com.mycompany.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Win11
 */
public class HibernateDemo {

    public static void main(String[] args) {
        ProductRepositoryImpl s = new ProductRepositoryImpl();

        Map<String, String> params = new HashMap<>();
        params.put("fromPrice", "11000000");
        params.put("toPrice", "20000000");

        s.getProducts(params).forEach(p -> System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice()));
        
        System.out.println("=========");
        
        Product prod = s.getProductById(4);
        
        System.out.println(prod.getId() + " " + prod.getName() + " " + prod.getPrice());
    }
}
