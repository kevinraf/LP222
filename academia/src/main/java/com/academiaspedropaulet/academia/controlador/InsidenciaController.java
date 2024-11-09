package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CargoDTO;
import com.academiaspedropaulet.academia.dtos.InsidenciaDto;
import com.academiaspedropaulet.academia.mappers.CargoMapper;
import com.academiaspedropaulet.academia.mappers.InsidenciaMapper;
import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.servicio.CargoService;
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
@RequestMapping("/insidencias")
@CrossOrigin("*")
public class InsidenciaController {
    private final InsidenciaService servicekr;
    private final InsidenciaMapper mapperkr;
    @GetMapping
    public ResponseEntity<List<InsidenciaDto>> findAll() {
        List<InsidenciaDto> list = mapperkr.toDTOs(servicekr.findAll());
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<InsidenciaDto> findById(@PathVariable("id") Long id) {
        Insidencia obj = servicekr.findById(id);
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody InsidenciaDto dto) {
        Insidencia obj = servicekr.save(mapperkr.toEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdInsidencia()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<InsidenciaDto> update(@Valid @PathVariable("id") Long id, @RequestBody InsidenciaDto dto) {
        dto.setIdInsidencia(id);
        Insidencia obj = servicekr.update(id, mapperkr.toEntity(dto));
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        servicekr.delete(id);
        return ResponseEntity.noContent().build();
    }
}
