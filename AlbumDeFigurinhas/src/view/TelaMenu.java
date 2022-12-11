package view;

import controle.ControleAlbumEFigurinhas;

// inicializador do sistema
public class TelaMenu extends ControleAlbumEFigurinhas {

	public static void main(String[] args) {

		inicializacao(false);
		controleGeral();
		inicializacao(true);
	}

}
