package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CalculadoraTest {

	@Test
	void somar() {

		Calculadora cal = new Calculadora();
		int resultadoEsperado = 10;

		int resultado = cal.somar(5, 5);

		assertEquals(resultadoEsperado, resultado);

	}

	@Test
	void dividir() {

		Calculadora cal = new Calculadora();
		int resultadoEsperado = 1;

		int resultado = cal.dividir(2, 2);

		assertEquals(resultadoEsperado, resultado);

	}


}
