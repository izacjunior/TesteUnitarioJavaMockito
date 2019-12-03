package pilha;

public class PilhaTest {

	Pilha pilha = new Pilha();

	public boolean testRetirarUltimo() {
		
		Livro livro = new Livro("A FORTALEZA");
		pilha.push(livro);

		livro = new Livro("A EMBOSCADA");
		pilha.push(livro);

		livro = new Livro("O SOL");
		pilha.push(livro);

		String resultado = "O SOL";

		return pilha.pop().getTitulo().equals(resultado);
		
	}

	public boolean testNaoAddLimite() {

		Livro livro = new Livro("A FORTALEZA");
		Livro livro1 = new Livro("A EMBOSCADA");
		Livro livro2 = new Livro("O PALHACO");
		Livro livro3 = new Livro("A TERRA");
		Livro livro4 = new Livro("O SOL");
		Livro livro5 = new Livro("A LUA");

		pilha.push(livro);
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);

		String resultado = "O SOL";
		return pilha.pop().getTitulo().equals(resultado);

	}

	public boolean naoAddForaPadraoNome() {

		Pilha pilha = new Pilha();
		Livro livro = new Livro("A FORTALEZA");
		pilha.push(livro);

		Livro livro2 = new Livro("HOMEM DE FERRO");
		pilha.push(livro2);

		String resultado = "A FORTALEZA";
		return pilha.pop().getTitulo().equals(resultado);

	}

}
