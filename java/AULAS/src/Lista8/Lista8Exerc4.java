package Lista8;

import java.util.Random;

public class Lista8Exerc4 {

	public static void main(String[] args) {
		
		int N1 [] [] = new int[3][3];
		int linha = 0;
		int coluna = 0;
		
		Random sorteador = new Random();
		for(linha=0;linha<3; linha++){
			for(coluna=0;coluna<3;coluna++){
				
		N1[linha][coluna]=sorteador.nextInt(10)+1;
			
			}
		}
		System.out.println("\nMatriz N1\n");
		
		for(linha=0;linha<3; linha++){
			for(coluna=0;coluna<3;coluna++){
			System.out.print(N1[linha][coluna]+" ");
			}	
			System.out.print("\n");
		}
	}

}
