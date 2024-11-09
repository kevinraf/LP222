package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CargoDTO;
import com.academiaspedropaulet.academia.dtos.EstudianteDto;
import com.academiaspedropaulet.academia.dtos.InsidenciaDto;
import com.academiaspedropaulet.academia.mappers.CargoMapper;
import com.academiaspedropaulet.academia.mappers.EstudianteMapper;
import com.academiaspedropaulet.academia.mappers.InsidenciaMapper;
import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.servicio.CargoService;
import com.academiaspedropaulet.academia.servicio.EstudianteService;
import com.academiaspedropaulet.academia.servicio.InsidenciaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estudiantes")
@CrossOrigin("*")
public class EstudianteController {
    private final EstudianteService servicekr;
    private final EstudianteMapper mapperkr;
    @GetMapping
    public ResponseEntity<List<EstudianteDto>> findAll() {
        List<EstudianteDto> list = mapperkr.toDTOs(servicekr.findAll());
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDto> findById(@PathVariable("id") Long id) {
        Estudiante obj = servicekr.findById(id);
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody EstudianteDto dto) {
        Estudiante obj = servicekr.save(mapperkr.toEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdEstudiante()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<EstudianteDto> update(@Valid @PathVariable("id") Long id, @RequestBody EstudianteDto dto) {
        dto.setIdEstudiante(id);
        Estudiante obj = servicekr.update(id, mapperkr.toEntity(dto));
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        servicekr.delete(id);
        return ResponseEntity.noContent().build();
    }
}
