package modelo;

public class Disciplina {
	
	private String nomeDisciplina;
	private String ementaDisciplina;
	private Double cargaHoraria;
	private Integer diasSemana;
	private Integer quantidadeAlunos;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nomeDisciplina, String ementaDisciplina, Double cargaHoraria, Integer diasSemana, Integer quantidadeAlunos) {
		this.nomeDisciplina = nomeDisciplina;
		this.ementaDisciplina = ementaDisciplina;
		this.cargaHoraria = cargaHoraria;
		this.diasSemana = diasSemana;
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	public String toString() {
		return "Os dados informados são:\n\n"
				+"\nnomeDisciplina: " + nomeDisciplina
				+"\nementaDisciplina: " + ementaDisciplina
				+"\ncargaHoraria: " + cargaHoraria
				+"\ndiasSemana: " + diasSemana
				+"\nquantidadeAlunos: " +quantidadeAlunos;
	}
	
	public void setnomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void setementaDisciplina(String ementaDisciplina) {
		this.ementaDisciplina = ementaDisciplina;
	}
	
	public void setcargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void setdiasSemana(Integer diasSemana) {
		this.diasSemana = diasSemana;
	}
	
	public void setquantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	
	public String getnomeDisciplina() {
		return nomeDisciplina;
	}
	
	public String getementaDisciplina() {
		return ementaDisciplina;
	}
	
	public Double getcargaHoraria() {
		return cargaHoraria;
	}
	
	public Integer getdiasSemana() {
		return diasSemana;
	}
	
	public Integer getquantidadeAlunos() {
		return quantidadeAlunos;
	}
	
}
