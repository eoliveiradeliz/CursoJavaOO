package modulo01;

public class ContaCorrenteSobrecarga {
	
	int conta;
	int agencia;
	double saldo;

	void efetuarSaque(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	void efetuaDesposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	void imprimirSaldo() {
		System.out.println(this.saldo);
	}
	void imprimirAtributos() {
		System.out.println("Método imprimirAtributos");
	}
	void imprimirAtributos(int a) {
		System.out.println("Método imprimirAtributos (int a)");
	}
	void imprimirAtributos(char a) {
		System.out.println("Método imprimirAtributos (char a)");
	}
	void imprimirAtributos(int a, char b) {
		System.out.println("Método imprimirAtributos (int a, char b)");
	}
	void imprimirAtributos(char b, int a) {
		System.out.println("Método imprimirAtributos (char b, int a)");
	}
	
}
