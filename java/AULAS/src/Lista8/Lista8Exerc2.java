/*Um dado é lançado 10 vezes e o
valor correspondente é anotado.
Faça um programa que gere um 
vetor com os lançamentos, 
escreva esse vetor. A seguir 
determine e imprima a média 
aritmética dos lançamentos, 
contabilize e apresente 
também quantas foram as 
ocorrências da maior pontuação.*/

package Lista8;

import java.util.Random;
import java.util.Arrays;

public class Lista8Exerc2 {

	public static void main(String[] args) {
		
		int dado[] = new int[10]; 
		
		Random sorteador = new Random();
		
		int totalDado=0, media=0, maiorNum=0,contador=0;
		
		for(int i=0;i <dado.length; i++) {
			int num = sorteador.nextInt(6)+1;
			dado[i]=num;
			totalDado += dado[i];
		
			if(dado[i] > maiorNum){
				maiorNum = dado[i];	
			}
		}
		
		for(int i=0;i <dado.length; i++) {
			if(dado[i] == maiorNum) {
				contador++;
			}
		}

		
		media = totalDado / 10;
		
		System.out.println(Arrays.toString(dado)+"\n");
		System.out.println("A média aritimética dos valores é: " + media);
		System.out.println("A maior pontuação foi: " + maiorNum);
		System.out.println("A maior pontuação apareceu: " + contador + " vezes.");
		
		

	}

}
