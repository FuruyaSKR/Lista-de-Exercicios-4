import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float alt[] = new float[4];
		int idade[] = new int[4];
		boolean fi = true;
		float mediaalt = 0, mediaidade = 0, maioridade = 0, maioralt = 0, menoridade = 0, menoralt = 0;
		int valori1 = 0,valori2 = 0, valori3 = 0, valori4 = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("\nPessoa " + (i + 1));
			System.out.print("Qual a sua altura? ");
			alt[i] = entrada.nextFloat();

			System.out.print("Qual a sua idade? ");
			idade[i] = entrada.nextInt();

			if (fi == true) {
				maioralt = alt[i];
				menoralt = alt[i];
				mediaalt = alt[i];
			} else if (alt[i] > maioralt) {
				maioralt = alt[i];
				valori1 = i;
			} else if (alt[i] < menoralt) {
				menoralt = alt[i];
				valori2 = i;
			}
			
			if (fi == true) {
				maioridade = idade[i];
				menoridade = idade[i];
				mediaidade = idade[i];
			} else if (idade[i] > maioridade) {
				maioridade = idade[i];
				valori3 = i;
			} else if (idade[i] < menoridade) {
				menoridade = idade[i];
				valori4 = i;
			}

			fi = false;

		}
		
		mediaalt = mediaalt / 4;
		mediaidade = mediaidade / 4;
		
		System.out.println(" \n------------------------------------------------");
		System.out.println("\nOrdem inversa");
		for (int i = 3; i > -1; i--) {
			System.out.print("\nPessoa " + (i + 1));
			System.out.print("\nIdade: "+idade[i]);
			System.out.print("\nAltura: "+alt[i]);
			System.out.println(" ");
		}
		System.out.println(" \n------------------------------------------------");
		System.out.println("\nAcima da média de Altura");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(" ");
			if(alt[i] > mediaalt)
				System.out.print("\nPessoa " + (i + 1));
				System.out.print("\nIdade: "+idade[i]);
				System.out.print("\nAltura: "+alt[i]);
		}	
		System.out.println("\n------------------------------------------------");
		System.out.println("\nA baixo da média de Altura");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("  ");
			if(alt[i] < mediaalt)
				System.out.print("\nPessoa "+(i + 1));
				System.out.print("\nIdade: "+idade[i]);
				System.out.print("\nAltura: "+alt[i]);
		}	
		System.out.println(" \n\n------------------------------------------------");
		System.out.println("\nAcima da média de Idade");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(" ");
			if(idade[i] > mediaidade)
				System.out.print("\nPessoa " + (i + 1));
				System.out.print("\nIdade: "+idade[i]);
				System.out.print("\nAltura: "+alt[i]);
		}
		
		System.out.println(" \n\n------------------------------------------------");
		System.out.println("\nA baixo da média de Idade");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(" ");
			if(idade[i] < mediaidade)
				System.out.println("\n");
				System.out.print("\nPessoa: "+(i + 1));
				System.out.print("\nIdade: "+idade[i]);
				System.out.print("\nAltura: "+alt[i]);
		}
		
		System.out.println(" \n\n------------------------------------------------");
		System.out.println("\nIdade e Altura mais velho: \nAltura: "+alt[valori3]+"\nIdade: "+idade[valori3]);
		System.out.println("\nIdade e Altura mais novo: \nAltura: "+alt[valori4]+"\nIdade: "+idade[valori4]);
		System.out.println("\nIdade e Altura mais alto: \nAltura: "+alt[valori1]+"\nIdade: "+idade[valori1]);
		System.out.println("\nIdade e Altura mais baixo: \nAltura: "+alt[valori2]+"\nIdade: "+idade[valori2]);
		System.out.println("\n------------------------------------------------");
		
		entrada.close();
	}
}
