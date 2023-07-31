package com.adanedhel.utility;
import com.adanedhel.repository.entity.Skor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public class ServiceManager implements IService<Skor,Long>{
    private final JpaRepository<Skor,Long> repository;
    public ServiceManager(JpaRepository<Skor, Long> repository) {
        this.repository = repository;
    }
    @Override
    public Skor save(Skor t) {
        return repository.save(t);
    }
    @Override
    public Iterable<Skor> saveAll(Iterable<Skor> t) {

        return repository.saveAll(t);
    }
    @Override
    public Skor update(Skor t) {

        return repository.save(t);
    }
    @Override
    public void delete(Skor t) {
        repository.delete(t);
    }
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public Optional<Skor> findById(Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Skor> findAll() {
        return repository.findAll();
    }
}
