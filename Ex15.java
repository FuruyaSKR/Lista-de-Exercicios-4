import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tam = 4;
		float alt[] = new float[tam];
		int idade[] = new int[tam];
		float mediaalt = 0;

		for (int i = 0; i < tam; i++) {
			System.out.println("\nAluno " + (i + 1));
			System.out.print("Qual a sua altura? ");
			alt[i] = entrada.nextFloat();
			
			mediaalt = alt[i] + mediaalt;
			
			System.out.print("Qual a sua idade? ");
			idade[i] = entrada.nextInt();
							
		}
		
		mediaalt = mediaalt / tam;
		System.out.println(mediaalt);
		for(int i = 0; i < tam; i++) {
		if((idade[i] > 13) && (alt[i] < mediaalt)) {
			System.out.println("\nO aluno "+(i + 1)+" tem mais que 13 anos e Altura inferior à média de altura desses alunos");
		}
	}
		entrada.close();
}
}