package modulo01;

//Programa 01.22

//Exemplo de classe Scanner lendo dados do teclado
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner var = new Scanner(System.in);
		int numero = var.nextInt(); // declara e inicia a variável
		System.out.println("Valor digitado = " + numero);
		System.out.println("digite uma string composta: ");
		/*
		 * definindoque o delimitador é o enter usamos os caracteres especiais.Para
		 * formalizar que o delimitador é o enter usamos os caracteres especiais \r\n.O
		 * caracter padrão do comando Scanner é o espaço em branco
		 */
		Scanner sc = new Scanner(System.in).useDelimiter("\5r\n");
		/*
		 * Como o delimitador do objeto sc é igual a enter podemos usar o método next()
		 * para ler strings compostas.
		 */

		String nome = sc.next();
		System.out.println("String digitada = " + nome);
		System.out.println("Digite uma string composta: ");
		// criando um novo objeto Scanner, sem alteração do delimitador padrão
		Scanner sc1 = new Scanner(System.in);
		// para o objeto sc1 ler uma string composta precisamos do método nextline
		String nome1 = sc1.nextLine(); // usamos o método nextline
		System.out.println("String digitada = " + nome1);
		/*
		 * situação onde um problema será encontrado. Quando não modificamos o
		 * delimitador padrão apesar de ser lida uma string composta será apresentada na
		 * tela apenas a primeira parte da string até o espaço em branco.
		 */
		System.out.println("Digite uma nova string composta: ");
		nome1 = sc.next(); // usamos o método next
		System.out.println("String digitada = " + nome1);
	}

}
