package Lista5;

import java.util.Scanner;
import java.lang.Math;

public class Lista5Exerc6 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int d,x1,x2,y1,y2;
		
		System.out.println("Digite o valor de X1: ");
		x1 = leia.nextInt();
		
		System.out.println("Digite o valor de X2: ");
		x2 = leia.nextInt();
		
		System.out.println("Digite o valor de Y1: ");
		y1 = leia.nextInt();
		
		System.out.println("Digite o valor de Y2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)),2);
		System.out.println("A distancia D é igual a "+ d);
		
	}

}
