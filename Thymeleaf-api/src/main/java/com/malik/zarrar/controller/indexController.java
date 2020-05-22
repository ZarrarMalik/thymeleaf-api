package com.malik.zarrar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.malik.zarrar.services.ProductService;

@Controller
public class indexController {

    private ProductService productService;
    
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model)
    {
        model.addAttribute("products", productService.listProducts());
        return "index";
        
    }
}
