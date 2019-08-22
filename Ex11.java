import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
		
		String verdadeiro = "Data válida";
		String falsa = "Data inválida";
		String bissexto = "Ano Bissexto";
		String bissextof = "Ano não é bissexto";
		System.out.print("Informe uma Data: ");
		
		String diad,mesd, anod;
		int vetor [] = new int [3];
		
		do {
			System.out.print("\nDia:");
			diad = entrada.nextLine();
			if(diad.length() != 2)
				System.out.println("Padrão Invalido\nDD/MM/AAAA");
		}while(diad.length() != 2);
		
		int dia = Integer.parseInt(diad);
		
		do {
			System.out.print("Mês:");
			mesd = entrada.nextLine();
			if(mesd.length() != 2)
				System.out.println("Padrão Invalido\nDD/MM/AAAA");
		}while(mesd.length() != 2);
		
		int mes = Integer.parseInt(mesd);
		
		do {
			System.out.print("Ano:");
			anod = entrada.nextLine();
			if(anod.length() != 4)
				System.out.println("Padrão Invalido\nDD/MM/AAAA");
		}while(anod.length() != 4);
		
		int ano = Integer.parseInt(anod);
		
		if ((mes < 12) && (mes > 1)) {
	
		if((mes == 4) || (mes == 6) || (mes == 9 ) || (mes == 11)) {
			if(dia <= 30 ) {
				System.out.println(verdadeiro);
			}else {
				System.out.println(falsa);	
			}
		}else if ((mes == 01) || (mes == 03) || (mes == 05) || (mes == 07) || (mes ==  8) || (mes == 10) || (mes == 12)) {
				if(dia <= 31) {
					System.out.println(verdadeiro);
				}else
					System.out.println(falsa);
			}else if(mes == 02) {
				if(dia < 29) {
					System.out.println(verdadeiro);
				}else {
					System.out.println(falsa);
				}		
		
			}
		if(ano % 4 == 0) {
					System.out.println(bissexto);
				
			}else {
				System.out.println(bissextof);
			}
		
		for(int i = 0; i < 3; i++) {
			vetor[i] = dia;
			i++;
			vetor[i] = mes;
			i++;
			vetor[i] = ano;	
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(vetor[i]+"/");
		}
		}else
			System.out.println(falsa);
	
		entrada.close();
	}
}
