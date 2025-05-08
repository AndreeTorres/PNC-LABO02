package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolP {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String rol_id;

    @Column
    private String nombreRol;

}
