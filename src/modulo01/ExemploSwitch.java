package modulo01;

import java.io.IOException;

//Programa 01.14

//Exemplo do comando switch. Uma alternativa ao comando if
public class ExemploSwitch {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma das letras da palavra JAVA: ");
		int numero = System.in.read();// lê do teclado apenas um caractere
		switch ((char) numero) {
		case 'J':
		case 'j':
		case 'A':
		case 'a':
		case 'V':
		case 'v':
			System.out.println("Letra digitada está correta");
			break;
		case (char) 13:// utilizado para tartar o enter
			System.out.println("Foi digitado apenas o enter");
		default:
			System.out.println("Letra digitada está incorreta");

		}

	}
}