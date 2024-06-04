package com.poo.sts.exemplo.services;

import com.poo.sts.exemplo.model.Cidade;
import com.poo.sts.exemplo.model.Usuario;
import com.poo.sts.exemplo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repoUsuario;

    public Usuario insereUsuario(Usuario u) {
        return repoUsuario.save(u);
    }
    public Usuario alteraUsuario(Usuario u) {
        return repoUsuario.save(u);
    }
    public Usuario buscaPorCodigo (int id) {
        return repoUsuario.findById(id).orElse(null);
    }
    public void excluiUsuario (Usuario u) {
        repoUsuario.delete(u);
    }
    public List<Usuario> listaTodosUsuarios () {
        return repoUsuario.findAll();
    }
}
