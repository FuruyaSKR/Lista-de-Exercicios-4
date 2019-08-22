import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		String[] vetor = new String[10];

		Scanner entrada = new Scanner(System.in);
		int conso = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite uma letra: ");
			vetor[i] = entrada.nextLine();

		}

		for (int i = 0; i < 10; i++) {
			if ((!("a".equalsIgnoreCase(vetor[i]))) && ((!("e".equalsIgnoreCase(vetor[i]))))
					&& ((!("i".equalsIgnoreCase(vetor[i])))) && ((!("o".equalsIgnoreCase(vetor[i]))))
					&& ((!("u".equalsIgnoreCase(vetor[i]))))) {
				conso++;
				System.out.print(vetor[i] + " | ");

			}
		}
		
		System.out.println("\nNúmero de Consoantes: " + conso);
		entrada.close();

	}
}