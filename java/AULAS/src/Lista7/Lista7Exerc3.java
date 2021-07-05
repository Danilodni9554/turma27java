package Lista7;

import java.util.Scanner;

public class Lista7Exerc3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, contador21=0,contador50=0;
		
		System.out.println("Escreva a idade: ");
		idade = leia.nextInt();
		
		while(idade <= 99){
			idade = leia.nextInt();
						
			if(idade<21) {
				contador21++;
			}
			else if(idade>50){
				contador50++;
			}
		}	
			
			System.out.println("\nO total de menores de 21 é: " + contador21 + "\n" );
			System.out.println("O total de maiores de 50 é: " + contador50 + "\n");
		

	}

}
