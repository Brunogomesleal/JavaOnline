package br.com.brgomes.javacore.introducaometodos.teste;

public class Metodos {
	public String nome;
	public String idade;
	// bloco de incialização que inicia antes do construtor
	{
		System.out.println("DENTRO DO BLOCO DE INI");
	}
	// construtor
	public Metodos(String nome, String idade) {
		System.out.println("DENTRO DO CONSTRUTOR");
		this.nome = nome;
		this.idade = idade;
		
	}
		
	}
