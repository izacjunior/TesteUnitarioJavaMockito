package calcularRetangulo;

public class RetanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RetanguloTest teste = new RetanguloTest();
		boolean resultado;
		
		resultado = teste.testCalcularArea();
		System.out.println(resultado);
		resultado = teste.testCalcularPerimetro();
		System.out.println(resultado);

	}

}
