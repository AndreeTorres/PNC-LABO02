package org.torres.labo02.Services;

import org.torres.labo02.Domain.Entities.Salon;
import org.torres.labo02.Repository.iSalonRepository;

import java.util.List;
import java.util.UUID;

public class SalonService {
    private iSalonRepository salonRepository;

    public void createSalon(Salon salon) {
        salonRepository.save(salon);
    }

    public List<Salon> findAllSalones() {
        return salonRepository.findAll();
    }

    public Salon findSaloneById(UUID id) {
        return salonRepository.findSalonBySalon_id(id);
    }

    public Salon findSaloneByName(String name) {
        return salonRepository.findSalonByNombreSalon(name);
    }

}
