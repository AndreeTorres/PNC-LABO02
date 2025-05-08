package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Piso;

import java.util.UUID;

@Transactional
public interface iPisoRepository extends iGenericRepository<Piso, UUID> {

    @Query(value = "SELECT p FROM Piso p WHERE p.sucursal = :sucursalId")
    public Piso getPisoBySucursalId(@Param("sucursalId") UUID sucursalId);

    @Query(nativeQuery = true,
            value = "SELECT * FROM Piso WHERE Piso.nombrePiso = :nombrePiso")
    public Piso getPisoByNombrePiso(@Param("nombrePiso") String nombrePiso);
}
