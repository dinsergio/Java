package br.com.lovefood.entity;

public class Cliente extends Usuario {
	
	private String cpf;
	private String endereco;
	private String telefone;
	
	public Cliente() {		
	}
	
	public String getCpf() {
		return cpf;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getEndereco() {		
		return endereco;
	}
	public void setEndereco() {	
		this.endereco = endereco;
	}
	
	public String getTelefone() {		
		return telefone;
	}
	public void setTelefone() {	
		this.telefone = telefone;
	}

}
