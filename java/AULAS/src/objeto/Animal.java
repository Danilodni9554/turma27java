package objeto;

public abstract class Animal {
	
	
	//ATRIBUTOS	
	private String nome;
	private String especie;
	private int idade;
	
	//CONSTRUTOR
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}
	
	//ENCAPSULAMENTO - GETTERS AND SETTERS	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	

}
