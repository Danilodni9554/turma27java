package Lista6;

import java.util.Scanner;

public class Lista6Exerc4 {

	public static void main(String[] args) {
	
		int num,numPar,numImpar,raiz,quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = leia.nextInt();
		
		if (num % 2 == 0){
			raiz = (int) Math.sqrt(num);
			System.out.println("O n�mero: " + num + " � par e sua raiz quadrada �: " + raiz);
		}
		else if(num % 2 == 1){
			quadrado = (int) Math.pow(num,2);
				System.out.println("O n�mero: " + num + " � impar e seu resultado ao quadrado �: " + quadrado);
		}
		
		else{
			System.out.println("Op��o inv�lida");
		}		

	}

}
