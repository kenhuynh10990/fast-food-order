package com.example.demo.service.product;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Integer productId);
}
