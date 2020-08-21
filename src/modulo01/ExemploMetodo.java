package modulo01;

import java.util.Date;

//Programa 01.05
//Exemplo Métodos, variáveis e atributos
public class ExemploMetodo {

	private int meuAtributo = 0; // pode ser usado por qualquer método

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);// today representa uma variável
		imprimir();//executando o método imprimir
	}
	public static void imprimir() {
		// esta variável poderá ser usada somente no método imprimir()
		int minhaVariavel=0;
		System.out.println("método imprimir");
	}
}
