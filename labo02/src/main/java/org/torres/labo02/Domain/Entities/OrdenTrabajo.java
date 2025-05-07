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
public class OrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ordenTrabajo_id;

    @OneToOne
    @JoinColumn(name = "habitacion_id", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenTrabajo_habitacion"))
    private Habitacion habitacion;

    @OneToOne
    @JoinColumn(name="personal_id", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenTrabajo_personal"))
    private Personal personal;

    @Column
    private String fecha;

    @Column
    private String hora;

    @Column
    private String descripcion;


}
