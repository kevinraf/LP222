package com.academiaspedropaulet.academia.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrabajadorDTO {
    private Long idTrabajador;
    @NotNull(message = "El nombre no puede ser nulo")
    private String nombre;
    @NotNull(message = "El apellido no puede ser nulo")
    private String apellido;
    @NotNull(message = "El contraseña no puede ser nulo")
    private String contrasena;
    @NotNull(message = "El cargo no puede ser nulo")
    private String cargo;

}
