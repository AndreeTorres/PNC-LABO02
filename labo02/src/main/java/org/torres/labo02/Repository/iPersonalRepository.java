package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Personal;

import java.util.List;
import java.util.UUID;

public interface iPersonalRepository extends iGenericRepository<Personal, UUID> {



    @Query(value = "SELECT p FROM Personal p WHERE p.nombre = :nombre")
    public List<Personal> getPersonalsByNombre(@Param("nombre") String nombre);

    @Query(nativeQuery = true,
        value = "SELECT * FROM Personal WHERE personal_id = :id")
    public Personal getPersonalsById(@Param("id") UUID id);

}
