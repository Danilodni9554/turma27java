package objeto;

public class Preguica extends Animal {

	private String lento;

	public Preguica(String nome, String especie, int idade, String lento)

	{
		super(nome, especie, idade);
		this.lento = lento;
	}

	public String getLento() {
		return lento;
	}

	public void setLento(String lento) {
		this.lento = lento;
	}

	public void subirArvore() {
		System.out.println("Preguica subindo em arvores...");
	}

	public void emitirSom() {
		System.out.println("AAAAAAHHHHZZZZ");
	}

}
