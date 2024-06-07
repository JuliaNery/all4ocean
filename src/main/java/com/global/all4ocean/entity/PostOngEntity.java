package com.global.all4ocean.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_post_ong")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class PostOngEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private Long id;
    @Column(name = "foto_post")
    private String urlFoto;
    @Column(name = "descricao_post")
    private String descricao;
    @Column(name = "data_post")
    private LocalDate dataPost;
    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private ProjetoOngEntity projetoOng;
}
