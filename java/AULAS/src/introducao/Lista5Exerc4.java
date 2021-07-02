package introducao;

import java.util.Scanner;

public class Lista5Exerc4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double d, r, s, a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();

		d=(Math.pow((a+b),2)+(Math.pow((b+c),2)/2));
		
		System.out.println("O resultado é: "+d);
	}

}
