import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String txt = " ";
		System.out.print("Insira o texto \n --->");
		txt = entrada.nextLine();
		char letras[] = txt.toCharArray();
		for(int i = 0; i < txt.length();i++) {
			System.out.print(letras[i]+ " | ");
		}
		
			entrada.close();
	
	}

}
