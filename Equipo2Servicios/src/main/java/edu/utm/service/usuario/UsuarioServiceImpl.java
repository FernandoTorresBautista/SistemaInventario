package edu.utm.service.usuario;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Usuario;
import edu.utm.dao.usuario.UsuarioDao;

@Named
public class UsuarioServiceImpl implements UsuarioService {
	@Inject
	UsuarioDao usuarioDao;

	public List<Usuario> findAllUsuarios() {
		return usuarioDao.findAllUsuarios();
	}

	public void updateUsuario(Usuario usuario) {
		usuarioDao.updateUsuario(usuario);
	}

	public Usuario findOneUsuario(Usuario usuario) {
		return usuarioDao.findOneUsuario(usuario);
	}

	public void insertUsuario(Usuario usuario) {
		usuarioDao.insertUsuario(usuario);
	}

	public void deleteOneUsuario(Usuario usuario) {
		usuarioDao.deleteOneUsuario(usuario);
	}
	
}
