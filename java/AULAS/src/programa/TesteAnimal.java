package programa;

import objeto.Cachorro;
import objeto.Cavalo;
import objeto.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro animal1 = new Cachorro("Scooby", "Canina", 5, "Faro Aguçado");
		System.out.print("Seu nome é: "+ animal1.getNome() +" \nSua raça é: "+ animal1.getEspecie() + "\nSua idade é: "+ animal1.getIdade() + " \nSua habilidade é " + animal1.getFaro() );
		System.out.println("\n");
		animal1.emitirSom();
		
		System.out.println("\n");
		Cavalo animal2 = new Cavalo("Spirit", "Equina", 7, "Casco duro");
		System.out.print("Seu nome é: "+ animal2.getNome() +" \nSua raça é: "+ animal2.getEspecie() + "\nSua idade é: "+ animal2.getIdade() + " \nSua habilidade é " + animal2.getCasco() );
		System.out.println("\n");
		animal2.emitirSom();
		
		System.out.println("\n");
		Preguica animal3 = new Preguica("Slow", "Xenarthra", 13, "Paciência");
		System.out.print("Seu nome é: "+ animal3.getNome() +" \nSua raça é: "+ animal3.getEspecie() + "\nSua idade é: "+ animal3.getIdade() + " \nSua habilidade é " + animal3.getLento() );
		System.out.println("\n");
		animal3.emitirSom();
		
	}

}
