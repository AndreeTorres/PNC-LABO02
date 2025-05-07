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
public class Boton {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID boton_id;

    @Column
    private String nombreBoton;

}
