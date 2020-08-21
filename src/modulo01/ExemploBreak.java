package modulo01;

import java.io.IOException;
import java.util.Scanner;

//Programa 01.20
//Exemplo de comando break

public class ExemploBreak {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite a letra f para terminar: ");
		int letra = 0;
		while (true) {
			// l� do teclado apenas um caractere
			letra = System.in.read();
			if ((char) letra == 'f') {
				break;// quebra o loop while (true)
			}
		}
		System.out.println("O loop foi quebrado");
		System.out.println("Usando o comando break com label");
		breakLabel();
	}

	private static void breakLabel() {

		int[] tLista = { 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };
		int i;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		labelbreak: while (true) {// primeiro n�vel do loop e a defini��o do label
			do {// segundo n�vel do loop
				System.out.println("Digite um n�mero (0 - fim)");
				num = sc.nextInt();
				if (num == 0) {
					break labelbreak;// quebra o primeiro n�vel do loop
				}
				// valida o n�mero lido
				if (num < 0 || num > 100) {
					System.out.println("Digitar n�meros em 1 e 100");
				}
			} while (num < 0 || num > 100);
			for (i = 0; i < tLista.length; i++) {
				if (tLista[i] == num)
					break;// quebra loop for
			}

			if (i < tLista.length)
				System.out.println("O n�mero foi encontrado no vetor e est� na posi��o " + i);
			else
				System.out.println("O n�mero n�ofoi encontrado no vetor");
		}

	}

}
