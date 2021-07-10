package programa;

import objeto.Cachorro;
import objeto.Cavalo;
import objeto.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro animal1 = new Cachorro("Scooby", "Canina", 5, "Faro Agu�ado");
		System.out.print("Seu nome �: "+ animal1.getNome() +" \nSua ra�a �: "+ animal1.getEspecie() + "\nSua idade �: "+ animal1.getIdade() + " \nSua habilidade � " + animal1.getFaro() );
		System.out.println("\n");
		animal1.emitirSom();
		
		System.out.println("\n");
		Cavalo animal2 = new Cavalo("Spirit", "Equina", 7, "Casco duro");
		System.out.print("Seu nome �: "+ animal2.getNome() +" \nSua ra�a �: "+ animal2.getEspecie() + "\nSua idade �: "+ animal2.getIdade() + " \nSua habilidade � " + animal2.getCasco() );
		System.out.println("\n");
		animal2.emitirSom();
		
		System.out.println("\n");
		Preguica animal3 = new Preguica("Slow", "Xenarthra", 13, "Paci�ncia");
		System.out.print("Seu nome �: "+ animal3.getNome() +" \nSua ra�a �: "+ animal3.getEspecie() + "\nSua idade �: "+ animal3.getIdade() + " \nSua habilidade � " + animal3.getLento() );
		System.out.println("\n");
		animal3.emitirSom();
		
	}

}
