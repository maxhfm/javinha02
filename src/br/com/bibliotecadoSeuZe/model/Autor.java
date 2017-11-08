package br.com.bibliotecadoSeuZe.model;

public class Autor {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor(String nome) {
		super();
		this.nome = nome;
	}

	public Autor() {
		super();
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + "]";
	}
	
	

}
