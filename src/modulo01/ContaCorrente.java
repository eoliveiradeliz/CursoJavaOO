package modulo01;

// Programa 01.07
//Representação de uma class com atributos e métodos
public class ContaCorrente {

	int conta;
	int agencia;
	double saldo;
	static double cpmf;// atributo estático
	String nome;

	void efetuarSaque(double valor) {
		this.saldo = this.saldo - valor;
	}

	void efetuaDesposito(double valor) {
		this.saldo = this.saldo + valor;
	}

	void imprimirSaldo() {
		System.out.println(this.saldo);
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpmf() {
		return cpmf;
	}

	public static void setCpmf(double cpmf) {
		ContaCorrente.cpmf = cpmf;
	}

}
