package com.academiaspedropaulet.academia.modelo;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "academia_estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long idEstudiante;

    @Column(name = "nombre_completo",length = 50, nullable = false)
    private String nombreCompleto;

    @Column(name = "apellido_paterno",length = 50, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",length = 50, nullable = false)
    private String apellidoMaterno;

    @Column(name = "dni",length = 8, nullable = false)
    private String dni;

    @Column(name = "MedioInteres",length = 50, nullable = false)
    private String medioInteres;
}
