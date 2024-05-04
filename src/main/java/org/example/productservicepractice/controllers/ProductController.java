package org.example.productservicepractice.controllers;

import org.example.productservicepractice.models.Product;
import org.example.productservicepractice.services.FakeProductService;
import org.example.productservicepractice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    // generate a constructor
    public ProductController(ProductService fakeProductService) {
        this.productService = fakeProductService;
    }
    // generate a method to get a product by id
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {

        return productService.getProductById(id);
    }
    // generate a method to get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<Product>();
    }
    // generate a method to create a product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }
    // generate a method to update a product using put
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }
    // generate a method to update a product using patch
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }
    // generate a method to delete a product
    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable("id") Long id) {
        return new Product();
    }
}