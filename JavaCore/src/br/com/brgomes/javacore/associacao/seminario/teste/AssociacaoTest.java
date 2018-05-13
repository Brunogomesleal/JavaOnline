package br.com.brgomes.javacore.associacao.seminario.teste;

import br.com.brgomes.javacore.associacao.seminario.Aluno;
import br.com.brgomes.javacore.associacao.seminario.Local;
import br.com.brgomes.javacore.associacao.seminario.Professor;
import br.com.brgomes.javacore.associacao.seminario.Seminario;

public class AssociacaoTest {
	public static void main(String [] args) {
		
		//Aluno aluno = new Aluno("BRUNO",23);
		//Aluno aluno2 = new Aluno("MARCOS",23);
		Professor professor = new Professor("ARMANDO", "INTERFACES RICAS");
		Local local = new Local("Rua dos tamanduá", "bixos");
		Seminario seminario = new Seminario("Como ser um programador foda e ficar rico!");
		//aluno.setSeminario(seminario);
		//aluno2.setSeminario(seminario);
		//seminario.setProfessor(professor);
		seminario.setLocal(local);
		//seminario.setAlunos(new Aluno [] {aluno, aluno2});
		
		seminario.print();
		
		
		
		
		
	}
	
	
}
