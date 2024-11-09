package com.academiaspedropaulet.academia.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_insidencia")
public class Insidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_insidencia")
    private Long idInsidencia;

    @Column(name = "descripcion",length = 50, nullable = false)
    private String descripcion;

    @Column(name = "castigo",length = 50, nullable = false)
    private String castigo;

    @Column(name = "estudiante",length = 50, nullable = false)
    private String estudiante;
}
