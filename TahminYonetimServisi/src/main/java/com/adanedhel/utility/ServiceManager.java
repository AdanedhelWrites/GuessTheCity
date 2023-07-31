package com.adanedhel.utility;


import com.adanedhel.repository.entity.Tahmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class ServiceManager implements IService<Tahmin,Long>{
    private final JpaRepository<Tahmin,Long> repository;
    public ServiceManager(JpaRepository<Tahmin, Long> repository) {
        this.repository = repository;
    }
    @Override
    public Tahmin save(Tahmin t) {
        return repository.save(t);
    }
    @Override
    public Iterable<Tahmin> saveAll(Iterable<Tahmin> t) {

        return repository.saveAll(t);
    }
    @Override
    public Tahmin update(Tahmin t) {

        return repository.save(t);
    }
    @Override
    public void delete(Tahmin t) {
        repository.delete(t);
    }
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public Optional<Tahmin> findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Tahmin> findAll() {
        return repository.findAll();
    }
}
