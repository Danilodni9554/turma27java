package Lista6;

import java.util.Scanner;

public class Lista6Exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		int idade;
		String nome;
		
		System.out.println("Informe seu nome: ");
		nome = leia.next();
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14){
			System.out.println("Você pertence ao Infantil");
		}
		
		else if (idade>=15 && idade<=17){
			System.out.println("Você pertence ao Juvenil");
		}
		
		else if (idade>=18 && idade<=25){
			System.out.println("Você pertence ao Adulto");
		}
		
		else {
			System.out.println("Fora da faixa etária classificatória");
		}
		

	}

}
