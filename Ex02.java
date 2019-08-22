import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		float[] vetor = new float[10];
		
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextFloat();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(vetor[i]+" | ");

			}
			
			entrada.close();
		}	
	}