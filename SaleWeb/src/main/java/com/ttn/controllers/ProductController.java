/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.controllers;

import com.ttn.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author admin
 */
@Controller
public class ProductController {
    @GetMapping("/products")
    public String createView(Model model){
        model.addAttribute("product", new Product());
        return "products";
    }
    
    @PostMapping("/products")
    public String createProduct(@ModelAttribute(value = "product") Product p){
        return "...";
    }
}
