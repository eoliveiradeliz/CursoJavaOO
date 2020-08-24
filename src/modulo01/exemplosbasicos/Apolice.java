package modulo01.exemplosbasicos;

//Programa 01.25
//Resposta do exercicio 1
public class Apolice {

	String nome;
	int idade;
	double valorPremio;

	public void imprimir() {
		System.out.println("Nome:" + this.nome);
		System.out.println("idade:" + this.idade);
		System.out.println("Valor premio:" + this.valorPremio);
	}

	public void calcularPremioApolice() {
		if ((this.idade >= 18) && (this.idade <= 25)) {
			this.valorPremio += (this.valorPremio * 20) / 100;
		}

		if ((this.idade > 25) && (this.idade <= 36)) {
			this.valorPremio += (this.valorPremio * 15) / 100;
		}

		if (this.idade > 36) {
			this.valorPremio += (this.valorPremio * 10) / 100;
		}

	}

	public void ofereceDesconto(String nomeCidade) {

		if (nomeCidade.contentEquals("Curitiba")) {
			this.valorPremio -= (this.valorPremio * 20) / 100;
		}

		if (nomeCidade.contentEquals("Rio de Janeiro")) {
			this.valorPremio -= (this.valorPremio * 15) / 100;
		}
		if (nomeCidade.contentEquals("São Paulo")) {
			this.valorPremio -= (this.valorPremio * 10) / 100;
		}
		if (nomeCidade.contentEquals("Belo Horizonte")) {
			this.valorPremio -= (this.valorPremio * 5) / 100;
		}
	}

}
