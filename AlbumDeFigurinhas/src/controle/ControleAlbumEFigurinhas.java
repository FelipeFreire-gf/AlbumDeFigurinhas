package controle;

import java.util.Scanner;
import modelo.Desenhos;
import modelo.Esportivos;
import modelo.Figurinha;
import modelo.Filmes;
import modelo.Figurinha;

public class ControleAlbumEFigurinhas {

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

	public static void controleGeral() {

		Desenhos desenhos = new Desenhos();
		Esportivos esportivos = new Esportivos();
		Filmes filmes = new Filmes();
		Figurinha figurinha = new Figurinha();

		String tipo;
		int end = 0, i = 0, atualizador = 0, deletar = 0, id;
		char confirmar = 'n';
		Scanner scan = new Scanner(System.in);
		String[][] carta = new String[100][10];
		String[][] album = new String[100][10];
		do {
			switch (opcaoMenu()) {
			case "1":

				System.out.println(" ESCOLHA O TIPO DE ALBUM: ");
				System.out.println("   D.      CADASTRAR ALBUM DE DESENHO    ");
				System.out.println("   E.      CADASTRAR ALBUM DE ESPORTE    ");
				System.out.println("   F.      CADASTRAR ALBUM DE FILME      ");
				tipo = scan.nextLine();
				scan.nextLine();
				switch (tipo) {

				case "d":

					// Cadastrar Album Desenho:
					System.out.println("CADASTRAR ALBUM DESENHO: ");

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
					album[i][1] = "d";
					album[i][2] = "Nome Album: " + desenhos.getNomeDoAlbum();
					album[i][3] = "Editora do Album: " + desenhos.getEditora();
					album[i][4] = "Pais da editora: " + desenhos.getPaisEditora();
					album[i][5] = "Edicao: " + desenhos.getEdicao();
					album[i][6] = "Pais origem: " + desenhos.getPaisOrigem();
					album[i][7] = "Data de lancamento: " + desenhos.getDataLancamento();
					album[i][8] = "Tipo da animacao: " + desenhos.getTipoAnimacao();
					album[i][9] = "Franquia da animacao: " + desenhos.getFranquiaAnimacao() + "\n";
					i++;
					break;

				case "e":
					// Cadastrar Album Esporte:
					System.out.println("CADASTRAR ALBUM ESPORTE: ");

					System.out.println("Nome Album: ");
					esportivos.setNomeDoAlbum(scan.nextLine());

					System.out.println("Editora do Album: ");
					esportivos.setEditora(scan.nextLine());

					System.out.println("Pais da editora: ");
					esportivos.setPaisEditora(scan.nextLine());

					System.out.println("Edicao: ");
					esportivos.setEdicao(scan.nextLine());

					System.out.println("Pais origem: ");
					esportivos.setPaisOrigem(scan.nextLine());

					System.out.println("Data de lancamento: ");
					esportivos.setDataLancamento(scan.nextLine());

					System.out.println("Evento esportivo: ");
					esportivos.setEventoEsportivo(scan.nextLine());

					System.out.println("Ano evento: ");
					esportivos.setAnoEvento(scan.nextLine());

					id = i;
					album[i][0] = "Identificador: " + Integer.toString(id);
					album[i][1] = "e";
					album[i][2] = "Nome Album: " + esportivos.getNomeDoAlbum();
					album[i][3] = "Editora do Album: " + esportivos.getEditora();
					album[i][4] = "Pais da editora: " + esportivos.getPaisEditora();
					album[i][6] = "Edicao: " + esportivos.getEdicao();
					album[i][6] = "Pais origem: " + esportivos.getPaisOrigem();
					album[i][7] = "Data de lancamento: " + esportivos.getDataLancamento();
					album[i][8] = "Evento esportivo: " + esportivos.getEventoEsportivo();
					album[i][9] = "Ano evento: " + esportivos.getAnoEvento() + "\n";
					i++;
					break;

				case "f":
					// Cadastrar Album Filme:
					System.out.println("CADASTRAR ALBUM FILME: ");

					System.out.println("Nome Album: ");
					filmes.setNomeDoAlbum(scan.nextLine());

					System.out.println("Editora do Album: ");
					filmes.setEditora(scan.nextLine());

					System.out.println("Pais da editora: ");
					filmes.setPaisEditora(scan.nextLine());

					System.out.println("Edicao: ");
					filmes.setEdicao(scan.nextLine());

					System.out.println("Pais origem: ");
					filmes.setPaisOrigem(scan.nextLine());

					System.out.println("Data de lancamento: ");
					filmes.setDataLancamento(scan.nextLine());

					System.out.println("Franquia: ");
					filmes.setFranquia(scan.nextLine());

					System.out.println("Ano do filme: ");
					filmes.setAnoFilme(scan.nextLine());

					id = i;
					album[i][0] = "Identificador: " + Integer.toString(id);
					album[i][1] = "f";
					album[i][2] = "Nome Album: " + filmes.getNomeDoAlbum();
					album[i][3] = "Editora do Album: " + filmes.getEditora();
					album[i][4] = "Pais da editora: " + filmes.getPaisEditora();
					album[i][5] = "Edicao: " + filmes.getEdicao();
					album[i][6] = "Pais origem: " + filmes.getPaisOrigem();
					album[i][7] = "Data de lancamento: " + filmes.getDataLancamento();
					album[i][8] = "Franquia: " + filmes.getFranquia();
					album[i][9] = "Ano do filme: " + filmes.getAnoFilme() + "\n";
					i++;
					break;

				default:
					System.out.println("Escolha uma opcao!");

				}

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

				if (atualizador < i && album[i][1] == "d") {

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
					album[atualizador][1] = "d";
					album[atualizador][2] = "Nome Album: " + desenhos.getNomeDoAlbum();
					album[atualizador][3] = "Editora do Album: " + desenhos.getEditora();
					album[atualizador][4] = "Pais da editora: " + desenhos.getPaisEditora();
					album[atualizador][5] = "Edicao: " + desenhos.getEdicao();
					album[atualizador][6] = "Pais origem: " + desenhos.getPaisOrigem();
					album[atualizador][7] = "Data de lancamento: " + desenhos.getDataLancamento();
					album[atualizador][8] = "Tipo da animacao: " + desenhos.getTipoAnimacao();
					album[atualizador][9] = "Franquia da animacao: " + desenhos.getFranquiaAnimacao() + "\n";

					System.out.println("\n Atualizado com sucesso! \n");

				} else if (atualizador < i && album[i][1] == "e") {

					System.out.println("Nome Album: ");
					esportivos.setNomeDoAlbum(scan.nextLine());

					System.out.println("Editora do Album: ");
					esportivos.setEditora(scan.nextLine());

					System.out.println("Pais da editora: ");
					esportivos.setPaisEditora(scan.nextLine());

					System.out.println("Edicao: ");
					esportivos.setEdicao(scan.nextLine());

					System.out.println("Pais origem: ");
					esportivos.setPaisOrigem(scan.nextLine());

					System.out.println("Data de lancamento: ");
					esportivos.setDataLancamento(scan.nextLine());

					System.out.println("Evento esportivo: ");
					esportivos.setEventoEsportivo(scan.nextLine());

					System.out.println("Ano evento: ");
					esportivos.setAnoEvento(scan.nextLine());

					album[atualizador][0] = "Identificador: " + Integer.toString(atualizador);
					album[atualizador][1] = "e";
					album[atualizador][1] = "Nome Album: " + esportivos.getNomeDoAlbum();
					album[atualizador][2] = "Editora do Album: " + esportivos.getEditora();
					album[atualizador][3] = "Pais da editora: " + esportivos.getPaisEditora();
					album[atualizador][4] = "Edicao: " + esportivos.getEdicao();
					album[atualizador][5] = "Pais origem: " + esportivos.getPaisOrigem();
					album[atualizador][6] = "Data de lancamento: " + esportivos.getDataLancamento();
					album[atualizador][7] = "Evento esportivo: " + esportivos.getEventoEsportivo();
					album[atualizador][8] = "Ano evento: " + esportivos.getAnoEvento() + "\n";

					System.out.println("\n Atualizado com sucesso! \n");

				} else if (atualizador < i && album[i][1] == "f") {

					System.out.println("Nome Album: ");
					filmes.setNomeDoAlbum(scan.nextLine());

					System.out.println("Editora do Album: ");
					filmes.setEditora(scan.nextLine());

					System.out.println("Pais da editora: ");
					filmes.setPaisEditora(scan.nextLine());

					System.out.println("Edicao: ");
					filmes.setEdicao(scan.nextLine());

					System.out.println("Pais origem: ");
					filmes.setPaisOrigem(scan.nextLine());

					System.out.println("Data de lancamento: ");
					filmes.setDataLancamento(scan.nextLine());

					System.out.println("Franquia: ");
					filmes.setFranquia(scan.nextLine());

					System.out.println("Ano do filme: ");
					filmes.setAnoFilme(scan.nextLine());

					album[atualizador][0] = "Identificador: " + Integer.toString(atualizador);
					album[atualizador][1] = "f";
					album[atualizador][2] = "Nome Album: " + filmes.getNomeDoAlbum();
					album[atualizador][3] = "Editora do Album: " + filmes.getEditora();
					album[atualizador][4] = "Pais da editora: " + filmes.getPaisEditora();
					album[atualizador][5] = "Edicao: " + filmes.getEdicao();
					album[atualizador][6] = "Pais origem: " + filmes.getPaisOrigem();
					album[atualizador][7] = "Data de lancamento: " + filmes.getDataLancamento();
					album[atualizador][8] = "Franquia: " + filmes.getFranquia();
					album[atualizador][9] = "Ano do filme: " + filmes.getAnoFilme() + "\n";

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
							if (p3 < 10) {
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
				System.out.println(album[deletar][2]);
				System.out.println("VOCE TEM CERTEZA QUE DESEJA DELETAR O ALBUM: ");
				System.out.println(" s para SIM ");
				System.out.println(" n para NAO ");

				confirmar = scan.next().charAt(0);
				if (confirmar == 's' || confirmar == 'S') {
					if (deletar < i && album[deletar][0] != null) {
						album[deletar][0] = null;
						album[deletar][1] = null;
						album[deletar][2] = null;
						album[deletar][3] = null;
						album[deletar][4] = null;
						album[deletar][5] = null;
						album[deletar][6] = null;
						album[deletar][7] = null;
						album[deletar][8] = null;
						album[deletar][9] = null;
						System.out.println("\n ALBUM DELETADO COM SUCESSO! \n");
					} else {
						System.out.println(" Identificador inexistente! ");
					}
				}
				end = 4;
				break;
				
			// opcoes das figurinhas	
			case "5":
				// Cadastrar Figurinha:
				System.out.println("CADASTRAR FIGURINHA: ");

				System.out.println("Nome figurinha: ");
				figurinha.setNomeFigurinha(scan.nextLine());

				System.out.println("Raridade: ");
				figurinha.setRaridade(scan.nextLine());

				System.out.println("Qualidade da figurinha: ");
				figurinha.setQualidadeFigurinha(scan.nextLine());

				System.out.println("Numero da figurinha: ");
				figurinha.setNumeroFigurinha(scan.nextInt());

				System.out.println("Quantidade de repetidas: ");
				figurinha.setQtdRepetidas(scan.nextInt());

				System.out.println("Valor da figurinha: ");
				figurinha.setValorFigurinha(scan.nextInt());

				id = i;
				carta[i][0] = "Identificador: " + Integer.toString(id);
				carta[i][1] = "Nome figurinha: " + figurinha.getNomeFigurinha();
				carta[i][2] = "Raridade: " + figurinha.getRaridade();
				carta[i][3] = "Qualidade da figurinha: " + figurinha.getQualidadeFigurinha();
				carta[i][4] = "Numero da figurinha: " + figurinha.getNumeroFigurinha();
				carta[i][5] = "Quantidade de repetidas: " + figurinha.getQtdRepetidas();
				carta[i][6] = "Valor da figurinha:" + figurinha.getValorFigurinha() + "\n";
				i++;
				end = 5;
				System.out.println("\n Registrado com sucesso! \n");

				break;
				
			case "6":

				// Alterar Figurinha:
				System.out.println("ALTERAR FIGURINHA: ");
				System.out.println("INFORME O IDENTIFICADOR DA FIGURINHA: ");
				atualizador = scan.nextInt();
				// \n
				scan.nextLine();

				if (atualizador < i) {

					System.out.println("Nome figurinha: ");
					figurinha.setNomeFigurinha(scan.nextLine());

					System.out.println("Raridade: ");
					figurinha.setRaridade(scan.nextLine());

					System.out.println("Qualidade da figurinha: ");
					figurinha.setQualidadeFigurinha(scan.nextLine());

					System.out.println("Numero da figurinha: ");
					figurinha.setNumeroFigurinha(scan.nextInt());

					System.out.println("Quantidade de repetidas: ");
					figurinha.setQtdRepetidas(scan.nextInt());

					System.out.println("Valor da figurinha: ");
					figurinha.setValorFigurinha(scan.nextInt());

					carta[atualizador][0] = "Identificador: " + Integer.toString(atualizador);
					carta[atualizador][1] = "Nome figurinha: " + figurinha.getNomeFigurinha();
					carta[atualizador][2] = "Raridade: " + figurinha.getRaridade();
					carta[atualizador][3] = "Qualidade da figurinha: " + figurinha.getQualidadeFigurinha();
					carta[atualizador][4] = "Numero da figurinha: " + figurinha.getNumeroFigurinha();
					carta[atualizador][5] = "Quantidade de repetidas: " + figurinha.getQtdRepetidas();
					carta[atualizador][6] = "Valor da figurinha: " + figurinha.getValorFigurinha() + "\n";

					System.out.println("\n Atualizado com sucesso! \n");

				} else {
					System.out.println("\n Identificador inexistente! \n");
				}
				end = 6;
				break;

			case "7":	
				// Listar Figurinhas
				System.out.println("LISTAR FIGURINHAS: ");
				for (int lista = 0; lista < carta.length; lista++) {
					for (int p3 = 0; p3 < carta[p3].length; p3++) {
						if (carta[lista][p3] != null) {
							if (p3 < 9) {
								System.out.println("- " + carta[lista][p3]);
							}
						} else {
							break;
						}
					}
				}
				System.out.println("----------------------------");
				end = 7;
				break;

			case "8":
				// Deletar Figurinha
				System.out.println("DELETAR FIGURINHA");
				System.out.println("INFORME O IDENTIFICADOR DA FIGURINHA A SER DELETADA: ");
				deletar = scan.nextInt();
				scan.nextLine();
				System.out.println(carta[deletar][1]);
				System.out.println("VOCE TEM CERTEZA QUE DESEJA DELETAR A FIGURINHA?: ");
				System.out.println(" s para SIM ");
				System.out.println(" n para NAO ");

				confirmar = scan.next().charAt(0);
				if (confirmar == 's' || confirmar == 'S') {
					if (deletar < i && carta[deletar][0] != null) {
						carta[deletar][0] = null;
						carta[deletar][1] = null;
						carta[deletar][2] = null;
						carta[deletar][3] = null;
						carta[deletar][4] = null;
						carta[deletar][5] = null;
						carta[deletar][6] = null;
						System.out.println("\n ALBUM DELETADO COM SUCESSO! \n");
					} else {
						System.out.println(" Identificador inexistente! ");
					}
				}
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
/*
	public static void main(String[] args) {

		inicializacao(false);
		controleGeral();
		inicializacao(true);

	}
*/
}
