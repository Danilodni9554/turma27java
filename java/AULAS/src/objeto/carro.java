package objeto;

public class carro {
	
	public String modelo;
	public String marca;
	public char combustivel;
	public int anoDeFabricacao;
	public boolean ligado;
	public int velocidade;
	
	public void ligarCarro() {
		ligado = true;
		System.out.println("carro ligando...");
	}
	public void desligarCarro() {
		if(velocidade==0) {
			ligado = false;
		System.out.println("carro desligando...");
	}
		
		else {
			System.out.println("Desacelerar carro");}
		}
	
		public void acelerar() {
		velocidade++;
	}
	
	
	

}
