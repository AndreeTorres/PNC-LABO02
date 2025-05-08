package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Sucursal;

import java.util.UUID;

@Transactional
public interface iSucursalRepository extends iGenericRepository<Sucursal, UUID> {


    @Query(value = "SELECT s FROM Sucursal s WHERE s.nombreSucursal = :nombreSucursal")
    public Sucursal findByNombreSucursal(@Param("nombreSucursal") String nombreSucursal);

    @Query(nativeQuery = true,
        value = "SELECT * FROM sucursal WHERE direccion_sucursal LIKE CONCAT('%', :direccionSucursal, '%')")
    public Sucursal findByDireccionSucursal(@Param("direccionSucursal") String direccionSucursal);

}
