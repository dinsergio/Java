package exercicio;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota");
		nota1 = scan.nextDouble();

		System.out.print("Digite a segunda nota");
		nota2 = scan.nextDouble();

		System.out.print("Digite a terceira nota");
		nota3 = scan.nextDouble();

		System.out.print("Digite a quarta nota");
		nota4 = scan.nextDouble();

		scan.close();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media < 6) {
			System.out.println("Conceito I");

		} else if ((media >= 6) && (media < 7)) {
			System.out.println("Conceito S");

		} else if ((media >= 7) && (media < 9)) {
			System.out.println("Conceito B");

		} else if (media >= 9) {
			System.out.println("Conceito O");
		}
	}

}
