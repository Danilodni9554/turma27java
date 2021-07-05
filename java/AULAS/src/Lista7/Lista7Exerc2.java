package Lista7;

import java.util.Scanner;

public class Lista7Exerc2 {

	public static void main(String[] args) {
		

		int contador=0,contador2=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1; x <= 10;x++) {
			System.out.println(x);
			if(x % 2 == 0) {
				contador++;		
			}
			else if(x % 2 == 1) {
				contador2++;
			}
		}
		System.out.println("Foram: "+contador+" Pares e: "+contador2+" Impares");
	}
}
