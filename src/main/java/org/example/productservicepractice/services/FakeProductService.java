package org.example.productservicepractice.services;


import org.example.productservicepractice.dtos.FakeStoreProductDto;
import org.example.productservicepractice.models.Category;
import org.example.productservicepractice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class FakeProductService implements ProductService{
    private RestTemplate restTemplate;
    FakeProductService( RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id) {
        FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject("https://fakestoreapi.com/products/{id}", FakeStoreProductDto.class, id);
        assert fakeStoreProductDto != null;
        return convertDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }

    public Product convertDtoToProduct(FakeStoreProductDto dto) {
        Product product = new Product();
        // Set the fields of the product based on the dto
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        Category category = new Category(dto.getCategory());

        product.setCategory(category);
        return product;
    }
}
