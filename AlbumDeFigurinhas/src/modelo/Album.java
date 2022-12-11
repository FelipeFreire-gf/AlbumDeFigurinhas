package modelo;

public abstract class Album {
	
	private String nomeDoAlbum;
	private String editora;
	private String paisEditora;
	private String edicao;
	private String imagemCapa;
	private String paisOrigem;
	private String dataLancamento;
	private Usuario usuario;
	
	public Album() {

        /*
        Quando for instanciado um objeto da classe Album, imediatamente será criado um objeto 
        cuja classe é Usuario de relacionamento por agregação simples.
         */
        this.usuario = new Usuario();

    }
	
    //Metodo publico abstrato para listar
    public abstract void listar();
    
    //Metodo para resumir a apresentacao comum em todas as classes
    public void apresentacao() {
        System.out.println("Nome do album: " + nomeDoAlbum);
        System.out.println("Editora " + editora);
        System.out.println("País da editora: " + paisEditora);
        System.out.println("Edição: " + edicao);
        System.out.println("País de origem: " + paisOrigem);
        System.out.println("Data de lançamento: " + dataLancamento);
    }
	
	
	public String getNomeDoAlbum() {
		return nomeDoAlbum;
	}
	public void setNomeDoAlbum(String nomeDoAlbum) {
		this.nomeDoAlbum = nomeDoAlbum;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getPaisEditora() {
		return paisEditora;
	}
	public void setPaisEditora(String paisEditora) {
		this.paisEditora = paisEditora;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getImagemCapa() {
		return imagemCapa;
	}
	public void setImagemCapa(String imagemCapa) {
		this.imagemCapa = imagemCapa;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	

}
