package modulo01.exemplosbasicos;
//Resposta do exercíco 4

//Programa 01.28
public class PrincipalAcampamento {

	public static void main(String[] args) {
		
		Acampamento novoObj = new Acampamento();
		novoObj.idade = 22;
		novoObj.nome = "Rafael Zanetti";
		//não precisa atribuir valor pois ela será atribuida pela idade
		System.out.println("imprimindo dados inicilizados");
		novoObj.imprimir();
		novoObj.separarGrupo();
		System.out.println();
		System.out.println("imprimindo os dados após a execução do método separarGrupo");
		novoObj.imprimir();
		

	}

}
