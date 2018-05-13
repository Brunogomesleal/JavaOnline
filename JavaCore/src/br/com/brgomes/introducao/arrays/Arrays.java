package br.com.brgomes.introducao.arrays;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTRUINDO UM ARRAY
		// ARRAY SÃO OBJETOS EM JAVA. PARA CRIAR UM ARRAY PRECISA-SE INSTACIALO OU INICIALO USANDO O OP NEW
		// array criado e inicializado
		int [] array = new int [4];
		// array apenas referenciado  e não inicializado
		int [] array2;
		// array inicializado
		array2 = new int[2];
		// adicionando dados ao array de inteiro
		array [0] = 10;
		array [1] = 20;
		array [2] = 30;
		array [3] = 40;
		//imprimindo dados
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println("\n");
		
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n");
for(int aux : array) {
	System.out.println(aux);
}
	
	}

}
