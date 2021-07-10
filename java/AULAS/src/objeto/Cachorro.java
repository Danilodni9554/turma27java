package objeto;

public class Cachorro extends Animal {

	private String faro;

	public Cachorro(String nome, String especie, int idade, String faro) {
		super(nome, especie, idade);
		this.faro = faro;

	}

	public String getFaro() {
		return faro;
	}

	public void setFaro(String faro) {
		this.faro = faro;
	}

	// METODO
	public void correr() {
		System.out.println("Cachorro correndo...");
	}

	public void emitirSom() {
		System.out.println("AU AU AU!");
	}

}
