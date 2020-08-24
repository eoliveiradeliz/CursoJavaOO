package modulo01.exemplosbasicos;
//Programa 01.26

//Resposta do exercício 2

public class PrincipalApolice {

	public static void main(String[] args) {
		
		Apolice novoObj = new Apolice();
		novoObj.idade = 25;
		novoObj.nome = "Gustavo Baravieira Costa";
		novoObj.valorPremio = 500;
		System.out.println();
		System.out.println("Imprimindo os dados inicializados");
		novoObj.imprimir();
		novoObj.calcularPremioApolice();
		System.out.println();
		System.out.println("Imprimindo os dados após a execução do método calcularPremioApolice");
		novoObj.imprimir();
		novoObj.ofereceDesconto("Curitiba");
		System.out.println();
		System.out.println("Imprindo os dados após a execução do método oferecerDesconto");
		novoObj.imprimir();

	}

}
