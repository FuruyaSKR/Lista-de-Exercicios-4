import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int[] vetor = new int[5];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextInt();
		}
			for (int x = 0; x < 5; x++) {
				System.out.print(" | "+vetor[x]);

			}
			System.out.print(" | ");
			entrada.close();
		}	
	}