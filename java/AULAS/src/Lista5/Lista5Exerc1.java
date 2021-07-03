package Lista5;

import java.util.Scanner;

public class Lista5Exerc1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, respdias;
		 
		System.out.println("Digite sua idade:\n");
		System.out.println("Anos: ");
		anos = leia.nextInt();
		System.out.println("Digite sua idade:\n");
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println("Digite sua dias:\n");
		System.out.println("Dias: ");
		dias = leia.nextInt();
		anos = anos * 365;
		meses = meses * 30;
		dias = dias * 1;
		
		
		System.out.println("Idade em dias é: " + anos + meses + dias);
	}

}
