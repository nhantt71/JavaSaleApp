package com.ttn.services.impl;


import com.ttn.pojo.Product;
import com.ttn.repositories.ProductRepository;
import com.ttn.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win11
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository prodRepo;

    @Override
    public List<Product> getProds(Map<String, String> params) {
        return this.prodRepo.getProds(params);
    }
    
    @Override
    public void addOrUpdate(Product p) {
        this.prodRepo.addOrUpdate(p);
    }
    
}
