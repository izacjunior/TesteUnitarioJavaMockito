package calcularRetangulo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloTeste {

	private int area;
	private int base;
	private int altura;

	@Parameters
	public static Collection<Object[]>parametros(){
		return Arrays.asList(new Object[][] {
			{10, 20,200}, {10, 30, 300},
			{10, 40,400}, {10, 50, 500}
			
		});
	}

	public RetanguloTeste(int base, int altura, int area) {
		this.area = area;
		this.base = base;
		this.altura = altura;
	}

	@Test
	public void testCalculaArea() {

		Retangulo retangulo = new Retangulo(base, altura);
		
		int resultado = retangulo.calculadoraArea();
		
		assertEquals(area, resultado);
	}

	@Test
	public void testCalcularPerimetro() {

	}

}
