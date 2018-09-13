package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByTitleLikeOrDescriptionLike(String title, String description);
}
