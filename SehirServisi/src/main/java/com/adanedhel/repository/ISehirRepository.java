package com.adanedhel.repository;

import com.adanedhel.repository.entity.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISehirRepository extends JpaRepository<Sehir,Long> {
    Boolean existsByName(String name);
}
