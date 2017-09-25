package exercicio;

import java.util.Scanner;

public class VetoresComPreenchimentoDinamico {
	
public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}	
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}


}
