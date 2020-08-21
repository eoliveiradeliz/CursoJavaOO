package modulo01;

import java.util.Scanner;

//Programa 01.16
//Exemplo do uso do comando if com os operadores &&, ||, &, e |
//A classe Scanner precisa estar disponível no pacote 

public class ExemploOperadorLogico {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b,c,d,e,f,g,h;
		System.out.println("Entre com o primeiro número :");
		a = entrada.nextInt();
		System.out.println("Entre com o segundo número :");
		b = entrada.nextInt();
		System.out.println("Entre com o terceiro número :");
		c = entrada.nextInt();
		System.out.println("Entre com o quarto número :");
		d = entrada.nextInt();
		System.out.println("Entre com o quinto número :");
		e = entrada.nextInt();
		System.out.println("Entre com o sexto número :");
		f = entrada.nextInt();
		System.out.println("Entre com o sétimo número :");
		g = entrada.nextInt();
		System.out.println("Entre com o oitavo número :");
		h = entrada.nextInt();
		
		
		if (a > 10 && b > 10) {
			System.out.println("O a e b números são maiores que 10");
		} else {
			System.out.println("O a ou o b não é maior 10");
		}
		if (c > 10 || d > 10) {
			System.out.println("Um dos números (c e d) é maior que 10");
		} else {
			System.out.println("O primeiro(c) ou o segundo (d) não é maior 10");
		} 
		if (e > 10 & f > 10) {
			System.out.println("Um dos números (e e f) não é maior que 10");
		} else {
			System.out.println("O primeiro(e) ou o segundo (f) não é maior 10");
		} 
		if (g > 10 | h > 10) {
			System.out.println("Um dos números (g e h) é maior que 10");
		} else {
			System.out.println("O primeiro(g) ou o segundo (h) não é maior 10");
		} 
		

	}

}
