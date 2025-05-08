package org.torres.labo02.Services;

import org.torres.labo02.Domain.Entities.Habitacion;
import org.torres.labo02.Repository.iHabitacionRepository;

import java.util.List;
import java.util.UUID;

public class HabitacionService {

    private iHabitacionRepository habitacionRepository;

    public void createHabitacion(Habitacion habitacion) {
        habitacionRepository.save(habitacion);
    }

    public List<Habitacion> findAllHabitacines(){
        return habitacionRepository.findAll();
    }

    public List<Habitacion> findHabitacionByPiso(UUID idPiso){
        return habitacionRepository.findHabitacionByPiso(idPiso);
    }

    public Habitacion findHabitacionByHabitacion_id(UUID idHabitacion){
        return habitacionRepository.findHabitacionByHabitacion_id(idHabitacion);
    }
}
