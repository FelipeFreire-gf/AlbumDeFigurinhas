package view;

import java.util.Scanner;
import modelo.Desenhos;

public class TelaMenu extends Desenhos {

	public static String opcaoMenu() {
		// tentativa menu

		Scanner scan = new Scanner(System.in);
		String opcao;

		System.out.println("------------------------");
		System.out.println("          OPCAO         ");
		System.out.println(" 1. Cadastrar Album     ");
		System.out.println(" 2. Alterar Album       ");
		System.out.println(" 3. Listar Album        ");
		System.out.println(" 4. Deletar Album   " + "\n");

		System.out.println(" 5. Cadastrar Figurinha ");
		System.out.println(" 6. Alterar Figurinha   ");
		System.out.println(" 7. Listar Figurinha    ");
		System.out.println(" 8. Deletar Figurinha   ");
		System.out.println(" 9.        SAIR         ");
		opcao = scan.nextLine();
		return opcao;
	}

	public static void codigo() {

		Desenhos desenhos = new Desenhos();
		int end = 0; 
		Scanner scan = new Scanner(System.in);

		do {
			switch (opcaoMenu()) {
			case "1":
				// Cadastrar:
				System.out.println("Cadastrar Album: ");
				System.out.println("Nome Album: ");
				desenhos.setNomeDoAlbum(scan.nextLine());
				
		        System.out.println(desenhos.getNomeDoAlbum());
		        end = 1;
				break;
			case "2":

				break;

			case "3":

				break;

			case "4":

				break;

			case "5":

				break;
				
			case "6":

				break;

			case "7":

				break;

			case "8":

				break;	
			}
		} while (end < 9);

	}

	public static void main(String[] args) {

		opcaoMenu();
		codigo();
	}

}
