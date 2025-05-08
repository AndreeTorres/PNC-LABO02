package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.Salon;

import java.util.UUID;

public interface iSalonRepository extends iGenericRepository<Salon, UUID> {


    @Query(value = "SELECT s FROM Salon s WHERE s.salon_id = :salon_id")
    public Salon findSalonBySalon_id(@Param("salon_id") UUID salon_id);

    @Query(nativeQuery = true,
    value = "SELECT * FROM Salon WHERE Salon.nombreSalon = :nombreSalon")
    public Salon findSalonByNombreSalon(@Param("nombreSalon") String nombreSalon);

}
