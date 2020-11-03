package modulo01.exemplosbasicos;

//Resposta do exerc�co 6

//Programa 01.30

public class PrincipalComputador {

	public static void main(String[] args) {
		Computador novoObj = new Computador();
		novoObj.marca = "HP";
		novoObj.cor = "Preto";
		novoObj.modelo = "DV6383";
		novoObj.nSerie = 987654312;
		novoObj.preco = 3000;

		System.out.println("Imprimindo dados inicializados");
		novoObj.imprimir();
		novoObj.calcularValor();
		System.out.println();
		System.out.println("Imprimindo os dados após o método calcular");
		novoObj.imprimir();
		System.out.println();
		Computador novoObj01 = new Computador();
		novoObj01.marca = "IBM";
		novoObj01.cor = "Branco";
		novoObj01.modelo = "IBM583";
		novoObj01.nSerie = 9873312;
		novoObj01.preco = 4000;
		novoObj01.calcularValor();
		System.out.println("Imprimindo dados inicializados");
		novoObj01.imprimir();

		int ret = novoObj01.alterarValor(2000);
		if (ret > 0) {
			System.out.println("Valor Alterado");
		} else {
			System.out.println("Valor NÃo Alterado");
		}

		System.out.println();
		System.out.println("Imprimindo dados após a execução do método alterarValor ");
		novoObj01.imprimir();
		System.out.println();
		System.out.println("Executando método alterarValor com valor negativo");

		ret = novoObj01.alterarValor(-1300);
		if (ret > 0) {
			System.out.println("Valor Alterado");
		} else {
			System.out.println("Valor NÃo Alterado");
		}

		System.out.println();
		System.out.println("Imprimindo dados após a execução do método alterarValor ");
		novoObj01.imprimir();
	}

}
