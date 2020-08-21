package modulo01;
//Programa 01.08
//Exemplo uso atributos estáticos
public class PrincipalEstatico {

	public static void main(String[] args) {
		ContaCorrente objeto1 = new ContaCorrente();
		//acessando o atributo estático por meio da classe
		ContaCorrente.cpmf = 0.0038;
		objeto1.saldo = 200;
		ContaCorrente objeto2 = new ContaCorrente();
		objeto2.saldo = 400;
		System.out.println("Manipulando objetos em java\u2122");
		System.out.println("\u00A9 Sun Microsystems, Inc. ");
		//atributo estático acessado por objeto
		System.out.println("Objeto1 atributo estático:       " + objeto1.cpmf);
		System.out.println("Objeto1 atributo não estático:   " + objeto1.saldo);
		//atributo estático acessado por objetogmail.com
		
		System.out.println("Objeto1 atributo estático:       " + objeto2.cpmf);
		System.out.println("Objeto1 atributo não estático:   " + objeto2.saldo);
		objeto2.cpmf=0.0010;
		System.out.println("Objeto1 atributo estático:       " + objeto1.cpmf);
		System.out.println("Objeto1 atributo não estático:   " + objeto1.saldo);
		//acessando o atributo estático por meio da classe
		System.out.println("Objeto1 atributo estático.Acessado pelo nome da classe:   " + ContaCorrente.cpmf);
		System.out.println("Objeto1 atributo não estático:   " + objeto1.saldo);
		
		
	}

}
