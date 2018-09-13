package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
