package br.com.lovefood.service;

import java.sql.SQLException;

import br.com.lovefood.entity.Cliente;
import br.com.lovefood.persistence.ClienteDAO;

public class ClienteService {
	private ClienteDAO dao;
	
	public ClienteService() {
		dao = new ClienteDAO();
	}
	
	public boolean salvar(Cliente c) {
		try {
			dao.save(c);
			return Boolean.TRUE;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Boolean.FALSE;
	}
	
	public Boolean excluir(Long id) {
		try {
			dao.delete(id);
			return Boolean.TRUE;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}
