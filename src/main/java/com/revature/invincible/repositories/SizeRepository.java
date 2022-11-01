package com.revature.invincible.repositories;

import com.revature.invincible.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, String> {
    @Modifying
    @Query(value = "INSERT INTO clothing_size (clothing_id, size_id) VALUES (?1, ?2)", nativeQuery = true)
    void saveClothingSize(String clothing_id, String size_id);

    @Query(value = "SELECT s.size FROM sizes s join clothing_size cs on cs.clothing_id = ?1 where s.size = ?2", nativeQuery = true)
    List<String> findSizesByClothingIdAndSize(String clothing_id, String size);
}
