package Entidades;

public class ContaEstudantil extends Conta {

	private double disponivelEmprestimoEstudantil = 5000;

	public ContaEstudantil(double saldo, int conta, double disponivelEmprestimoEstudantil) {
		super(conta, saldo);
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}

	// encapsulamento
	public double getDisponivelEmprestimoEstudantil() {
		return disponivelEmprestimoEstudantil;
	}

	public void setDisponivelEmprestimoEstudantil(double disponivelEmprestimoEstudantil) {
		this.disponivelEmprestimoEstudantil = disponivelEmprestimoEstudantil;
	}

	// metodos
	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else if (valor > saldo) {
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o");
		} else {
			this.saldo = saldo - valor;
			System.out.printf("Opera��o realizada com sucesso...");
			System.out.printf("\nSeu novo saldo � R$%.2f", saldo);
		}
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Por favor digite um valor v�lido");
		} else {
			this.saldo = this.saldo + valor;

			System.out.printf("Opera��o realizada com sucesso...");
			System.out.printf("\nSeu novo saldo � R$%.2f", saldo);
		}
	}

	public void emprestimo(double valorEmprestimo2) {
		if (disponivelEmprestimoEstudantil >= valorEmprestimo2) {

			depositar(valorEmprestimo2);

			setDisponivelEmprestimoEstudantil(disponivelEmprestimoEstudantil);

			setDisponivelEmprestimoEstudantil(getDisponivelEmprestimoEstudantil() - valorEmprestimo2);
		} else {
			System.out.println("Voc� n�o tem limite de empr�stimo para isso");
		}
	}

	public void extrato() {
		System.out.println("----------------------------------");
		System.out.println("--------------Extrato-------------");
		System.out.printf("---Seu saldo � de R$%.2f", saldo);
		System.out.println("\n----------------------------------");
	}
}
