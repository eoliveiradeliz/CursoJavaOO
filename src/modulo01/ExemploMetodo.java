package modulo01;

import java.util.Date;

//Programa 01.05
//Exemplo M�todos, vari�veis e atributos
public class ExemploMetodo {

	private int meuAtributo = 0; // pode ser usado por qualquer m�todo

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);// today representa uma vari�vel
		imprimir();//executando o m�todo imprimir
	}
	public static void imprimir() {
		// esta vari�vel poder� ser usada somente no m�todo imprimir()
		int minhaVariavel=0;
		System.out.println("m�todo imprimir");
	}
}
