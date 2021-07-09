package objeto;

public class Conta {
	
	//ATRIBUTOS
	private int numero;
	private double saldo;
	private double limite;
	
	//CONSTRUTOR
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;		
	}
	
	public Conta(int numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;	
		this.limite = limite;
		
	}
	
	//ENCAPSULAMENTO - GETTERS AND SETTERS
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//METODOS PROPRIOS
	
	public void sacar(double valorSaque) {
		if(valorSaque> saldo) {
			System.out.println("Valor Indisponível...");
		}else{
			saldo = saldo - valorSaque;
			System.out.println("Saque realizado");
		}
	}
	
	
	public void depositar(double valorDeposito) {
		
		saldo = saldo + valorDeposito;
	}
	
	public void imprimeExtrato () {
		System.out.println("Conta número "+numero+" saldo atual: "+saldo);
	}
	


}
