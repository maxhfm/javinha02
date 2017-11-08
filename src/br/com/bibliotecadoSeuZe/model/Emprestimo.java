package br.com.bibliotecadoSeuZe.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Emprestimo {

	private long numero;
	private Pessoa pessoa;
	private Exemplar exemplar;
	private Exemplar[] exemplares;
	private String status;
	LocalDate dataEmprestimo = LocalDate.now();
	
	public LocalDate previsaoDevolucao() {
		return dataEmprestimo.plusDays(7);
	}

	public void reciboRegistroEmprestimo(){
		System.out.println("-------REGISTRO DO EMPRESTIMO-----------");
		System.out.println("Num do Emprestimo: " + this.numero);
		System.out.println("Nome: " + this.pessoa.getNome());
		System.out.println("CPF: " + this.pessoa.getCpf());
		System.out.println("Qtd de Obras emprestas:" + qtdObrasEmprestada());
		System.out.println("Obra emprestada: " + exemplares[0]);
		if(qtdObrasEmprestada() >= 1)
		System.out.println("Obra emprestada: " + exemplares[1]);
		System.out.println("Data do Emprestimo: " + dataEmprestimo);
		System.out.println("----------------------------------------");
		System.out.println("Data Devolução: " + dataDevolucao());
		System.out.println("----------------------------------------");
		System.out.println("Status: " + exemplar.getStatus());
		
	}
	
	public int qtdObrasEmprestada(){
		return exemplares.length + 1;
	}

	public LocalDate dataDevolucao(){
		return dataEmprestimo.plusDays(7);
	}
	
	@Override
	public String toString() {
		return "Emprestimo [numero=" + numero + ", pessoa=" + pessoa + ", exemplares=" + Arrays.toString(exemplares)
				+ ", status=" + status + ", dataEmprestimo=" + dataEmprestimo + "]";
	}

	public Emprestimo() {
		super();
	}

	public Emprestimo(long numero, Pessoa pessoa, Exemplar[] exemplares, String status, LocalDate dataEmprestimo) {
		super();
		this.numero = numero;
		this.pessoa = pessoa;
		this.exemplares = exemplares;
		this.status = status;
		this.dataEmprestimo = dataEmprestimo;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Exemplar[] getExemplares() {
		return exemplares;
	}

	public void setExemplares(Exemplar[] exemplares) {
		this.exemplares = exemplares;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


}
