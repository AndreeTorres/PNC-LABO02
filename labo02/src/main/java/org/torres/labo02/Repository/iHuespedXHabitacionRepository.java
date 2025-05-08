package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.HuespedXHabitacion;

import java.util.List;
import java.util.UUID;

public interface iHuespedXHabitacionRepository extends iGenericRepository<HuespedXHabitacion, UUID> {


    @Query(value = "SELECT hxh  FROM HuespedXHabitacion hxh WHERE hxh.huesped = :huesped_id")
    public List<HuespedXHabitacion> getHuespedXHabitacionByHuesped(@Param("huesped_id") UUID huesped_id);


    @Query(nativeQuery = true,
        value = "SELECT * FROM HuespedXHabitacion WHERE estado = true")
    public List<HuespedXHabitacion> getActiveHuespedXHabitaciones();

}
