package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.PurchaseOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@DataJpaTest
@RunWith(SpringRunner.class)
public class PurchaseOrderRepositoryTest {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Test
    public void findAll() {
        List<PurchaseOrder> list = purchaseOrderRepository.findAll();

        assertEquals(0, list.size());
    }
}