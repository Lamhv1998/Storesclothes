package org.example.assignmentjava6.repositories;

import org.example.assignmentjava6.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository <Category,Integer> {
}
