package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Servicios;

import java.util.List;
import java.util.UUID;

public interface iServiciosRepository extends iGenericRepository<Servicios, UUID> {

    @Query(value = "SELECT s FROM Servicios s WHERE s.departamento = :departamento")
    public List<Servicios> getAllByDepartamento(@Param("departamento") String departamento);

    @Query(nativeQuery = true,
    value = "SELECT * FROM Servicios WHERE esCoordinador = true")
    public List<Servicios> getAllCoordinadores();


}
