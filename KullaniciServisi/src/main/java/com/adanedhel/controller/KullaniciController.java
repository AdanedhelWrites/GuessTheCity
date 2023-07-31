package com.adanedhel.controller;

import static com.adanedhel.constants.EndPoints.*;

import com.adanedhel.dto.requests.LoginRequestDto;
import com.adanedhel.dto.requests.RegisterRequestDto;
import com.adanedhel.repository.entity.Kullanici;
import com.adanedhel.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(KULLANICI)
public class KullaniciController {
    private final KullaniciService service;

    /**
     * String döndürmicem swagger'da rahat görmek için
     * @param dto
     * @return DTO'nun tümü
     */
    @PostMapping(REGISTER)
    public ResponseEntity<Kullanici> register(@RequestBody @Valid RegisterRequestDto dto){
        return ResponseEntity.ok(service.register(dto));
    }
    @PostMapping(LOGIN)
    public ResponseEntity<Kullanici> login(@RequestBody LoginRequestDto dto){
        return ResponseEntity.ok(service.login(dto));
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Kullanici>> findall(){
        return ResponseEntity.ok(service.findAll());
    }
}
