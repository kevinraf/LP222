package com.academiaspedropaulet.academia.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedioInteresDto {
    private Long idMedioInteres;
    @NotNull(message = "El nombreMedio no puede ser nulo")
    private String nombreMedio;
}
