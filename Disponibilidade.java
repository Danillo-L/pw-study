package br.com.etechoracio.study.entity;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disponibilidade")
    private long id;

    @Column(name = "tx_dia_semana")
    private String diaSemana;

    @Column(name = "dt_das")
    private LocalDateTime das;

    @Column(name = "dt_ate")
    private LocalDateTime ate;

    @ManyToOne
    @JoinColumn(name = "id_monitor")
    private Monitor monitor;

}
