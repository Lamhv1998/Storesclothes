package org.example.assignmentjava6.repositories;

import org.example.assignmentjava6.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepo extends JpaRepository <Cart ,Integer>{

}
