package com.ttn.repositories;

import com.ttn.pojo.Product;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win11
 */
public interface ProductRepository {
    List<Product> getProds(Map<String, String> params);
    void addOrUpdate(Product p);
}