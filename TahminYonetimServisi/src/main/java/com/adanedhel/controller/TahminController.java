package com.adanedhel.controller;

import static com.adanedhel.constants.EndPoints.*;

import com.adanedhel.dto.requests.TahminRequestDto;
import com.adanedhel.repository.entity.Tahmin;
import com.adanedhel.service.TahminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(TAHMIN)
public class TahminController {
    private final TahminService service;
    @PostMapping(YAP)
    ResponseEntity<Tahmin> tahminYap(@RequestBody TahminRequestDto dto){
        return ResponseEntity.ok(service.tahminYap(dto.getUserId(), dto.getUserTahmin()));
    }
}
