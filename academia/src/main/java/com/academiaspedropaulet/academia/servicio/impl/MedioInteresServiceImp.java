package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.repositorio.ICrudGenericoRepository;
import com.academiaspedropaulet.academia.repositorio.MedioInteresRepository;
import com.academiaspedropaulet.academia.servicio.MedioInteresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MedioInteresServiceImp extends CrudGenericoServiceImp<MedioInteres,Long> implements MedioInteresService {
    private final MedioInteresRepository medioInteresRepository;
    @Override
    protected ICrudGenericoRepository<MedioInteres, Long> getRepo() {
        return medioInteresRepository;
    }
}