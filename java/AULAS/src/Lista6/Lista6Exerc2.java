package Lista6;

import java.util.Scanner;

public class Lista6Exerc2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int numA,numB,numC ;
		
		System.out.println("Escreva o primeiro n�mero");
		numA = x.nextInt() ;
		
		System.out.println("Escreva o segundo n�mero");
		numB = x.nextInt() ;
		
		System.out.println("Escreva o terceiro n�mero");
		numC = x.nextInt();
		
		if(numA < numB && numB < numC ) {
			System.out.printf("A ordem sera %d , %d, %d",numA,numB,numC);
		}
		else if(numB < numA && numB < numC && numA < numC) {
			System.out.printf("A ordem sera %d , %d, %d",numB,numA,numC);
		}
		else if(numC < numA && numC < numB && numB < numA) {
			System.out.printf("A ordem sera %d , %d, %d",numC,numB,numA);
		}
		else if(numA < numB && numA < numB && numC < numB) {
			System.out.printf("A ordem sera %d , %d, %d",numA,numC,numB);
		}
		else if(numB < numA && numB < numC && numC < numA) {
			System.out.printf("A ordem sera %d , %d, %d",numB,numC,numA);
		}
		else {
			System.out.printf("A ordem sera %d , %d, %d",numC,numA,numB);
		}
	}

}