/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.services;

import com.ttn.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Win11
 */
public interface ProductService{
    List<Product> getProds(Map<String, String> params);
    void addOrUpdate(Product p);
}