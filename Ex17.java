import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean sair = false;
		int cont = 0;
		
		String[] nome = new String[10];
		String[] sobrenome = new String[10];
		String[] tel = new String[10];
		String[] cel = new String[10];
		String[] email = new String[10];
		String[] nasc = new String[10];
		

		while (sair != true) {
			System.out.println("\n1 - Criar um novo contato \n2 - Ler todos os contatos \n3 - Consulta de dados \n4 - Sair");
			int val = entrada.nextInt();

			switch (val) {
			case 1:
				System.out.println("\nCriar novo Contato");

				System.out.print("\nInforme o Primeiro Nome do Contato: ");
				nome[cont] = entrada.next();
				
				System.out.print("\nInforme o Sobrenome do Contato: ");
				sobrenome[cont] = entrada.next();

				System.out.print("\nTelefone do contato: ");
				tel[cont] = entrada.next();

				System.out.print("\nCelular do contato: ");
				cel[cont] = entrada.next();

				System.out.print("\nEmail do contato: ");
				email[cont] = entrada.next();

				do {
					System.out.print("\nData de nascimento: ");
					nasc[cont] = entrada.next();
					if (nasc[cont].length() != 8)
						System.out.println("Padrão Invalido\nDD/MM/AAAA (Sem Barras)");
				} while (nasc[cont].length() != 8);

				cont++;
			
			break;
			case 2:
				
				for (int i = 0; i < cont; i++) {
					System.out.println("\n----------------------------------------------------");
					System.out.print("\nContato" + (i + 1));
					System.out.print("\nNome Completo: " +nome[i]);
					System.out.print("\nTelefone: " +tel[i]);
					System.out.print("\nCelular: " +cel[i]);
					System.out.print("\nE-mail: " +email[i]);
					System.out.print("\nData de Nascimento: " +nasc[i]+"\n");
				}
			
			break;
			case 3:
				
				System.out.println("1 - Consulta por nome ou sobrenome \n2 - Aniversários do mês");
				int menu2 = entrada.nextInt();
				
				switch (menu2) {
				
				case 1:
					System.out.println("Qual Nome ou Sobrenome você quer consultar?");
					String consulta = entrada.next();
					
					for (int k = 0; k < 10; k++) {

						if (consulta.compareTo(sobrenome[k]) == 0 || consulta.compareTo(nome[k]) == 0) {
							System.out.println("\n----------------------------------------------------");
							System.out.print("\nContato" + (k + 1));
							System.out.print("\nNome Completo: " +nome[k]);
							System.out.print("\nTelefone: " +tel[k]);
							System.out.print("\nCelular: " +cel[k]);
							System.out.print("\nE-mail: " +email[k]);
							System.out.print("\nData de Nascimento: " +nasc[k]+"\n");

						} else
							System.out.println("nenhum nome ou sobrenome cadastrado");
					}
					
				break;
				case 2:
					
					System.out.print("Informe um mês: ");
					String mes = entrada.next();

					for (int i = 0; i < cont; i++) {
						if (mes.compareTo(nasc[i].substring(3, 5)) == 0) {
							System.out.println("\n----------------------------------------------------");
							System.out.print("\nNome Completo: " +nome[i]);
							System.out.print("\nTelefone: " +tel[i]);
							System.out.print("\nCelular: " +cel[i]);
							System.out.print("\nE-mail: " +email[i]);
							System.out.print("\nData de Nascimento: " +nasc[i]+"\n");
						}
					
					}
					
				break;
				}
				
			break;
			case 4:
				
				sair = true;
			
			break;
			}
		
		}
		
		entrada.close();
	
	}

}
