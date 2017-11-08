package br.com.bibliotecadoSeuZe.model;

import java.util.ArrayList;
import java.util.List;

public class Obra {

	private String isbn;
	private String titulo;
	private String editora;
	private String assunto;
	private String edicao;
	private List<Autor> autores = new ArrayList<>();

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Autor autor) {
		autores.add(autor);
	}

	public Obra(String isbn, String titulo, String editora, String assunto, String edicao, Autor autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.editora = editora;
		this.assunto = assunto;
		this.edicao = edicao;
		this.autores = autores;
	}

	/*
	 * public Obra(String isbn, String titulo, String editora, String assunto,
	 * String edicao, List<Autor> autores) { super(); this.isbn = isbn;
	 * this.titulo = titulo; this.editora = editora; this.assunto = assunto;
	 * this.edicao = edicao; this.autores = autores; }
	 */

	public Obra() {
		super();
	}

	@Override
	public String toString() {
		return "Obra [isbn=" + isbn + ", titulo=" + titulo + ", editora=" + editora + ", assunto=" + assunto
				+ ", edicao=" + edicao + ", autores=" + autores + "]";
	}

}
