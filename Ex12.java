import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite algumas palavras (Lembrando de separar sempre com ';'): ");
		String palavras = entrada.nextLine();
		
		String[] textoSeparado = palavras.split(";");

		System.out.println(Arrays.toString(textoSeparado));
		
		entrada.close();
	
		}
	}


