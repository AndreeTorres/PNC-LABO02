package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Turno;

import java.util.List;
import java.util.UUID;

public interface iTurnoRepository extends iGenericRepository<Turno, UUID> {

    List<Turno> findAll();

    @Query(value = "SELECT t FROM Turno t WHERE t.turno = :turno")
    public List<Turno> getAllByTurno(@Param("turno") String turno);

    @Query(nativeQuery = true,
    value = "SELECT * FROM Turno WHERE turno_id = :id")
    public Turno getTurnoById(@Param("id") UUID id);

}
