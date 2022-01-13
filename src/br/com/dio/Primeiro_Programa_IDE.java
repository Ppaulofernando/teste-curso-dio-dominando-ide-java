package br.com.dio;

import br.com.dio.model.Gato;

/**
 * @author Paulo
 *Primeiro_Programa_IDE
 */

public class Primeiro_Programa_IDE {
	
	

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		int a = 2;
		int b = 3;
		System.out.println("Hello world! " + (a+b));
		System.out.println(gato);
		System.out.println(livros);//vai mostrar o endereço de memória, porque não criou o toString
		// TODO Auto-generated method stub

	}

}
class Livros{
	private String nome;
	private Integer pagina;
}
