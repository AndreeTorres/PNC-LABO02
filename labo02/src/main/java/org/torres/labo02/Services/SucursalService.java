package org.torres.labo02.Services;

import org.torres.labo02.Domain.Entities.Sucursal;
import org.torres.labo02.Repository.iSucursalRepository;

import java.util.List;
import java.util.UUID;

public class SucursalService {

    private iSucursalRepository sucursalRepository;

    public List<Sucursal> findAllSucursal() {
        return sucursalRepository.findAll();
    }

    public Sucursal findSucursalByNombre(UUID id) {
        return sucursalRepository.findByNombreSucursal(id.toString());
    }

    public Sucursal findSucursalByDireccion(UUID id) {
        return sucursalRepository.findByDireccionSucursal(id.toString());
    }

 }
