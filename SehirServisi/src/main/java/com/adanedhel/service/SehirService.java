package com.adanedhel.service;

import com.adanedhel.dto.requests.CreateRequestDto;
import com.adanedhel.dto.requests.UpdateRequestDto;
import com.adanedhel.exception.ErrorType;
import com.adanedhel.exception.SehirServisException;
import com.adanedhel.repository.ISehirRepository;
import com.adanedhel.repository.entity.Sehir;
import com.adanedhel.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SehirService extends ServiceManager<Sehir,Long> {
    private final ISehirRepository sehirRepository;
    public SehirService(ISehirRepository sehirRepository) {
        super(sehirRepository);
        this.sehirRepository = sehirRepository;
    }

    /**
     * Mapper Olusturmaya Üşendim Eğer oluşturmam gerekirse değişecektir!
     * @param dto
     * @return
     */
    public Sehir create(CreateRequestDto dto){
        if (sehirRepository.existsByName(dto.getName())){
            throw new SehirServisException(ErrorType.SEHIR_ALREADY_EXISTS);
        }
        return save(Sehir.builder()
                .name(dto.getName())
                .bolge(dto.getBolge())
                .build());
    }

    public Sehir update(UpdateRequestDto dto){
        if (!sehirRepository.existsByName(dto.getName())){
            throw new SehirServisException(ErrorType.SEHIR_BULUNAMADI);
        }
        return update(Sehir.builder()
                .name(dto.getName())
                .bolge(dto.getBolge())
                .build());
    }
    public String deleteBySehirId(Long id){
        Optional<Sehir> sehir = findById(id);
        if (sehir.isEmpty()){
            throw new SehirServisException(ErrorType.SEHIR_BULUNAMADI);
        }
        sehirRepository.deleteById(id);
        return "Sehir Basariyla Silindi";
    }

    public List<Sehir> findall(){
        return sehirRepository.findAll();
    }

    public Sehir findBySehirId(Long id){
        Optional<Sehir> sehir = sehirRepository.findById(id);
        if (sehir.isEmpty()){
            throw new SehirServisException(ErrorType.SEHIR_BULUNAMADI);
        }
        return sehir.get();
    }


}
