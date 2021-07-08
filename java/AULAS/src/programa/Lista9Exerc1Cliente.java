package programa;

import java.util.Scanner;

import objeto.cliente;

public class Lista9Exerc1Cliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		cliente cliente1 = new cliente();
		
		System.out.println("Digite o nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o sexo: M/F/O ");
		cliente1.sexo = leia.next().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		System.out.println("Idade é: " + (2021-cliente1.anoNascimento));
		
						

	}

}
