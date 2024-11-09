package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.dtos.TrabajadorDTO;
import com.academiaspedropaulet.academia.mappers.TrabajadorMapper;
import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.Trabajador;
import com.academiaspedropaulet.academia.repositorio.CargoRepository;
import com.academiaspedropaulet.academia.repositorio.EstudianteRepository;
import com.academiaspedropaulet.academia.repositorio.ICrudGenericoRepository;
import com.academiaspedropaulet.academia.repositorio.TrabajadorRepository;
import com.academiaspedropaulet.academia.servicio.TrabajadorService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class TrabajadorServiceImp extends CrudGenericoServiceImp<Trabajador, Long> implements TrabajadorService {
    private final TrabajadorRepository repo;

    @Override
    protected ICrudGenericoRepository<Trabajador, Long> getRepo() { return repo; }
}
