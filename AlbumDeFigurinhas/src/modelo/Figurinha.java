package modelo;

public class Figurinha {

	private String nomeFigurinha, raridade, qualidadeFigurinha;
	private int numeroFigurinha, qtdRepetidas, valorFigurinha;
	
	   public void apresentacao() {
	        System.out.println("Nome figurinha: " + nomeFigurinha);
	        System.out.println("Raridade: " + raridade);
	        System.out.println("Qualidade da figurinha: " + qualidadeFigurinha);
	        System.out.println("Numero da figurinha: " + numeroFigurinha);
	        System.out.println("Quantidade de repetidas: " + qtdRepetidas);
	        System.out.println("Valor da figurinha: " + valorFigurinha);
	        
	    }

	public String getNomeFigurinha() {
		return nomeFigurinha;
	}

	public void setNomeFigurinha(String nomeFigurinha) {
		this.nomeFigurinha = nomeFigurinha;
	}

	public String getRaridade() {
		return raridade;
	}

	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}

	public String getQualidadeFigurinha() {
		return qualidadeFigurinha;
	}

	public void setQualidadeFigurinha(String qualidadeFigurinha) {
		this.qualidadeFigurinha = qualidadeFigurinha;
	}

	public int getNumeroFigurinha() {
		return numeroFigurinha;
	}

	public void setNumeroFigurinha(int numeroFigurinha) {
		this.numeroFigurinha = numeroFigurinha;
	}

	public int getQtdRepetidas() {
		return qtdRepetidas;
	}

	public void setQtdRepetidas(int qtdRepetidas) {
		this.qtdRepetidas = qtdRepetidas;
	}

	public int getValorFigurinha() {
		return valorFigurinha;
	}

	public void setValorFigurinha(int valorFigurinha) {
		this.valorFigurinha = valorFigurinha;
	}
	   
	   
	
}
