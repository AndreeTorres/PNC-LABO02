package org.torres.labo02.Services;

import org.torres.labo02.Domain.Entities.Piso;
import org.torres.labo02.Repository.iPisoRepository;

import java.util.List;
import java.util.UUID;

public class PisoService {

    private iPisoRepository pisoRepository;

    public void createPiso(Piso piso) {
        pisoRepository.save(piso);
    }

    public List<Piso> getAllPisos() {
        return pisoRepository.findAll();
    }

    public Piso getPisoBySucursalId(UUID sucursalId) {
        return pisoRepository.getPisoBySucursalId(sucursalId);
    }

    public Piso getPisoByNombrePiso(String nombrePiso) {
        return pisoRepository.getPisoByNombrePiso(nombrePiso);
    }


}
