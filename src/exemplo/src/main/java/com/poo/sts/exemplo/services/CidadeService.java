package com.poo.sts.exemplo.services;

import com.poo.sts.exemplo.model.Cidade;
import com.poo.sts.exemplo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    @Autowired
    CidadeRepository repoCidade;
    public Cidade insereCidade(Cidade c) {
        return repoCidade.save(c);
    }
    public Cidade alteraCidade(Cidade c) {
        return repoCidade.save(c);
    }
    public Cidade buscaPorCodigo (int id) {
        return repoCidade.findById(id).orElse(null);
    }
    public void excluiCidade (Cidade c) {
        repoCidade.delete(c);
    }
    public List<Cidade> listaTodasCidades () {
        return repoCidade.findAll();
    }
    public Cidade buscarPorNome(String nome) {
        return repoCidade.findByNome(nome);
    }
}
