package br.edu.mcesar.dao;

import java.util.List;

import br.edu.mcesar.entidades.Usuario;

public interface UsuarioDAO {

    Usuario save(Usuario usuario) throws Exception;

    Usuario edit(Usuario usuario) throws Exception;
 
    Usuario findById(Long usuarioId) throws Exception;
 
    void delete(Usuario usuario) throws Exception;
 
    List<Usuario> list() throws Exception;
}
