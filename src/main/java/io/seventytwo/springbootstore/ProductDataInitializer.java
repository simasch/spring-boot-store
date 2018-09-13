package io.seventytwo.springbootstore;

import io.seventytwo.springbootstore.entity.Product;
import io.seventytwo.springbootstore.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductDataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    public ProductDataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        productRepository.save(new Product(
                "01279",
                "Caran d'Ache Schulbleistift 341, HB",
                "Der beliebte Schulbleistift von Caran d'Ache ist in vier verschiedenen Farben erhältlich. Lieferung in 12-er Schachtel.",
                new BigDecimal("8.00")));

        productRepository.save(new Product(
                "03470",
                "Stabilo Boss Leuchtmarker Original, gelb, 5 mm",
                "Leuchtmarker mit Tinte auf Wasserbasis, geeignet für jegliche Papiere. Stabiler Schaft aus Polypropylen (PP). Die Farben gelb, grün, orange und rosa sind nachfüllbar.",
                new BigDecimal(1.20)));
    }
}
