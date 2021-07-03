package Lista6;

import java.util.Scanner;

public class Lista6Exerc1 {
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		
		int num1,num2,num3 ;
		
		System.out.println("Escreva o primeiro número");
		num1 = x.nextInt() ;
		
		System.out.println("Escreva o segundo número");
		num2 = x.nextInt() ;
		
		System.out.println("Escreva o terceiro número");
		num3 = x.nextInt();
		
		if(num1 > num2 && num2 > num3 ) {
			System.out.printf("O maior número é:  %d",num1);
		}
		
		else if(num1 > num2 && num2 < num3 ) {
			System.out.printf("O maior número é:  %d",num1);
		}
		
		else if(num2 > num1 && num1 > num3 ) {
			System.out.printf("O maior número é:  %d",num2);
		}
		
		else if(num2 > num1 && num1 < num3 ) {
			System.out.printf("O maior número é:  %d",num2);
		}
		
		else if(num3 > num1 && num1 > num2 ) {
			System.out.printf("O maior número é:  %d",num3);
		}
		else if(num3 > num1 && num1 < num2 ) {
			System.out.printf("O maior número é:  %d",num3);
		}
		
		else {
			System.out.printf("Não há maior número");
		}

	

	}

}
