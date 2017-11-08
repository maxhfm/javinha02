package br.com.bibliotecadoSeuZe.model;

public class SetorBiblioteca {

	private String estante;
	private String prateleira;

	public SetorBiblioteca(String estante, String prateleira) {
		super();
		this.estante = estante;
		this.prateleira = prateleira;
	}

	public SetorBiblioteca() {
		super();
	}

	@Override
	public String toString() {
		return "SetorBiblioteca [estante=" + estante + ", prateleira=" + prateleira + "]";
	}

}
