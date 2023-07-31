package com.adanedhel.service;

import com.adanedhel.dto.requests.LoginRequestDto;
import com.adanedhel.dto.requests.RegisterRequestDto;
import com.adanedhel.exception.ErrorType;
import com.adanedhel.exception.KullaniciServisException;
import com.adanedhel.mapper.IKullaniciMapper;
import com.adanedhel.repository.IKullaniciServisRepository;
import com.adanedhel.repository.entity.Kullanici;
import com.adanedhel.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService extends ServiceManager<Kullanici,Long> {
    private final IKullaniciServisRepository kullaniciServisRepository;
    public KullaniciService(IKullaniciServisRepository kullaniciServisRepository) {
        super(kullaniciServisRepository);
        this.kullaniciServisRepository=kullaniciServisRepository;
    }

    public Kullanici register(RegisterRequestDto dto){
        if (kullaniciServisRepository.existsByUsername(dto.getUsername())){
            throw new KullaniciServisException(ErrorType.USERNAME_ALREADY_EXISTS);
        }
        return save(IKullaniciMapper.INSTANCE.toKullanici(dto));
    }

    public Kullanici login(LoginRequestDto dto){
        Optional<Kullanici> kullanici= kullaniciServisRepository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if (kullanici.isEmpty()){
            throw new KullaniciServisException(ErrorType.KULLANICI_BULUNAMADI);
        }
        return IKullaniciMapper.INSTANCE.toKullanici(dto);
    }

    public List<Kullanici> findAll(){
        return kullaniciServisRepository.findAll();
    }
}
