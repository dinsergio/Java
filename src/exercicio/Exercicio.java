package exercicio;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		double salario;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o salario");
		salario = scan.nextDouble();
		
		
		if((salario >= 1500.0) && (salario <=2100.0)) {
			System.out.println("Desconto é: 10%");
		}else if((salario > 2100.0) && (salario <= 3200.0)) {
			System.out.println("Desconto é: 15%");
		}else if(salario > 3200.0) {
			System.out.println("Desconto é: 22%");
		}else {
			System.out.println("Não tem desconto");
		}
	}

}
