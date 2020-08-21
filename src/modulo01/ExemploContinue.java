package modulo01;

//Programa 01.21
//Exemplo comando continue
public class ExemploContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i <=30; i++) {
			if(i > 10  && i < 20){
				continue;
			}
		//apresenta na tela quando o i não estiver entre 10 e 20
		System.out.println("i = " + i);
			
		}
		
	}

}
