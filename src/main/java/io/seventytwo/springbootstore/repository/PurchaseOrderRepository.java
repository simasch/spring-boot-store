package io.seventytwo.springbootstore.repository;

import io.seventytwo.springbootstore.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
}
