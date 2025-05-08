package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Habitacion;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iHabitacionRepository extends iGenericRepository<Habitacion, UUID>{

    List<Habitacion> findAll();

    @Query(value = "SELECT h FROM Habitacion h WHERE h.piso = :pisoId")
    public List<Habitacion> findHabitacionByPiso(@Param("pisoId") UUID pisoId);


    @Query(nativeQuery = true,
    value = "SELECT * FROM Habitacion WHERE Habitacion.nombreHabitacion = :nombreHabitacion")
    public Habitacion findHabitacionByHabitacion_id(@Param("habitacion_id") UUID habitacion_id);

}
