package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.torres.labo02.Domain.Entities.Detalle;

import java.util.List;
import java.util.UUID;

public interface iDetalleRepository extends iGenericRepository<Detalle, UUID> {

    List<Detalle> findAll();

    @Query(value = "SELECT d FROM Detalle d")
    public List<Detalle> getAllDetalles(UUID id);

    @Query(nativeQuery = true,
        value = "SELECT * FROM Detalle WHERE detalle_id = :id")
    public Detalle getDetalleById(UUID id);

}
