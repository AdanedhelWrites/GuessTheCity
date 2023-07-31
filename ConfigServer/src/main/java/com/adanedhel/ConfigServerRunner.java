package com.adanedhel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerRunner.class);
    }
}