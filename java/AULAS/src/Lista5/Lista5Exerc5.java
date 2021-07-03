package Lista5;

import java.util.Scanner;

public class Lista5Exerc5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,media;

		System.out.println("Digite a nota referente a disciplina A: ");
		a = leia.nextDouble();
		System.out.println("Digite a nota referente a disciplina B: ");
		b = leia.nextDouble();
		System.out.println("Digite a nota referente a disciplina C: ");
		c = leia.nextDouble();

		media=((a*2)+(b*3)+(c*5)/3);

		System.out.println("A média do aluno é: "+media);
		
			
		}
	
	}


