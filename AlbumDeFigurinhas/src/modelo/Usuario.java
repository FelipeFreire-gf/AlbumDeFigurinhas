package modelo;

public class Usuario {
	
	private String nomeUser;
	private String dataNascimento;
	private char sexo;
	private String email;
	private String endereco;
	
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Nome do usuario: " + nomeUser +"\n"+ "Data de Nascimento: " + dataNascimento +"\n"+ "E-mail: " + email +"\n"+"Endereco: "+endereco+"\n";
	}
	
	

}
