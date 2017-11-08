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
	
		Pessoa pessoa = new Pessoa("max", "05788385750");
		Exemplar[] exemplares = new Exemplar[1];
		LocalDate hoje = LocalDate.now();
		exemplares[0] = new Exemplar("Harry Potter", "novo", hoje, new SetorBiblioteca("1ª Estante", "5ª prateleira"),
				new Obra("ISBN 978-3-345-78", "Harry Potter", "Rocco", "Fantasia", "1ª Ed", new Autor("J.K.Rowling")));
		
		Emprestimo emprestimo = new Emprestimo(1, pessoa, exemplares[], "novo", hoje);
		
	}
	
	
	

}
