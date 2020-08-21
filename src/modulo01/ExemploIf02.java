package modulo01;
//Programa 01.14

//Exemplo do comando if

import java.io.IOException;

public class ExemploIf02 {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma das letras da palavra JAVA");
		int numero = System.in.read();// lê do teclado apenas um caractere
		if (((char) numero == 'J') || ((char) numero == 'j') || ((char) numero == 'A') || ((char) numero == 'a')
				|| ((char) numero == 'V') || ((char) numero == 'v')) {
			System.out.println("Letra digitada está correta");
		} else if ((char) numero == (char) 13) {
			System.out.println("Foi digitado apenas um enter>.");
		} else {
			System.out.println("Letra digitada incorreta");
		}

	}

}
