import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o tamanho do vetor: ");
		int tam = entrada.nextInt();
		
		int vetor[] = new int[tam];
		int num = -1, cont = 0;
		String graf = "#";
		
		for(int i = 0; i < tam; i++){
			System.out.print("\nDigite um número: ");
			num = entrada.nextInt();
			if(num >= 0 && num <= 20) {
				vetor[cont] = num;
				cont++;
			}
		}
	
		System.out.println("\nGráfico");
		
		for(int i = 0; i < cont;i++) {
			System.out.print("\n"+vetor[i]+" ");
			for(int j = 0; j < vetor[i];j++) {
				System.out.print(graf);
			}
		}	
	
		entrada.close();
	}

}
