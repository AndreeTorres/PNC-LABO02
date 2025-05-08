package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.torres.labo02.Domain.Entities.Personal;
import org.torres.labo02.Domain.Entities.Servicios;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iServiciosRepository extends iGenericRepository<Servicios, UUID> {

    @Query(value = "SELECT s FROM Servicios s WHERE s.personal.personal_id = :personal_id")
    public List<Servicios> findServiciosByPersonal(UUID personal_id);

    @Query(nativeQuery = true,
          value = "SELECT * FROM Servicios WHERE Servicios.departamento = :departamento")
    public List<Servicios> findServiciosByDepartamento(String departamento);

}
