package org.torres.labo02.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.torres.labo02.Domain.Entities.DTO.CreateHuespedDTO;
import org.torres.labo02.Domain.Entities.Huesped;
import org.torres.labo02.Repository.iHuespedRepository;

import java.util.List;
import java.util.UUID;

@Service
public class HuespedService {
    @Autowired
    private iHuespedRepository huespedRepository;


    public Huesped saveHuesped(CreateHuespedDTO dto) {
        Huesped huesped = new Huesped(dto);
        return huespedRepository.save(huesped);
    }

    public List<Huesped> findAllHuesped() {
        return huespedRepository.getAllHuespedes();
    }

    public Huesped getHuespedById(UUID id) {
        return huespedRepository.getHuespedById(id.toString());
    }

    public void deleteHuespedById(UUID id) {
        huespedRepository.deleteHuespedById(id);
        return;
    }

}
