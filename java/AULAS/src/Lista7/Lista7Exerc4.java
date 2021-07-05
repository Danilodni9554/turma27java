package Lista7;

import java.util.Scanner;

public class Lista7Exerc4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		char sexo;
		char opcao;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, pessoasNervosasMais40=0, pessoasCalmasMenos18=0;
		char op='S';
		final int LIMITE = 150;
		int contador=1;
		String nome;
		
		while(op=='S' && contador <= LIMITE) {
			System.out.println("Participante" + contador);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite");
			System.out.println("1 - feminino\n2 - masculino\n3 - outros");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione");
			System.out.println("1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva");
			opcao = leia.next().charAt(0);
			
			if(opcao == '1') {
				pessoasCalmas++;
			}
			
			if (sexo =='1' && opcao =='2') {
				mulheresNervosas++;
			}
			
			if (sexo == '2' && opcao =='3') {
				homensAgressivos++;
			}
			
			if (sexo=='3' && opcao =='1') {
				outrosCalmos++;
			}
			
			if (idade<18 && opcao=='1') {
				pessoasCalmasMenos18++;
			}
			
			if (idade>40 && opcao=='2') {
				pessoasNervosasMais40++;
			}
			
			System.out.println("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			contador++;
		}
		
		System.out.println("Pessoas calmas: " + pessoasCalmas);
		System.out.println("Mulheres Nervosas: " + mulheresNervosas);
		System.out.println("Homens Agressivos: " + homensAgressivos);
		System.out.println("Outros Calmos: " + outrosCalmos);
		System.out.println("Pessoas Nervosas Mais de 40 anos: " + pessoasNervosasMais40);
		System.out.println("Menos de 18 Calmos" + pessoasCalmasMenos18);
		
	}

}
