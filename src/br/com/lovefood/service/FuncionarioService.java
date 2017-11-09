package br.com.lovefood.service;

import java.sql.SQLException;

import br.com.lovefood.entity.Funcionario;
import br.com.lovefood.persistence.FuncionarioDAO;

public class FuncionarioService {
	
	private FuncionarioDAO dao;
	
	public FuncionarioService() {
		dao = new FuncionarioDAO();
	}
	
	public boolean salvar(Funcionario f) {
		try {
			dao.save(f);
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
