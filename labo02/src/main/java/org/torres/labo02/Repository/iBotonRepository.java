package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.torres.labo02.Domain.Entities.Boton;

import java.util.List;
import java.util.UUID;

public interface iBotonRepository extends iGenericRepository<Boton, UUID> {

    @Query(value = "SELECT b FROM Boton b")
    public List<Boton> getBotonByNombreBoton(String nombreBoton);

    @Query(nativeQuery = true,
            value = "SELECT * FROM Boton WHERE boton_id = :id")
    public Boton getBotonById(UUID id);

}
