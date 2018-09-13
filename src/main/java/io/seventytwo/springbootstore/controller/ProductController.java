package io.seventytwo.springbootstore.controller;

import io.seventytwo.springbootstore.entity.Product;
import io.seventytwo.springbootstore.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
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
}
