package modulo01;

import java.io.IOException;

//Programa 01.18
//Exemplo comando while
public class ExemploWhile {

	public static void main(String[] args) throws IOException{
		
		
		System.out.println("Digite f para terminar");
		
		int letra = (0);
		while ((char)letra != 'f' ) {
			
			//lê do tecladon apenas um caractere
			letra = System.in.read();
		}

	}
}
