package com.poo.sts.exemplo.resource;

import com.poo.sts.exemplo.model.Cidade;
import com.poo.sts.exemplo.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class cidadeResource {
    @Autowired
    CidadeService servCidade;
    @GetMapping("/list")
    public List<Cidade> listaTodas() {
        return servCidade.listaTodasCidades();
    }
    @GetMapping("/{id}")
    public Cidade buscarCidade(@PathVariable Integer id) {
        return servCidade.buscaPorCodigo(id);
    }
    @PostMapping()
    public Cidade cadastrar(@RequestBody Cidade c) {
        return servCidade.insereCidade(c);
    }
    @GetMapping("/nome/{nome}")
    public Cidade buscarCidade(@PathVariable String nome) {
        return servCidade.buscarPorNome(nome);
    }
}
