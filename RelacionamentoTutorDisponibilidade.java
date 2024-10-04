package br.com.etechoracio.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_REL_TUTOR_DISPONIBILIDADE")
public class RelacionamentoTutorDisponibilidade {
    @Id
    private Long id_monitor;
    @Id
    private Long id_disponibilidade;


    @JoinColumn(name = "id_monitor")
    private Monitor monitor;

    @JoinColumn(name = "id_disponibilidade")
    private Disponibilidade disponibilidade;
}
