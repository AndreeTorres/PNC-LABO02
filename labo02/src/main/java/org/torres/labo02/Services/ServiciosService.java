package org.torres.labo02.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.torres.labo02.Domain.Entities.Servicios;
import org.torres.labo02.Repository.iServiciosRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ServiciosService {
    @Autowired
    private iServiciosRepository iServicioRepository;

    public List<Servicios> findAllServicios() {
        return iServicioRepository.findAll();
    }

    public void createServicio(Servicios servicio) {
        iServicioRepository.save(servicio);
    }

    public List<Servicios> findServiciosByPersonal(UUID personal_id) {
        return iServicioRepository.findServiciosByPersonal(personal_id);
    }

    public List<Servicios> findServiciosByDepartamento(String departamento) {
        return iServicioRepository.findServiciosByDepartamento(departamento);
    }

}
