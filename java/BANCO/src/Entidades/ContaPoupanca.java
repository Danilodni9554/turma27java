package Entidades;

public class ContaPoupanca extends Conta {

	private final double correcao = 0.05;
	private int diaAniversario;

	// construtor
	/*
	 * public ContaPoupanca(String nome, int conta) { super(nome, conta); }
	 */
	public ContaPoupanca(int conta, double saldo, int diaAniversario) {
		super(conta, saldo);
		this.diaAniversario = diaAniversario;
	}
	// encapsulamento

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public double getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else if (valor > saldo) {
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o");
		} else {
			this.saldo = saldo - valor;
			System.out.printf("Opera��o realizada com sucesso...");
			System.out.printf("Seu novo saldo � R$%.2f", saldo, "\n");
		}
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else {
			this.saldo = this.saldo + valor;

			System.out.printf("Opera��o realizada com sucesso..");
			System.out.printf("\nSeu novo saldo � R$%.2f", saldo);
		}
	}

	public void corrigir() {
		if (diaAniversario == 10) {
			// super.getsaldo();
			// super.setsaldo((this.getsaldo())+(this.getsaldo()*correcao)) ;
			saldo = (saldo * correcao) + saldo;
			System.out.println("\nPor ser aniversario da sua conta seu saldo ser� atualizado\n");
			System.out.println("Com um juros exclusivo de 5%");
			System.out.printf("Portanto seu saldo ficou em R$%.2f", saldo);
		} else {
			System.out.println("Ainda n�o � o dia do anivers�rio da sua conta");
		}
	}

	public void extrato() {
		System.out.println("----------------------------------");
		System.out.println("--------------Extrato-------------");
		System.out.printf("---Seu saldo � de R$%.2f", saldo);
		System.out.println("\n----------------------------------");
	}

}