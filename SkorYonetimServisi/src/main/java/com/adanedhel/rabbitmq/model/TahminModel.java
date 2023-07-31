package com.adanedhel.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TahminModel implements Serializable {
    Long userId;
    String userTahmin;
    Boolean dogruMu;

}
