/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

package Lista8;

import java.util.Random;

public class Lista8Exerc3 {

	public static void main(String[] args) {
				
				int N1 [] [] = new int[4][6];
				int N2 [] [] = new int[4][6];
				int M1 [] [] = new int[4][6];
				int M2 [] [] = new int[4][6];
				int linha = 0;
				int coluna = 0;
				
				Random sorteador = new Random();
				for(linha=0;linha<4; linha++){
					for(coluna=0;coluna<6;coluna++){
					
					
					N1[linha][coluna]=sorteador.nextInt(10)+1;
					N2[linha][coluna]=sorteador.nextInt(10)+1;
					
					M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
					M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];

					}
					
				}
				System.out.println("\nMatriz N1\n");
				for(linha=0;linha<4; linha++){
					for(coluna=0;coluna<6;coluna++){
					System.out.print(N1[linha][coluna]+" ");
					}	
					System.out.print("\n");
					}
				
				System.out.println("\nMatriz N2\n");
				for(linha=0;linha<4; linha++){
					for(coluna=0;coluna<6;coluna++){
					System.out.print(N2[linha][coluna]+" ");
					}	
					System.out.print("\n");
					}
				System.out.println("\nMatriz M1\n");
				for(linha=0;linha<4; linha++){
					for(coluna=0;coluna<6;coluna++){
					System.out.print(M1[linha][coluna]+" ");
					}
					System.out.print("\n");
					}
				System.out.print("\n");
				System.out.println("Matriz M2\n");
				for(linha=0;linha<4; linha++){
					for(coluna=0;coluna<6;coluna++){
					System.out.print(M2[linha][coluna]+" ");
					}
					System.out.print("\n");
					}
					

	}

}
