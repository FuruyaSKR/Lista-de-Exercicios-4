import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float [] vetor = new float[4];
		float media = 0;
		for(int i = 0; i < 4;i++) {
			System.out.print("Digite a nota "+(i + 1)+": ");
			vetor[i] = entrada.nextFloat();
			media = media + vetor[i];
		}
		
		System.out.println("Média do Aluno: "+(media / 4));
	
		entrada.close();
	}
}
