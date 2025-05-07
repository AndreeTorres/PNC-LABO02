package org.torres.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String guardian_id;

    @Column
    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "turno_id", nullable = false, foreignKey = @ForeignKey(name = "FK_guardian_turno"))
    private Turno turno;

    @OneToOne
    @JoinColumn(name = "piso_id", nullable = false, foreignKey = @ForeignKey(name = "FK_guardian_piso"))
    private Piso piso;


}
