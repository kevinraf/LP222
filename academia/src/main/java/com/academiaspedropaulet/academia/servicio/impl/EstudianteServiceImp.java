package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.dtos.EstudianteDto;
import com.academiaspedropaulet.academia.mappers.EstudianteMapper;
import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.repositorio.CargoRepository;
import com.academiaspedropaulet.academia.repositorio.EstudianteRepository;
import com.academiaspedropaulet.academia.repositorio.ICrudGenericoRepository;
import com.academiaspedropaulet.academia.repositorio.MedioInteresRepository;
import com.academiaspedropaulet.academia.servicio.EstudianteService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EstudianteServiceImp extends CrudGenericoServiceImp<Estudiante,Long> implements EstudianteService {
    private final EstudianteRepository repo;

    @Override
    protected ICrudGenericoRepository<Estudiante, Long> getRepo() { return repo; }


}