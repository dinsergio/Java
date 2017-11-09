package br.com.lovefood.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.lovefood.entity.Cliente;

public class ClienteDAO extends ConnectionDAO {
	private Connection conn = null;
	
		public ClienteDAO() {
			try {
				conn = getConnection();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public void save(Cliente c) throws SQLException {
			PreparedStatement stmt = null;
			try {
		
				if(c.getId() == null) {
					stmt = conn.prepareStatement("insert into cliente values (null, ?, ?, md5(?), ?)");
		
				}else {
					stmt = conn.prepareStatement("update cliente set nome = ? login = ? where id = ?");		
				}
				
				stmt.setString(1, c.getCpf());
				stmt.setString(2, c.getEndereco());
				stmt.setString(3, c.getTelefone());
				
				
				if(c.getId() != null) {
					stmt.setLong(3, c.getId());
				}else {
					stmt.setString(3, c.getSenha());
					
				}
				
				int count = stmt.executeUpdate();
				
				if(count == 0)
					throw new SQLException("Erro ao gravar o cliente");
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
				stmt = conn.prepareStatement("delete from cliente where id = ?");
				stmt.setLong(1,  id);
				
				int count = stmt.executeUpdate();
				
				if (count == 0)
					throw new SQLException("Erro ao excluir o cliente");
			}finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		}

}
