package br.com.lovefood.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.lovefood.entity.Funcionario;

public class FuncionarioDAO extends ConnectionDAO {
	
	private Connection conn = null;
	
	public FuncionarioDAO() {
		try {
			conn = getConnection();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public void save(Funcionario f) throws SQLException {
			PreparedStatement stmt = null;
			try {
		
				if(f.getId() == null) {
					stmt = conn.prepareStatement("insert into funcionario values (null, ?, ?, md5(?), ?)");
		
				}else {
					stmt = conn.prepareStatement("update funcionario set nome = ? login = ? where id = ?");		
				}
				
				stmt.setString(1, f.getNome());
				stmt.setString(2, f.getLogin());
				
				if(f.getId() != null) {
					stmt.setLong(3, f.getId());
				}else {
					stmt.setString(3, f.getSenha());
					stmt.setString(4, f.getNivel().toString());
				}
				
				int count = stmt.executeUpdate();
				
				if(count == 0)
					throw new SQLException("Erro ao gravar o funcionario");
			}finally {
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
		}
	}
		public void delete(Long id) throws SQLException {
			PreparedStatement stmt = null;
			
			try {
				stmt = conn.prepareStatement("delete from funcionario where id = ?");
				stmt.setLong(1,  id);
				
				int count = stmt.executeUpdate();
				
				if (count == 0)
					throw new SQLException("Erro ao excluir o funcionario");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		}
}
