package org.example.assignmentjava6.repositories;

import org.example.assignmentjava6.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order ,Integer> {
}
