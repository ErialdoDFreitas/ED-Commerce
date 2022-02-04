package com.example.edcommerce.repo;

import com.example.edcommerce.model.Product;
import com.example.edcommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    void deleteById(Long id);
    
    Optional<Product> findById (Long id);

}
