package com.revature.invincible.repositories;

import com.revature.invincible.models.Clothing;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ClothingRepository extends CrudRepository<Clothing, String> {
    @Modifying
    @Query(value = "INSERT INTO clothings (id, name, price, product_id) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void save(String id, String name, BigDecimal price, String product_id);
}