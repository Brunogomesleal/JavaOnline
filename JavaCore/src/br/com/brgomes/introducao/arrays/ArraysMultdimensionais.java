package br.com.brgomes.introducao.arrays;


public class ArraysMultdimensionais {

	public static void main(String[] args) {
		//criando um array bidimensional
		// n�o � obrigado informar a qtd de posicoes apenas a quantidade de arrays
		// exmp: int [][] dias = new int [2][];
		int [][] dias = new int [2][2];
		// inserindo dados no array
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 29;
		dias[1][1] = 28;
		// imprimindo o aras) {
		//	for array usando o for tradional
		
		for (int i=0; i<dias.length;i++) {
			// aqui ira imprimir o ENDERE�O DE MEMORIA ONDE EST� REF. O ARRAY
			System.out.println(dias[i]);
			for(int j=0;j<dias[i].length; j++) {
				// AQUI IR� IMPRIMIR O VALOR CONTIDO EM CADA ESPA�O DO ARRAY
				System.out.println(dias[i][j]);
			}
		}
		// usando foreach
		System.out.println("\n");
		// primeiro for � um array para ref. e outro para os valores
		for (int[] ref : dias) {
			System.out.println(ref);
			for (int valor : ref) {
				System.out.println(valor);
			}
		}
	}

}
