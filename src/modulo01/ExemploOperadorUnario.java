package modulo01;
//Programa 01.10
//Exemplo do uso dos operadores un�rios
public class ExemploOperadorUnario {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 20;
		int res = 0;
		res= var1+var2;
		
		System.out.println("res: " + res); // imprime 30
		//ap�s a execu��o do operador = ser� executado o oprador ++ da vari�vel var1
		res = var1++ + var2; // var1 vai valer 11 ap�s a execu��o do operador =
		System.out.println("res: " + res); // imprime 30
		res = var1 + var2;
		System.out.println("res: " + res); // imprime 31
		res = var1 + --var2;
		System.out.println("res: " + res); // imprime 30

	}

}
