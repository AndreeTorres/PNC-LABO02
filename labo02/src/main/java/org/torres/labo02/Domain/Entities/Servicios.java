package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String servicio_id;

    @Column
    private String sucursal;

    @Column
    private String departamento;

    @Column
    private Boolean esCoordinador;

    @OneToOne
    @JoinColumn(name="personal_id", nullable = false, foreignKey = @ForeignKey(name = "FK_servicio_personal"))
    private Personal personal;

}
