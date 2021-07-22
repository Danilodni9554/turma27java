package Entidades;

public class ContaEmpresarial extends Conta {

	private double disponivelEmprestimo = 10000;

	public ContaEmpresarial(double saldo, int conta, double disponivelEmprestimo) {
		super(conta, saldo);
	}

	public double getDisponivelEmprestimo() {
		return disponivelEmprestimo;
	}

	public void setDisponivelEmprestimo(double disponivelEmprestimo) {
		this.disponivelEmprestimo = disponivelEmprestimo;
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

	public void emprestimo(double valorEmprestimo) {
		if (disponivelEmprestimo >= valorEmprestimo) {

			depositar(valorEmprestimo);

			setDisponivelEmprestimo(disponivelEmprestimo);

			setDisponivelEmprestimo(getDisponivelEmprestimo() - valorEmprestimo);

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
