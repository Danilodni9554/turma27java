//Fa�a um programa que crie um vetor 
//por leitura com 5 valores de pontua��o 
//de uma atividade e o escreva em seguida.
//Encontre ap�s a maior pontua��o e a apresente. 

package Lista8;

import java.util.Scanner;

public class Lista8Exerc1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] nota = new int[5]; 
		int maiorNota = 0;
		String materia[] = {"Portugu�s", "Matem�tica", "Ci�ncias", "Artes", "Ingl�s"};
		
		for (int x = 0; x < 5; x++) {
			System.out.print("Digite a Pontua��o de " + materia[x] + ": ");
			nota[x] = leia.nextInt();
			
			
		
			if(nota[x] > maiorNota){
			maiorNota = nota[x];
			}
			
			//System.out.println("Em: " + materia[x] + "sua nota foi: " + nota[x]);
		}
		
		System.out.println("A maior nota �: " + maiorNota );	
		
		
		
		
		
	}

}
