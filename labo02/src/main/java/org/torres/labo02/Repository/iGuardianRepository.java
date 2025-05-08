package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Guardian;
import org.torres.labo02.Domain.Entities.Turno;

import java.util.List;
import java.util.UUID;

public interface iGuardianRepository extends iGenericRepository<Guardian, UUID> {


    @Query(value = "SELECT g FROM Guardian g WHERE g.activo = true")
    public List<Guardian> findActiveGuardians();

    @Query(nativeQuery = true,
        value = "SELECT * FROM Guardian WHERE turno_id = :turno_id")
    public List<Guardian> findGuardianByTurno(@Param("turno_id") UUID turno_id);

}
