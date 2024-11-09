package com.academiaspedropaulet.academia.controlador;


import com.academiaspedropaulet.academia.dtos.MedioInteresDto;
import com.academiaspedropaulet.academia.mappers.MedioInteresMapper;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.servicio.MedioInteresService;
import com.academiaspedropaulet.academia.servicio.MedioInteresService;
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
@RequestMapping("/mediointereses")
@CrossOrigin("*")
public class MedioInteresController {
    private final MedioInteresService servicekr;
    private final MedioInteresMapper mapperkr;
    @GetMapping
    public ResponseEntity<List<MedioInteresDto>> findAll() {
        List<MedioInteresDto> list = mapperkr.toDTOs(servicekr.findAll());
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<MedioInteresDto> findById(@PathVariable("id") Long id) {
        MedioInteres obj = servicekr.findById(id);
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody MedioInteresDto dto) {
        MedioInteres obj = servicekr.save(mapperkr.toEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMedioInteres()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<MedioInteresDto> update(@Valid @PathVariable("id") Long id, @RequestBody MedioInteresDto dto) {
        dto.setIdMedioInteres(id);
        MedioInteres obj = servicekr.update(id, mapperkr.toEntity(dto));
        return ResponseEntity.ok(mapperkr.toDTO(obj));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        servicekr.delete(id);
        return ResponseEntity.noContent().build();
    }
}
