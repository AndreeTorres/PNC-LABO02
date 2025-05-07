package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String detalle_id;

    @Column
    private String detalle;
}
