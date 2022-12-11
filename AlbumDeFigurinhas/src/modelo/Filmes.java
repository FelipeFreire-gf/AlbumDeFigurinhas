package modelo;

public class Filmes extends Album {
	
	private String franquia;
	private String anoFilme;
	
	//Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void listar() {
        System.out.println("Apresentacao do album de filme: ");
        apresentacao();
        
    }
    
    public String getFranquia() {
		return franquia;
	}

	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}

	public String getAnoFilme() {
		return anoFilme;
	}

	public void setAnoFilme(String anoFilme) {
		this.anoFilme = anoFilme;
	}

	@Override
    public String toString() {
        return "Franquia: " + franquia + "\n" +
               "Ano do filme: " + anoFilme + "\n" + "\n";
    }

}
