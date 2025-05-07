package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Regalias {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String regalias_id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private Integer precioPuntos;
}
