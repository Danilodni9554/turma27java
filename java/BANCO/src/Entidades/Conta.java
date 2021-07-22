package Entidades;

public abstract class Conta {

	private double saque;
	private double deposito;
	private String nome;
	private int conta;
	protected double saldo;

	// contrutor
	public Conta(int conta, double saldo) {
		super();
		this.saldo = saldo;
		this.conta = conta;
	}

	/*
	 * public Conta(double saque, double deposito,double saldo) { super();
	 * this.saque = saque; this.deposito = deposito; this.saldo = saldo ; }
	 */
	public Conta() {
	}

	// encapsulamento get e set
	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	// metodos
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else if (valor > saldo) {
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o");
		} else {
			saldo = saldo - valor;
			System.out.printf("Opera��o realizada com sucesso...Seu novo saldo � R$%f", saldo);
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else {
			saldo = saldo + valor;

			System.out.printf("Opera��o realizada com sucesso...Seu novo saldo � R$%.2f", saldo);
		}
	}

}