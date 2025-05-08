package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String salon_id;

    @Column(nullable = false)
    private String nombreSalon;

    @Column
    private String Ornamento;

    @Column
    private Integer cantMax;

    @ManyToOne
    @JoinColumn(name = "piso_id", nullable = false, foreignKey = @ForeignKey(name = "FK_salon_piso"))
    private Piso piso;

}
