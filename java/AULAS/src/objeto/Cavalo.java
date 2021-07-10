package objeto;

public class Cavalo extends Animal {

	private String casco;

	public Cavalo(String nome, String especie, int idade, String casco) {
		super(nome, especie, idade);
		this.casco = casco;
	}

	public String getCasco() {
		return casco;
	}

	public void setCasco(String casco) {
		this.casco = casco;
	}

	public void correr() {
		System.out.println("Cavalo correndo...");
	}

	public void emitirSom() {
		System.out.println("IRRRIINN");
	}

}
