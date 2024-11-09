package com.academiaspedropaulet.academia.dtos;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsidenciaDto {
    private Long idInsidencia;
    @NotNull(message = "El apellido no puede ser nulo")
    private String descripcion;
    @NotNull(message = "El apellido no puede ser nulo")
    private String castigo;
    @NotNull(message = "El apellido no puede ser nulo")
    private String estudiante;

}
