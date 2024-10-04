package br.com.etechoracio.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_MONITOR")
@Getter
@Setter
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_monitor")
    private Long monitor;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_foto")
    private String foto;

    @Column(name = "tx_whatsapp")
    private String whatsapp;

    @Column(name = "tx_email")
    private String email;

    @Column(name = "tx_conteudo")
    private String conteudo;

    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;


}
