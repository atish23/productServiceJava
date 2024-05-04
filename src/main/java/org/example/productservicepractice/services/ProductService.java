package org.example.productservicepractice.services;
import org.example.productservicepractice.models.Product;
import java.util.List;
// This interface will define the methods that the FakeProductService class will implement
// The FakeProductService class will be responsible for handling the business logic for the product service
public interface ProductService {
    // generate a method to get a product by id
    Product getProductById(Long id);
    // generate a method to get all products
    List<Product> getAllProducts();
    // generate a method to create a product
    Product createProduct(Product product);
    // generate a method to update a product using put
    Product replaceProduct(Long id, Product product);
    // generate a method to update a product using patch
    Product updateProduct(Long id, Product product);
    // generate a method to delete a product
    Product deleteProduct(Long id);
}
