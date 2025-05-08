package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HuespedXHabitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHuespedXHabitacion;

    @OneToOne
    @JoinColumn(name="pago_id", nullable = false, foreignKey = @ForeignKey(name = "FK_huespedXHabitacion_pago"))
    private Pago pago;

    @OneToOne
    @JoinColumn(name="huesped_id", nullable = false, foreignKey = @ForeignKey(name = "FK_huespedXHabitacion_huesped"))
    private Huesped huesped;

    @OneToOne
    @JoinColumn(name="habitacion_id", nullable = false, foreignKey = @ForeignKey(name = "FK_huespedXHabitacion_habitacion"))
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name="personal_id", nullable = false, foreignKey = @ForeignKey(name = "FK_huespedXHabitacion_personal"))
    private Personal personal;

    @Column
    private String fechaIngreso;

    @Column
    private String fechaSalida;

    @Column
    private Boolean estado;

}
