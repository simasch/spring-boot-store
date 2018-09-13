package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@DataJpaTest
@RunWith(SpringRunner.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void findAll() {
        List<Product> list = productRepository.findAll();

        assertEquals(0, list.size());
    }

    @Test
    public void findAllByTitleAndDescription() {
        List<Product> list = productRepository.findAllByTitleLikeOrDescriptionLike("a", "b");

        assertEquals(0, list.size());
    }
}