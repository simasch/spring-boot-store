package io.seventytwo.springbootstore.controller;

import io.seventytwo.springbootstore.entity.Product;
import io.seventytwo.springbootstore.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private final ProductRepository productRepository;

    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String findAll(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);

        return "products";
    }

    @GetMapping("/search")
    public String search(@RequestParam String searchTerm, Model model) {
        if (searchTerm == null || searchTerm.equals("")) {
            return findAll(model);
        } else {
            List<Product> products = productRepository.findAllByTitleLikeOrDescriptionLike("%" + searchTerm + "%", "%" + searchTerm + "%");
            model.addAttribute("products", products);

            return "products";
        }
    }

    @GetMapping("/{id}")
    public String get(@PathVariable Integer id, Model model) {
        Product product = productRepository.getOne(id);

        model.addAttribute("product", product);

        return "product";
    }

    @GetMapping("/new")
    public String add(Model model) {
        Product product = new Product();

        model.addAttribute("product", product);

        return "product";
    }

    @PostMapping
    public String save(Product product, Model model) {
        productRepository.saveAndFlush(product);

        return findAll(model);
    }
}
