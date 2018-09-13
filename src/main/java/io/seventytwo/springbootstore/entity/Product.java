package io.seventytwo.springbootstore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productNumber;
    private String title;
    private String description;
    private BigDecimal price;

    public Product(String productNumber, String title, String description, BigDecimal price) {
        this.productNumber = productNumber;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
