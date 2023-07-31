package com.adanedhel.manager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.adanedhel.constants.EndPoints.FINDBYSEHIRID;
@FeignClient(name = "sehir-service-manager",url = "http://localhost:4142/sehir",decode404 = true)
public interface ISehirManager {

    @GetMapping(FINDBYSEHIRID)
    public ResponseEntity<Long> findById(@PathVariable Long id);
}
