package br.com.bibliotecadoSeuZe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Emprestimo {

	private long numero;
	private Pessoa pessoa;
	private Exemplar exemplar;
	private String status;
	LocalDate dataEmprestimo = LocalDate.now();
	private List<Emprestimo> emprestimos = new ArrayList<>();
	private int limiteObraEmprestada = 2;

	public void emprestimoObra(Emprestimo emprestimo, String cpf) {
		int qtdObraEmprestada = 0;

		for (Emprestimo e : emprestimos) {
			if (e.getPessoa().getCpf().contains(cpf) && e.getStatus().contains("emprestado"))
				;
			qtdObraEmprestada += 1;
			System.out.println("qtd obra emprestada: " + qtdObraEmprestada + "\n");
		}

		if (qtdObraEmprestada < limiteObraEmprestada) {
			emprestimos.add(emprestimo);
			System.out.println("Livro emprestado");
		} else {
			System.out.println("Livro nao emprestado");
		}
	}

	public void devolucaoObra(Emprestimo emprestimo, String cpf, String isbn) {

		for (Emprestimo e : emprestimos) {
			if (e.getExemplar().getObra().getIsbn().contains(isbn) && e.getPessoa().getCpf().contains(cpf)) {
				System.out.println("indice do cpf consultado: " + emprestimos.indexOf(emprestimo));
				emprestimos.remove(emprestimo);
				System.out.println("Emprestimo removido");
			}else{
				System.out.println("nao atendeu os parametros");
			}
		}
	}

	public void listaEmprestimo() {
		System.out.println("--------Lista de Emprestimos Completa-----------");
		for (Emprestimo e : emprestimos) {
			System.out.println(e.toString());
		}
	}

	public void listaEmprestimoResumida() {
		System.out.println("--------Lista de Emprestimos-----------");
		for (Emprestimo e : emprestimos) {
			System.out.println("Nome: " + e.getPessoa().getNome());
			System.out.println("CPF: " + e.getPessoa().getCpf());
			System.out.println("Titulo: " + e.getExemplar().getObra().getTitulo());
			System.out.println("Editora: " + e.getExemplar().getObra().getEditora());
			System.out.println("Edição: " + e.getExemplar().getObra().getEdicao());
			System.out.println("Autor(es): " + e.getExemplar().getObra().getAutores().toString());
			System.out.println("Status: " + e.getExemplar().getStatus());
			System.out.println("Data Emprestimo: " + e.getDataEmprestimo() + "\n");

		}
	}

	public Emprestimo(long numero, Pessoa pessoa, Exemplar exemplar, String status, LocalDate dataEmprestimo) {
		super();
		this.numero = numero;
		this.pessoa = pessoa;
		this.exemplar = exemplar;
		this.status = status;
		this.dataEmprestimo = dataEmprestimo;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public LocalDate dataDevolucao() {
		return dataEmprestimo.plusDays(7);
	}

	public Emprestimo() {
		super();
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[numero=");
		builder.append(numero);
		builder.append(", pessoa=");
		builder.append(pessoa);
		builder.append(", exemplar=");
		builder.append(exemplar);
		builder.append(", status=");
		builder.append(status);
		builder.append(", dataEmprestimo=");
		builder.append(dataEmprestimo);
		builder.append("]");
		return builder.toString();
	}

	public void reciboRegistroEmprestimo() {
		System.out.println("-------REGISTRO DO EMPRESTIMO-----------");
		System.out.println("Num do Emprestimo: " + this.numero);
		System.out.println("Nome: " + this.pessoa.getNome());
		System.out.println("CPF: " + this.pessoa.getCpf());
		System.out.println("Qtd de Obras emprestas:");
		System.out.println("Obra emprestada: ");
		System.out.println("Data do Emprestimo: " + dataEmprestimo);
		System.out.println("----------------------------------------");
		System.out.println("Data Devolução: " + dataDevolucao());
		System.out.println("----------------------------------------");
		System.out.println("Status: " + exemplar.getStatus());

	}

}
