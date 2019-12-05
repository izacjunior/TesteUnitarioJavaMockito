package retangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calcularRetangulo.Retangulo;

class CalculadoraTeste {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularArea() {
		Retangulo1 retangulo = new Retangulo1();
		
		int a = 10;
		int b = 2;
		int resultadoEsperado = 20;
		
		int resultado = retangulo.calcularArea(a, b);
		assertEquals(resultadoEsperado,  resultado);
	}

}
