package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.OrdenTrabajo;

import java.util.List;
import java.util.UUID;

public interface iOrdenTrabajoRepository extends iGenericRepository<OrdenTrabajo, UUID> {

    @Query(value = "SELECT o FROM OrdenTrabajo o WHERE o.personal = :personal_id")
    public List<OrdenTrabajo> getOrdenTrabajoByPersonal(@Param("personal_id") UUID personal_id);

    @Query(nativeQuery = true,
    value = "SELECT * FROM OrdenTrabajo WHERE habitacin = :habitacion_id")
    public List<OrdenTrabajo> getOrdenTrabajoByHabitacion(@Param("habitacion_id") UUID habitacion_id);

}
