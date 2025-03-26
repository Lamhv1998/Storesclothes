package org.example.assignmentjava6.repositories;

import org.example.assignmentjava6.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
