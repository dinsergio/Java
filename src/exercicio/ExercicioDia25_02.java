package exercicio;

public class ExercicioDia25_02 {
	
	public static void main(String[] args) {
		
		int[] vetor01 = new int[8];
		int[] vetor02 = new int[8];
		
		for(int i = 0; i < vetor01.length; i++) {
			vetor01[i] = i * 2;
		}
		
		for(int i = 0; i < vetor01.length; i++) {
			vetor02[i] = i;
		}
		
		for(int i = 0; i < vetor01.length; i++) {
			System.out.print(vetor02[i]);
		}
		
	}

}
