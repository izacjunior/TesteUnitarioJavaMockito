package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {

		Calculadora cal = new Calculadora();
		int resultadoEsperado = 10;

		int resultado = cal.somar(5, 5);

		assertEquals(resultadoEsperado, resultado);

	}

}
