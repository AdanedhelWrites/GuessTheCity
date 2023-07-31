package com.adanedhel.mapper;

import com.adanedhel.dto.requests.SkorRequestDto;
import com.adanedhel.repository.entity.Skor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISkorMapper {
    ISkorMapper INSTANCE= Mappers.getMapper(ISkorMapper.class);
    Skor toKullanici(final SkorRequestDto dto);



}
