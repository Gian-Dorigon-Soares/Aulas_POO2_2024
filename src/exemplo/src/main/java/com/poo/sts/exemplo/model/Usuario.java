package com.poo.sts.exemplo.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @ManyToOne
    private Cidade cidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Usuario() {

    }

    public Usuario(Integer id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
