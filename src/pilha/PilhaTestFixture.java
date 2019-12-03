package pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class PilhaTestFixture {

	private static Pilha pilha;

	@BeforeClass
	public static void setupClass() throws Exception{
		pilha = new Pilha();
		System.out.println("BEFORECLASS");
	}

	@Before
	public void setup() throws Exception{
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

	@Test
	void testNaoAddAlemLimite() throws Exception{

		pilha.push(new Livro("A VOLTA AO MUNDO"));
		Livro livro = pilha.pop();

		assertEquals("O SOL", livro.getTitulo());
		
		System.out.println("TESTE");
	}

	@Test
	void testNaoAddLivroForaNomePadrao() throws Exception{

		pilha.pop();
		pilha.push(new Livro("NAO VAI"));
		Livro livro = pilha.pop();

		assertEquals("A LUA", livro.getTitulo());

	}

	@After
	public void tearDown() throws Exception{

		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
			
			System.out.println("AFTER");
		}
	}

	@AfterClass
	public static void tearDownClass() throws Exception{

		pilha = null;
		System.out.println("AFTERCLASS");
	}

}
