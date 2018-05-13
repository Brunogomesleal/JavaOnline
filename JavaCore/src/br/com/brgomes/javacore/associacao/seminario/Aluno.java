package br.com.brgomes.javacore.associacao.seminario;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno() {

	}

	public void print() {
		System.out.println("ALUNO: " + this.nome);
		System.out.println("IDADE: " + this.idade);
		if (this.seminario != null) {
			System.out.println("SEMINARIO INSCRITO: " + this.seminario.getTitulo());
		} else
			System.out.println("ALUNO NÃO ESTÁ INSCRITO EM NENHUM SEMINARIO!");
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
