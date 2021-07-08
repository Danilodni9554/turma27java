package objeto;

public class Aviao {
	
	public String empresa;
	public String modelo;
	public int anoFabricacao;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	public int rodas;
	
	
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void decolando() {
		for (int x = 1; x <=10;x++) {
			aumentarvelocidade();
		}
		noAr = true;
	}
	public void pousar() {
		for(int x = 1; x<=10; x++) {
			diminuirvelocidade();
		}
		noAr = false;
	}
	
	public void aumentarvelocidade() {
		velocidade++;
	}
	
	public void aumentarvelocidade(int acrescimo) {
		velocidade = velocidade+acrescimo;
	}
	
	public void diminuirvelocidade() {
		velocidade--;
	}
	
	public void diminuirvelocidade(int decrescimo) {
		velocidade = velocidade-decrescimo;
	}
}
