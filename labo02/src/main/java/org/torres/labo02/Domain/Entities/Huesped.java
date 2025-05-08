package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.torres.labo02.Domain.Entities.DTO.CreateHuespedDTO;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String huesped_id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private Date fechaNacimiento;

    @Column
    private String email;

    @Column
    private String password;


    public Huesped(CreateHuespedDTO new_Huesped){
        this.nombre = new_Huesped.getNombre();
        this.apellido = new_Huesped.getApellido();
        this.fechaNacimiento = new_Huesped.getFechaNacimiento();
        this.email = new_Huesped.getEmail();
        this.password = new_Huesped.getPassword();
    }
}
