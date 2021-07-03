package Lista6;

import java.util.Scanner;

public class Lista6ExercUm 	{
	
	public static void main(String[] args) {
	
	double pesoTotal, multaPorKilo = 4.00, pesoExcedente, multaPesoExcedente;
	int limiteDePeso = 50;
	
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Informe o peso: ");
	pesoTotal = ler.nextDouble();
	
	if(pesoTotal>limiteDePeso){
	pesoExcedente = pesoTotal - limiteDePeso;
	multaPesoExcedente = (pesoExcedente * multaPorKilo);
	
	System.out.println("Você excedeu em: " + pesoExcedente + "kg \n");
	System.out.println("Multa por excesso de: " + multaPesoExcedente);
	}
	else{
	System.out.println("Peso excedente: 0");
	}
	
	}
}

	
