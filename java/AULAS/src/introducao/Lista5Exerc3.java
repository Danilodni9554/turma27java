package introducao;

import java.util.Scanner;

public class Lista5Exerc3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoEvento;
		int horas, minutos, segundos;
		
		System.out.println("Digite o tempo do evento [segundos]: ");
		tempoEvento = leia.nextInt();
		horas = (tempoEvento / 3600);
		minutos = (tempoEvento % 3600) / 60;
		segundos = (tempoEvento % 3600) % 60;
				
		System.out.println("Horas: "+horas+"\n");
		System.out.println("Minutos: "+minutos+"\n");
		System.out.println("Segundos: "+segundos+"\n");
		
		
		
		

	}

}
