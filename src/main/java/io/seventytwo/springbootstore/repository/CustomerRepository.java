package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
