package exercicio;

import java.util.Scanner;

public class Vetor04 {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Informe o nome: ");
			nomes[i] = scan.nextLine();
		}
		scan.close();
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
