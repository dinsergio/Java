package exercicio;

import java.util.Scanner;

public class Vetor02 {
	public static void main(String[] args) {
		
		int dias;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		
		dias = scan.nextInt();
		
		switch (dias) {
		
		case 0:
			System.out.print("Domingo");
			break;
			
		case 1:
			System.out.print("Seguna-feira");
			break;
			
		case 2:
			System.out.print("Terça-feira");
			break;
			
		case 3:
			System.out.print("Quarta-feira");
			break;
			
		case 4:
			System.out.print("Quinta-feira");
			break;
			
		case 5:
			System.out.print("Sexta-feira");
			break;
			
		case 6:
			System.out.print("Sabado");
			break;
			default:
				System.out.println("num invalido");
		}
		
	}

}
