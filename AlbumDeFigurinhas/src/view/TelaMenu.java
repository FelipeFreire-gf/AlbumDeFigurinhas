package view;

import java.util.Scanner;
import modelo.Desenhos;

public class TelaMenu extends Desenhos {

	public static Boolean inicializacao(boolean estado) {

		if (estado == false) {
			System.out.println("Sistema inicializado" + "\n");
		} else {
			System.out.println("Sistema finalizado" + "\n");
		}

		return estado;
	}

	public static String opcaoMenu() {

		Scanner scan = new Scanner(System.in);
		String opcao;

		System.out.println("----------------------------");
		System.out.println("          OPCOES ALBUM      ");
		System.out.println(" 1. Cadastrar Album         ");
		System.out.println(" 2. Alterar Album           ");
		System.out.println(" 3. Listar Album            ");
		System.out.println(" 4. Deletar Album   " + "\n ");
		System.out.println("          OPCOES FIGURINHAS ");
		System.out.println(" 5. Cadastrar Figurinha     ");
		System.out.println(" 6. Alterar Figurinha       ");
		System.out.println(" 7. Listar Figurinha        ");
		System.out.println(" 8. Deletar Figurinha       ");
		System.out.println(" 9.        SAIR             ");
		System.out.println("----------------------------");
		opcao = scan.nextLine();
		return opcao;
	}

	public static void codigo() {

		Desenhos desenhos = new Desenhos();
		int end = 0, i = 0, atualizador = 0, deletar = 0, id;
		char confirmar = 'n';
		Scanner scan = new Scanner(System.in);
		String[] posicao = { "p1", "p2", "p3", "p4" };
		String[][] album = new String[100][10];

		do {
			switch (opcaoMenu()) {
			case "1":
				// Cadastrar Album:
				System.out.println("CADASTRAR ALBUM: ");

				System.out.println("Nome Album: ");
				desenhos.setNomeDoAlbum(scan.nextLine());

				System.out.println("Editora do Album: ");
				desenhos.setEditora(scan.nextLine());

				System.out.println("Pais da editora: ");
				desenhos.setPaisEditora(scan.nextLine());

				System.out.println("Edicao: ");
				desenhos.setEdicao(scan.nextLine());

				System.out.println("Pais origem: ");
				desenhos.setPaisOrigem(scan.nextLine());

				System.out.println("Data de lancamento: ");
				desenhos.setDataLancamento(scan.nextLine());

				System.out.println("Tipo da animacao: ");
				desenhos.setTipoAnimacao(scan.nextLine());

				System.out.println("Franquia da animacao: ");
				desenhos.setFranquiaAnimacao(scan.nextLine());

				// System.out.println(desenhos.getNomeDoAlbum());

				id = i;
				album[i][0] = "Identificador: " + Integer.toString(id);
				album[i][1] = "Nome Album: " + desenhos.getNomeDoAlbum();
				album[i][2] = "Editora do Album: " + desenhos.getEditora();
				album[i][3] = "Pais da editora: " + desenhos.getPaisEditora();
				album[i][4] = "Edicao: " + desenhos.getEdicao();
				album[i][5] = "Pais origem: " + desenhos.getPaisOrigem();
				album[i][6] = "Data de lancamento: " + desenhos.getDataLancamento();
				album[i][7] = "Tipo da animacao: " + desenhos.getTipoAnimacao();
				album[i][8] = "Franquia da animacao: " + desenhos.getFranquiaAnimacao() + "\n";
				i++;
				end = 1;
				System.out.println("\n Registrado com sucesso! \n");
				break;
			case "2":
				// Alterar Album:
				System.out.println("ALTERAR ALBUM: ");
				System.out.println("INFORME O IDENTIFICADOR DO ALBUM: ");
				atualizador = scan.nextInt();
				// \n
				scan.nextLine();

				if (atualizador < i) {
					
					System.out.println("Nome Album: ");
					desenhos.setNomeDoAlbum(scan.nextLine());

					System.out.println("Editora do Album: ");
					desenhos.setEditora(scan.nextLine());

					System.out.println("Pais da editora: ");
					desenhos.setPaisEditora(scan.nextLine());

					System.out.println("Edicao: ");
					desenhos.setEdicao(scan.nextLine());

					System.out.println("Pais origem: ");
					desenhos.setPaisOrigem(scan.nextLine());

					System.out.println("Data de lancamento: ");
					desenhos.setDataLancamento(scan.nextLine());

					System.out.println("Tipo da animacao: ");
					desenhos.setTipoAnimacao(scan.nextLine());

					System.out.println("Franquia da animacao: ");
					desenhos.setFranquiaAnimacao(scan.nextLine());

					album[atualizador][0] = "Identificador: " + Integer.toString(atualizador);
					album[atualizador][1] = "Nome Album: " + desenhos.getNomeDoAlbum();
					album[atualizador][2] = "Editora do Album: " + desenhos.getEditora();
					album[atualizador][3] = "Pais da editora: " + desenhos.getPaisEditora();
					album[atualizador][4] = "Edicao: " + desenhos.getEdicao();
					album[atualizador][5] = "Pais origem: " + desenhos.getPaisOrigem();
					album[atualizador][6] = "Data de lancamento: " + desenhos.getDataLancamento();
					album[atualizador][7] = "Tipo da animacao: " + desenhos.getTipoAnimacao();
					album[atualizador][8] = "Franquia da animacao: " + desenhos.getFranquiaAnimacao() + "\n";

					System.out.println("\n Atualizado com sucesso! \n");

				} else {
					System.out.println("\n Identificador inexistente! \n");
				}
				end = 2;
				break;

			case "3":
				// Listar Album
				System.out.println("LISTAR ALBUNS: ");
				for (int lista = 0; lista < album.length; lista++) {
					for (int p3 = 0; p3 < album[p3].length; p3++) {
						if (album[lista][p3] != null) {
							if (p3 < 9) {
								System.out.println("- " + album[lista][p3]);
							}
						} else {
							break;
						}
					}
				}
				System.out.println("----------------------------");
				end = 3;
				break;

			case "4":
				// Deletar Album
				System.out.println("DELETAR ALBUM ");
				
				System.out.println("INFORME O IDENTIFICADOR DO ALBUM A SER DELETADO: ");
				deletar = scan.nextInt();
				scan.nextLine();
				System.out.println(album[deletar][1]);
				System.out.println("VOCE TEM CERTEZA QUE DESEJA DELETAR O ALBUM: ");
				System.out.println(" s para SIM ");
				System.out.println(" n para NAO ");
				
				
				confirmar = scan.next().charAt(0);
					if(confirmar == 's' || confirmar == 'S') {
						if(deletar < i && album[deletar][0] != null) {
							album[deletar][0] = null;
							album[deletar][1] = null;
							album[deletar][2] = null;
							album[deletar][3] = null;
							album[deletar][4] = null;
							album[deletar][5] = null;
							album[deletar][6] = null;
							album[deletar][7] = null;
							album[deletar][8] = null;
							System.out.println("\n ALBUM DELETADO COM SUCESSO! \n");
						}else {
							System.out.println(" Identificador inexistente! ");
						}	
					}
				end = 4;
				break;

			case "5":

				end = 5;
				break;

			case "6":

				end = 6;
				break;

			case "7":

				end = 7;
				break;

			case "8":

				end = 8;
				break;

			case "9":

				end = 9;
				break;

			default:
				System.out.println("Escolha uma opcao!");
			}
		} while (end < 9);

	}

	public static void main(String[] args) {

		inicializacao(false);
		codigo();
		inicializacao(true);
	}

}
