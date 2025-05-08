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
public class Puntos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer puntos_id;

    @Column
    private Integer puntos;

    @OneToOne
    @JoinColumn(name="huesped_id", nullable = false, foreignKey = @ForeignKey(name = "FK_puntos_huesped"))
    private Huesped huesped;

    @OneToOne
    @JoinColumn(name="personal_id", nullable = false, foreignKey = @ForeignKey(name = "FK_puntos_personal"))
    private Personal personal;

    @Column
    private Date fecha;

}
