package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.MedioInteresDto;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedioInteresMapper extends GenericMapper<MedioInteresDto, MedioInteres> {
}
