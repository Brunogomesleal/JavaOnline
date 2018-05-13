package br.com.brgomes.javacore.herancaTestes;

import br.com.brgomes.javacore.heranca.classes.Endereco;
import br.com.brgomes.javacore.heranca.classes.Pessoa;

public class HerancaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("BRUNO", "019.275.462.90");
	Endereco end = new Endereco();
	end.setRua("RUA DAS AMAZONAS");
	end.setBairro("Bairro dos cabra macho!");
	p1.setEndereco(end);

	
}	
}
