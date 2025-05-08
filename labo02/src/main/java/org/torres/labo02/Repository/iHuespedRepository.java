package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.torres.labo02.Domain.Entities.DTO.CreateHuespedDTO;
import org.torres.labo02.Domain.Entities.Huesped;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iHuespedRepository extends iGenericRepository<Huesped, UUID> {

    @Query(value = "SELECT h FROM Huesped h")
    public List<Huesped> getAllHuespedes();


    @Query(value = "SELECT h FROM Huesped h WHERE h.huesped_id = :id")
    public Huesped getHuespedById(@Param("id") String id);

    @Query(nativeQuery = true,
            value = "DELETE FROM Huesped WHERE huesped_id = :id")
    public void deleteHuespedById(@Param("id") UUID id);

}
