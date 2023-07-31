package com.adanedhel.repository;

import com.adanedhel.repository.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IKullaniciServisRepository extends JpaRepository<Kullanici,Long> {
    Boolean existsByUsername(String username);
    Optional<Kullanici> findOptionalByUsernameAndPassword(String username,String password);
}
