package modulo01;

//Programa 01.23

//Exemplo de classe Scanner lendo dados de um arquivo

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploScannerArquivo {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Números contidos no arquivo: ");
		/*
		 * o arquivo numeros.txt deve ficar gravado dentro do pacote modulo01 e possuir
		 * o seguinte conteúdo: 1 2 3 4 6 34 23
		 */
		Scanner sc = new Scanner(new File("C:\\Users\\eneias\\eclipse-workspace\\CursoJavaOO\\src\\numeros.txt"));
		while (sc.hasNextLong()) {
			long aLong = sc.nextLong();
			System.out.println("Números: " + aLong);
		}
		
		/*File file = new File("C:\\Users\\eneias\\eclipse-workspace\\CursoJavaOO\\src\\numeros.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		*/

	}
	

}
