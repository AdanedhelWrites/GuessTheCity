package com.adanedhel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TahminServiceRunner {
    public static void main(String[] args) {
        SpringApplication.run(TahminServiceRunner.class);
    }
}