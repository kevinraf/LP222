package com.academiaspedropaulet.academia.servicio.impl;


import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.repositorio.CargoRepository;
import com.academiaspedropaulet.academia.repositorio.ICrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.CargoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CargoServiceImp extends CrudGenericoServiceImp<Cargo, Long> implements CargoService {
    private final CargoRepository cargoRepository;

    @Override
    protected ICrudGenericoRepository<Cargo, Long> getRepo() { return cargoRepository; }

    public Page<Cargo> listaPage(Pageable pageable){
        return cargoRepository.findAll(pageable);
    }
}
