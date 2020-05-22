package com.malik.zarrar.services;

import java.util.List;

import com.malik.zarrar.domain.Product;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
