package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product-list")
    public ResponseEntity<List<Product>> getAllProduct(){
        try{
            List<Product> productList = productService.getAllProduct();
            return new ResponseEntity<>(productList, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/product-detail/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer productId){
        try{
            Product product= productService.getProductById(productId);
            return new ResponseEntity<>(product,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
