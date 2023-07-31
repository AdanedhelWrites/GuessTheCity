package com.adanedhel.controller;

import static com.adanedhel.constants.EndPoints.*;

import com.adanedhel.dto.requests.SkorRequestDto;
import com.adanedhel.mapper.ISkorMapper;
import com.adanedhel.rabbitmq.model.TahminModel;
import com.adanedhel.repository.entity.Skor;
import com.adanedhel.service.SkorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(SKOR)
public class SkorController {
    private final SkorService service;

    @PutMapping(GUNCELLE)
    ResponseEntity<Skor> guncelle(@RequestBody SkorRequestDto dto){
        Skor skor = ISkorMapper.INSTANCE.toKullanici(dto);
        skor.setSkor(skor.getSkor());
        return ResponseEntity.ok(skor);
    }

    @GetMapping(SIRALA)
    ResponseEntity<List<Skor>> sirala(){
        return ResponseEntity.ok(service.findByOrderBySkorAsc());
    }
}
