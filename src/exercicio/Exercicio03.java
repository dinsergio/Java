package exercicio;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Digite a idade: ");
		idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.print("Pode entrar");
		}else {
			System.out.println("Não tem idade para entrar");
		}
	}

}
