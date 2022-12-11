package modelo;

public class AppAlbum {
	
	 public static void main(String[] args) {
		 
		  Desenhos desenhos = new Desenhos();
		  
		  System.out.println("####################################################");
		  desenhos.setNomeDoAlbum("Harry Potter - Bruxos e Bruxas");
		  desenhos.setEditora("Panini");
		  desenhos.setPaisEditora("USA");
		  desenhos.setEdicao("1ª");
		  desenhos.setPaisOrigem("USA");
		  desenhos.setDataLancamento("2017");
		  desenhos.setTipoAnimacao("Filme");
		  desenhos.setFranquiaAnimacao("Harry Potter");
		  
		  desenhos.listar();
		  
		  System.out.print(desenhos);
		  System.out.println("####################################################");
		 
	 }

}
