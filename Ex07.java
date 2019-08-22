import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float mediat[] = new float[4];
		float media = 0;
		int aluno = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nAluno número "+(i + 1)+" ");
			System.out.println("Digite suas notas:\n");

			for (int i1 = 0; i1 < 1; i1++) {
				System.out.print("Nota 1:" );
				float nota1 = entrada.nextFloat();
				System.out.print("Nota 2:" );
				float nota2 = entrada.nextFloat();
				System.out.print("Nota 3:" );
				float nota3 = entrada.nextFloat();
				System.out.print("Nota 4:" );
				float nota4 = entrada.nextFloat();
				media = ((nota1 + nota2 +nota3 + nota4) / 4);
				mediat[i] = media;
				System.out.println("\nMedia do aluno: "+media);
				if(media >= 7) {
					aluno++;
				}
			}
		}
		
		System.out.println("\nQuantos alunos com a nota maior que 7,0:  "+aluno);
	
		entrada.close();
	
	}

}
