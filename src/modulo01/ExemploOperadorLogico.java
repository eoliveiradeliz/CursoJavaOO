package modulo01;

import java.util.Scanner;

//Programa 01.16
//Exemplo do uso do comando if com os operadores &&, ||, &, e |
//A classe Scanner precisa estar dispon�vel no pacote 

public class ExemploOperadorLogico {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b,c,d,e,f,g,h;
		System.out.println("Entre com o primeiro n�mero :");
		a = entrada.nextInt();
		System.out.println("Entre com o segundo n�mero :");
		b = entrada.nextInt();
		System.out.println("Entre com o terceiro n�mero :");
		c = entrada.nextInt();
		System.out.println("Entre com o quarto n�mero :");
		d = entrada.nextInt();
		System.out.println("Entre com o quinto n�mero :");
		e = entrada.nextInt();
		System.out.println("Entre com o sexto n�mero :");
		f = entrada.nextInt();
		System.out.println("Entre com o s�timo n�mero :");
		g = entrada.nextInt();
		System.out.println("Entre com o oitavo n�mero :");
		h = entrada.nextInt();
		
		
		if (a > 10 && b > 10) {
			System.out.println("O a e b n�meros s�o maiores que 10");
		} else {
			System.out.println("O a ou o b n�o � maior 10");
		}
		if (c > 10 || d > 10) {
			System.out.println("Um dos n�meros (c e d) � maior que 10");
		} else {
			System.out.println("O primeiro(c) ou o segundo (d) n�o � maior 10");
		} 
		if (e > 10 & f > 10) {
			System.out.println("Um dos n�meros (e e f) n�o � maior que 10");
		} else {
			System.out.println("O primeiro(e) ou o segundo (f) n�o � maior 10");
		} 
		if (g > 10 | h > 10) {
			System.out.println("Um dos n�meros (g e h) � maior que 10");
		} else {
			System.out.println("O primeiro(g) ou o segundo (h) n�o � maior 10");
		} 
		

	}

}
