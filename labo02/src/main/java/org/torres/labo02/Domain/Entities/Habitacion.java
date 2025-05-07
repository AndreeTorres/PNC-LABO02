package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String habitacion_id;

    @Column(nullable = false)
    private String nombreHabitacion;

    @OneToOne
    @JoinColumn(name = "detalle_id", nullable = false, foreignKey = @ForeignKey(name = "FK_habitacion_detalle"))
    private Detalle detalle;

    @ManyToOne
    @JoinColumn(name = "piso_id", nullable = false, foreignKey = @ForeignKey(name = "FK_habitacion_piso"))
    private Piso piso;

}
