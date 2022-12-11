package modelo;


public class Desenhos extends Album {
	
	private String tipoAnimacao;
	private String franquiaAnimacao;
	
	//Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void listar() {
        System.out.println("Apresentacao do album de desenhos: ");
        apresentacao();
        
    }

	public String getTipoAnimacao() {
		return tipoAnimacao;
	}

	public String getFranquiaAnimacao() {
		return franquiaAnimacao;
	}

	public void setFranquiaAnimacao(String franquiaAnimacao) {
		this.franquiaAnimacao = franquiaAnimacao;
	}

	public void setTipoAnimacao(String tipoAnimacao) {
		this.tipoAnimacao = tipoAnimacao;
	}
	
	 @Override
	    public String toString() {
	        return "Tipo da animacao: " + tipoAnimacao + "\n" +
	               "Franquia da Animacao: " + franquiaAnimacao + "\n";
	    }
    
    

}
