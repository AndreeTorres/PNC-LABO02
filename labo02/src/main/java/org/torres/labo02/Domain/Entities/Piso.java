package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID piso_id;

    @Column
    private String nombrePiso;

    @ManyToOne
    @JoinColumn(name="sucursal_id", nullable = false, foreignKey = @ForeignKey(name = "FK_piso_sucursal"))
    private Sucursal sucursal;

    @OneToOne
    @JoinColumn(name="boton_id",nullable = false,foreignKey = @ForeignKey(name="FK_piso_boton"))
    private Boton boton;
}
