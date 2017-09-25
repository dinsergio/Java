package exercicio;

public class Exercicio02 {
	
	public static void main(String[]args) {
		
		int num = 30;
		int soma = 0;
		
		while(num >= 0) {
			soma = soma + num;
			System.out.println(num);
			num = num-1;
		}
		System.out.println(soma);
	}

}
