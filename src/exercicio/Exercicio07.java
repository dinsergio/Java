package exercicio;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
	
	int num;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite um numero: ");
	num = scan.nextInt();
	
	if(num % 2 == 0) {
		System.out.println("Par");
	}else {
		System.out.println("Impar");
	}
	
	}

}
