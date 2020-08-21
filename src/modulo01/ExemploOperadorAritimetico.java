package modulo01;

//Programa 01.09
//Exemplo do uso dos operadores aritiméticos
public class ExemploOperadorAritimetico {

	public static void main(String[] args) {

		int var1 = 5;// variável var1
		int var2 = 2;// variável var2
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var1 :" + (-var2));// imprime valor negativo
		System.out.println("var1 + var2 :" + (var1 + var2));
		System.out.println("var1 - var2 :" + (var1 - var2));
		System.out.println("var1 * var2 :" + (var1 * var2));
		System.out.println("var1 / var2 :" + (var1 / var2));
		System.out.println("(float) var1 / var2 :" + ((float) var1 / var2));
		System.out.println("var1 % var2 :" + (var1 % var2));
		System.out.println("var2 :" + +var2);

	}

}
