package objeto;

public class Cachorro extends Animal {
	
	private String faro;
	
	public Cachorro(String nome, String especie, int idade, String faro)
	{
		super(nome,especie,idade);
		this.faro = faro;
		
	}

	public String getFaro() {
		return faro;
	}

	public void setFaro(String faro) {
		this.faro = faro;
	}
	
	

}
