import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int vetor [] = new int[5];
		int soma= 0,mult = 1;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			System.out.print(" ---> ");
			vetor[i] = entrada.nextInt();
			soma = soma + vetor[i];
			mult = mult * vetor[i];	
		}
		System.out.print("\nOS números são:  \n| ");
		for(int i = 0; i < 5; i++) {
			System.out.print(vetor[i]+" | ");
		}
		System.out.print("\nA soma dos números é: "+soma);
		System.out.println("\nMultiplicando esses valores: "+mult);
	
		entrada.close();	
	}

}
