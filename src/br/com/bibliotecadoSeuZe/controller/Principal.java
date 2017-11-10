package br.com.bibliotecadoSeuZe.controller;

import java.time.LocalDate;

import br.com.bibliotecadoSeuZe.model.Autor;
import br.com.bibliotecadoSeuZe.model.Emprestimo;
import br.com.bibliotecadoSeuZe.model.Exemplar;
import br.com.bibliotecadoSeuZe.model.Obra;
import br.com.bibliotecadoSeuZe.model.Pessoa;
import br.com.bibliotecadoSeuZe.model.SetorBiblioteca;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Max", "05788385750");
		LocalDate hoje = LocalDate.now();

		Emprestimo emprestimo = new Emprestimo(1, pessoa,
				new Exemplar("Harry Poter", "livre", hoje, new SetorBiblioteca("1ª estante", "2ª prateleira"),
						new Obra("BR123-45", "Harry Potter", "Rocco", "Fantasia", "1ªEd", new Autor("J.K.Rowling"))),
				"emprestado", hoje);
		emprestimo.emprestimoObra(emprestimo, pessoa.getCpf());
		
		emprestimo.listaEmprestimo();
		emprestimo.listaEmprestimoResumida();

		
		Emprestimo emprestimo2 = new Emprestimo(2, new Pessoa("Lidiane", "11134524714"),
				new Exemplar("Harry Potter Pedra Filosofal", "livre", hoje, new SetorBiblioteca("1ª estante", "2ª prateleira"),
						new Obra("BR675-78", "Harry Potter", "Rocco", "Fantasia", "1ªEd", new Autor("J.K.Rowling"))),
				"emprestado", hoje);
		emprestimo.emprestimoObra(emprestimo2, pessoa.getCpf());
		
		emprestimo.listaEmprestimo();
		emprestimo.listaEmprestimoResumida();
		
		
		emprestimo.devolucaoObra(emprestimo2, "11134524714", "BR675-78");
		

	}

}
