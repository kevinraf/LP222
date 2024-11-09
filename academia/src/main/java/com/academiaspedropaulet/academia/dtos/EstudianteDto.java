package com.academiaspedropaulet.academia.dtos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstudianteDto {
    private Long idEstudiante;
    @NotNull(message = "El nombreCompleto no puede ser nulo")
    private String nombreCompleto;
    @NotNull(message = "El apellidoPaterno no puede ser nulo")
    private String apellidoPaterno;
    @NotNull(message = "El apellidoMaterno no puede ser nulo")
    private String apellidoMaterno;
    @NotNull(message = "El dni no puede ser nulo")
    private String dni;
    @NotNull(message = "El medioInteres no puede ser nulo")
    private String medioInteres;

}
