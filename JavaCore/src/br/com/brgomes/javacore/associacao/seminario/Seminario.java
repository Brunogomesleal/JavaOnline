package br.com.brgomes.javacore.associacao.seminario;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}

	public Seminario() {

	}

	public void print() {
		System.out.println("------------RELATORIO DE SEMINARIO ------- ");
		System.out.println(this.titulo);
		if (professor != null) {
			System.out.println("PROFESOR: " + this.professor.getNome());
			System.out.println("ESPECELISTA: " + this.professor.getEspec());
		} else {
			System.out.println("NENHUM PROFESSOR LISTADO NO MOMENTOS!");
		}
		System.out.println("LOCAL -> RUA " + this.local.getRua() + " BAIRRO " + this.local.getBairro());
		System.out.println(":::::ALUNOS PARTICIPANTE:::");
		if (alunos != null && alunos.length != 0) {
			for (Aluno alunosP : this.alunos) {
				System.out.println("Aluno: " + " (" + alunosP.getNome() + ")");
			}
		}else {
			System.out.println("NENHUM ALUNO LISTADO ATÉ O MOMENTO!");
		}
		System.out.println("-----------FIM RELATORIO DE SEMINARIO ------- ");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
