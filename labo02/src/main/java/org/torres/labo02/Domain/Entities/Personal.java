package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String personal_id;

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

    @OneToOne
    @JoinColumn(name ="rol_id", nullable = false, foreignKey = @ForeignKey(name = "FK_personal_rol"))
    private RolP rolP;


}
