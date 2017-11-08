package br.com.bibliotecadoSeuZe.model;

import java.time.LocalDate;

public class Exemplar {

	private String nome;
	private String status;
	private LocalDate dataInclusao;
	private SetorBiblioteca setor;
	private Obra obra;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public SetorBiblioteca getSetor() {
		return setor;
	}

	public void setSetor(SetorBiblioteca setor) {
		this.setor = setor;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public Exemplar() {
		super();
	}

	public Exemplar(String nome, String status, LocalDate dataInclusao, SetorBiblioteca setor, Obra obra) {
		super();
		this.nome = nome;
		this.status = status;
		this.dataInclusao = dataInclusao;
		this.setor = setor;
		this.obra = obra;
	}

	@Override
	public String toString() {
		return "Exemplar [nome=" + nome + ", status=" + status + ", dataInclusao=" + dataInclusao + ", setor=" + setor
				+ ", obra=" + obra + "]";
	}
	
	


}
