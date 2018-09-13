package io.seventytwo.springbootstore.controller;

import io.seventytwo.springbootstore.entity.Product;
import io.seventytwo.springbootstore.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    private final ProductRepository productRepository;

    public IndexController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);

        return "index";
    }
}
