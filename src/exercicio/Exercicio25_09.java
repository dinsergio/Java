package exercicio;

public class Exercicio25_09 {
	
	public static void main(String[] args) {
		
		int[] vetor01 = new int[10];
		int[] vetor02 = new int[10];
		
		for(int i = 0; i < vetor01.length; i++) {
			vetor01[i] = i;
		}
		
		for(int i = 0; i < vetor01.length; i++) {
			vetor02[i] = i;
		}
		
		for(int i = 0; i < vetor01.length; i++) {
			System.out.print(vetor02[i]);
		}
	}

}
