package modelo;

public class AppAlbum {
	
	 public static void main(String[] args) {
		 
		  Desenhos desenhos = new Desenhos();
		  Esportivos esportivos = new Esportivos();
		  Filmes filmes = new Filmes();
		  
		  System.out.println("####################################################");
		  desenhos.setNomeDoAlbum("Dragon Ball Z - Universe");
		  desenhos.setEditora("Panini");
		  desenhos.setPaisEditora("Filial BR");
		  desenhos.setEdicao("1ª");
		  desenhos.setPaisOrigem("Japao");
		  desenhos.setDataLancamento("2020");
		  desenhos.setTipoAnimacao("Animacao Japonesa");
		  desenhos.setFranquiaAnimacao("Dragon Ball Super");
		  
		  desenhos.listar();
		  
		  System.out.print(desenhos);
// ------------------------------------------------------------------------------------------		
		  System.out.println("####################################################");
		  esportivos.setNomeDoAlbum("Copa do mundo Qat_ar");
		  esportivos.setEditora("Panini");
		  esportivos.setPaisEditora("Filia BR");
		  esportivos.setEdicao("1ª");
		  esportivos.setPaisOrigem("Brasil");
		  esportivos.setDataLancamento("2022");
		  esportivos.setEventoEsportivo("Copa");
		  esportivos.setAnoEvento("2022");
		  
		  esportivos.listar();
		  
		  System.out.print(esportivos);
// ------------------------------------------------------------------------------------------					  
		  System.out.println("####################################################");
		  filmes.setNomeDoAlbum("Harry Potter - Bruxos e Bruxas");
		  filmes.setEditora("Panini");
		  filmes.setPaisEditora("Filial BR");
		  filmes.setEdicao("1ª");
		  filmes.setPaisOrigem("USA");
		  filmes.setDataLancamento("2022");
		  filmes.setFranquia("Livro Bruxos e Bruxas");
		  filmes.setAnoFilme("1997");
		  
		  filmes.listar();
		  
		  System.out.print(filmes);
	  
		 
	 }

}
