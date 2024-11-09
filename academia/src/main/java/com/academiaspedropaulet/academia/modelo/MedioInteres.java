package com.academiaspedropaulet.academia.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_mediointeres")
public class MedioInteres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medioInteres")
    private Long idMedioInteres;
    @Column(name = "nombreMedio", length = 100, nullable = false)
    private String nombreMedio;

}
