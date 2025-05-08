package org.torres.labo02.Domain.Entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CreateHuespedDTO {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String email;
    private String password;
}
