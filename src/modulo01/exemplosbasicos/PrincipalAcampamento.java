package modulo01.exemplosbasicos;
//Resposta do exerc�co 4

//Programa 01.28
public class PrincipalAcampamento {

	public static void main(String[] args) {
		
		Acampamento novoObj = new Acampamento();
		novoObj.idade = 22;
		novoObj.nome = "Rafael Zanetti";
		//n�o precisa atribuir valor pois ela ser� atribuida pela idade
		System.out.println("imprimindo dados inicilizados");
		novoObj.imprimir();
		novoObj.separarGrupo();
		System.out.println();
		System.out.println("imprimindo os dados ap�s a execu��o do m�todo separarGrupo");
		novoObj.imprimir();
		

	}

}
