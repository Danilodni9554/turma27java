package revisao;

import java.util.Scanner;

public class NumImpar {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = leia.nextInt();
		
		if(num < 0){
			System.out.println("Sistema n�o l� n�meros negativos\n");	
		}
		else if(num==0){
			System.out.println("O n�mero: "+ num + "� neutro");
		}
		else if(num % 2 == 0){
			System.out.println("O n�mero: " + num + " � par");
		}
		else if(num % 2 == 1){
				System.out.println("O n�mero: " + num + "� impar");
		}	
		else{
			System.out.println("Op��o inv�lida");
		}
					

	}

}
