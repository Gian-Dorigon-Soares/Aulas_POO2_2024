package com.poo.sts.exemplo.resource;

import com.poo.sts.exemplo.model.Usuario;
import com.poo.sts.exemplo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class usuarioResource {
    @Autowired
    UsuarioService servUsuario;

    @GetMapping
    public List<Usuario> listaTodos() {
        return servUsuario.listaTodosUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return servUsuario.buscaPorCodigo(id);
    }
    @PostMapping
    public Usuario cadastra(@RequestBody Usuario u) {
        return servUsuario.insereUsuario(u);
    }
}
