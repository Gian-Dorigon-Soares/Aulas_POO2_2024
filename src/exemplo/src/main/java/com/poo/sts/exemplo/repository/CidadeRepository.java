package com.poo.sts.exemplo.repository;

import com.poo.sts.exemplo.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    public Cidade findByNome(String nome);
}
