package com.adanedhel.mapper;

import com.adanedhel.dto.requests.LoginRequestDto;
import com.adanedhel.dto.requests.RegisterRequestDto;
import com.adanedhel.repository.entity.Kullanici;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKullaniciMapper {
    IKullaniciMapper INSTANCE= Mappers.getMapper(IKullaniciMapper.class);
    Kullanici toKullanici(final RegisterRequestDto dto);

    Kullanici toKullanici(final LoginRequestDto dto);

}
