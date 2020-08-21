package modulo01;

//Programa 01.22

//Exemplo de classe Scanner lendo dados do teclado
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner var = new Scanner(System.in);
		int numero = var.nextInt(); // declara e inicia a vari�vel
		System.out.println("Valor digitado = " + numero);
		System.out.println("digite uma string composta: ");
		/*
		 * definindoque o delimitador � o enter usamos os caracteres especiais.Para
		 * formalizar que o delimitador � o enter usamos os caracteres especiais \r\n.O
		 * caracter padr�o do comando Scanner � o espa�o em branco
		 */
		Scanner sc = new Scanner(System.in).useDelimiter("\5r\n");
		/*
		 * Como o delimitador do objeto sc � igual a enter podemos usar o m�todo next()
		 * para ler strings compostas.
		 */

		String nome = sc.next();
		System.out.println("String digitada = " + nome);
		System.out.println("Digite uma string composta: ");
		// criando um novo objeto Scanner, sem altera��o do delimitador padr�o
		Scanner sc1 = new Scanner(System.in);
		// para o objeto sc1 ler uma string composta precisamos do m�todo nextline
		String nome1 = sc1.nextLine(); // usamos o m�todo nextline
		System.out.println("String digitada = " + nome1);
		/*
		 * situa��o onde um problema ser� encontrado. Quando n�o modificamos o
		 * delimitador padr�o apesar de ser lida uma string composta ser� apresentada na
		 * tela apenas a primeira parte da string at� o espa�o em branco.
		 */
		System.out.println("Digite uma nova string composta: ");
		nome1 = sc.next(); // usamos o m�todo next
		System.out.println("String digitada = " + nome1);
	}

}
