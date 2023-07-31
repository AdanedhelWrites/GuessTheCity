package com.adanedhel.controller;

import static com.adanedhel.constants.EndPoints.*;

import com.adanedhel.dto.requests.CreateRequestDto;
import com.adanedhel.dto.requests.UpdateRequestDto;
import com.adanedhel.repository.entity.Sehir;
import com.adanedhel.service.SehirService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(SEHIR)
public class SehirController {
    private  final SehirService service;

    @PostMapping(EKLE)
    public ResponseEntity<Sehir> create(@RequestBody CreateRequestDto dto){
        return ResponseEntity.ok(service.create(dto));
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Sehir>> findall(){
        return ResponseEntity.ok(service.findall());
    }
    @GetMapping(FINDBYSEHIRID)
    public ResponseEntity<Sehir> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findBySehirId(id));
    }
    @DeleteMapping(DELETE)
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        service.deleteBySehirId(id);
        return ResponseEntity.ok(true);
    }
    @PutMapping(GUNCELLE)
    public ResponseEntity<Sehir> update(@RequestBody UpdateRequestDto dto){
        return ResponseEntity.ok(service.update(dto));
    }
}
