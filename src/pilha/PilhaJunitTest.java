package pilha;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaJunitTest {

	private static Pilha pilha;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("BEFORECLASS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("AFTERCLASS");
	}

	@BeforeEach
	void setUp() throws Exception {
		Livro livro1 = new Livro("A TERRA");
		Livro livro2 = new Livro("A RODA");
		Livro livro3 = new Livro("O GLOBO");
		Livro livro4 = new Livro("A LUA");
		Livro livro5 = new Livro("O SOL");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);

		System.out.println("BEFORE");
	}

	@AfterEach
	void tearDown() throws Exception {
		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;

			System.out.println("AFTER");
		}
	}

	@Test
	void testNaoAddAlemLimite() {
		try {
			pilha.push(new Livro("A VOLTA AO MUNDO"));
			fail();
		} catch (ArrayStoreException e) {
			assertTrue(true);
		}
		System.out.println("TESTE1");

	}

	@Test
	void testNaoAddLivroForaNomePadrao() {
		pilha.pop();
		pilha.push(new Livro("NAO VAI"));
		Livro livro = pilha.pop();

		assertEquals("A LUA", livro.getTitulo());
		System.out.println("TESTE2");
	}

//	@Test(expected = ArrayStoreException.class)
//	void testNaoAddAlemLimiteException() {
//
//		pilha.push(new Livro("A VOLTA AO MUNDO"));
//		System.out.println("TESTE1");
//	}

}
