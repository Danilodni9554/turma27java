package objeto;

public class Animal {
	
	private String nome;
	private String especie;
	private int idade;
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
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
	
	public void emitirSom () {
		
	}
	
	public void correr () {
		
	}
		
	

}
