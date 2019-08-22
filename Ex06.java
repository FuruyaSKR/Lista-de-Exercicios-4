import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tam = 5;
		int vetor[] = new int[tam];
		int par[] = new int[tam];
		int impar[] = new int[tam];

		for (int i = 0; i < tam; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextInt();
			if(vetor[i]%2 == 0) {
				par[i] = vetor[i];
			}else {
				impar[i] = vetor[i];
			}
		}
		System.out.println("\nVetor Original: ");
		for (int i = 0; i < tam; i++) {
			System.out.print(vetor[i]+" | ");	
		}
		System.out.println("\nVetor Pares:  ");
		for (int i = 0; i < tam; i++) {
			System.out.print(par[i]+" | ");	
		}
		System.out.println("\nVetor Impares: ");
		for (int i = 0; i < tam; i++) {
			System.out.print(impar[i]+" | ");	
		}
		
		entrada.close();	
	}
}
