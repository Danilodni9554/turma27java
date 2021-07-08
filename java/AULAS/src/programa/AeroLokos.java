package programa;

import objeto.Aviao;

public class AeroLokos {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.modelo = ("BIMOTOR");
		aviao1.rodas = 3;
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		
		aviao1.ligar();
		aviao1.aumentarvelocidade();
		aviao1.aumentarvelocidade();
		aviao1.aumentarvelocidade();
		aviao1.diminuirvelocidade();
		aviao1.diminuirvelocidade();
		aviao1.diminuirvelocidade();
		aviao1.decolando();
		aviao1.aumentarvelocidade(40);
		System.out.println("Velocidade atual: " + aviao1.velocidade + "\nNO AR " + aviao1.noAr + " \nLIGADO " + aviao1.ligado);
		aviao1.diminuirvelocidade(40);
		

	}

}
