package com.revature.invincible.repositories;

import com.revature.invincible.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT * FROM products WHERE name ilike ?1", nativeQuery = true)
    List<Product> findAllByName(String name);
}
