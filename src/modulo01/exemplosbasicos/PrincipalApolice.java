package modulo01.exemplosbasicos;
//Programa 01.26

//Resposta do exerc�cio 2

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
		System.out.println("Imprimindo os dados ap�s a execu��o do m�todo calcularPremioApolice");
		novoObj.imprimir();
		novoObj.ofereceDesconto("Curitiba");
		System.out.println();
		System.out.println("Imprindo os dados ap�s a execu��o do m�todo oferecerDesconto");
		novoObj.imprimir();

	}

}
