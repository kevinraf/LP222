package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.dtos.EstudianteDto;
import com.academiaspedropaulet.academia.dtos.InsidenciaDto;
import com.academiaspedropaulet.academia.mappers.EstudianteMapper;
import com.academiaspedropaulet.academia.mappers.InsidenciaMapper;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.repositorio.EstudianteRepository;
import com.academiaspedropaulet.academia.repositorio.ICrudGenericoRepository;
import com.academiaspedropaulet.academia.repositorio.InsidenciaRepository;
import com.academiaspedropaulet.academia.repositorio.MedioInteresRepository;
import com.academiaspedropaulet.academia.servicio.InsidenciaService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InsidenciaServiceImp extends CrudGenericoServiceImp<Insidencia,Long> implements InsidenciaService{
    private final InsidenciaRepository repo;

    @Override
    protected ICrudGenericoRepository<Insidencia, Long> getRepo() { return repo; }
}