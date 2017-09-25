package exercicio;

import java.util.Scanner;

import java.util.Scanner;

public class Vetor02_1 {
	
public static void main(String[] args) {
		
		String[] dias = {"Domingo", "Segunda-feira", "Teça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o dia da semana, sabendo que:"
				+"\n0 = Domingo\r\n" +
				"\n1 = Segunda-feira\r\n" +
				"\n2 = Terça-feira\r\n" +
				"\n3 = Quarta-feira\r\n" +
				"\n4 = Quinta-feira\r\n" +
				"\n5 = Sexta-feira\r\n" +
				"\n6 = Sabado\r\n" +
				 "Entre com o dia: ");
		
		int dia = scan.nextInt();
		scan.close();
		
		if((dia >= 0) && (dia < 7)) {
			System.out.println(dias[dia]);
		}else {
			System.out.println("Dias invalidos");
		}
		
	}

}

