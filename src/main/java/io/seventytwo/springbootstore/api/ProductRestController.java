package io.seventytwo.springbootstore.api;

import io.seventytwo.springbootstore.entity.Product;
import io.seventytwo.springbootstore.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    private final ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        productRepository.saveAndFlush(product);
    }
}
