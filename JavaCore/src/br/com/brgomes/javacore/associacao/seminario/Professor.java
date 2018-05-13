package br.com.brgomes.javacore.associacao.seminario;

public class Professor {
	private String nome;
	private String espec;
	private Seminario[] seminarios;

	public Professor(String nome, String idade) {
		this.nome = nome;
		this.espec = idade;
	}

	public Professor() {

	}

	public void print() {
		System.out.println("NOME PROFESSOR: " + this.nome);
		System.out.println("ESPECIALIZAÇÃO: " + this.espec);
		System.out.println("NOME PROFESSOR: " + this.nome);
		System.out.println("Seminarios participantes: ");
		if (seminarios != null && seminarios.length != 0) {
			for (Seminario sem : seminarios) {
				System.out.println(sem.getTitulo());
			}
		} else
			System.out.println("SEM PROFESSORES PARTICIPANTES!");

	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspec() {
		return espec;
	}

	public void setEspec(String espec) {
		this.espec = espec;
	}

}
