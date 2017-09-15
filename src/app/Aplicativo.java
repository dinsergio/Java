package app;

import modelo.Disciplina;

public class Aplicativo {
	public static void main(String[] args) {
		
		Disciplina d = new Disciplina();
		
		d.setnomeDisciplina("Portugues");
		d.setementaDisciplina("123");
		d.setcargaHoraria(40.);
		d.setdiasSemana(5);
		d.setquantidadeAlunos(10);
		
		System.out.println(d);
		
		
		Disciplina b = new Disciplina ("Portugues", "123", 40., 5, 10);
		
		System.out.println(b);
		
		
		
	}

}
