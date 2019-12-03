package pilha;

public class PilhaMain {

	public static void main(String[] args) {
		
		PilhaTest test = new PilhaTest();
		boolean resultado;
		
		resultado = test.testNaoAddLimite();
		System.out.println("Limite " + resultado);
		
		resultado = test.testRetirarUltimo();
		System.out.println("Retirar o ultimo " + resultado);
		
		resultado = test.naoAddForaPadraoNome();
		System.out.println("Nome fora do Padrao " + resultado);
		
		
	}

}
