package com.malik.zarrar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.malik.zarrar.services.ProductService;

@Controller
public class productController {
    private ProductService service;

    @Autowired
    public void setProductService(ProductService service)
    {
        this.service = service;
    }
    
    @RequestMapping("/product")
    public String getProduct() {
        return "product";
    }
    
    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", service.getProduct(id));

        return "product";
    }

}
