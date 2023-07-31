package com.adanedhel.repository;

import com.adanedhel.repository.entity.Skor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISkorRepository extends JpaRepository<Skor,Long> {
    Skor findByuserId(Long id);

    List<Skor> findByOrderBySkorAsc();
}
