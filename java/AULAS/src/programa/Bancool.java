package programa;

import objeto.Conta;

public class Bancool {

	public static void main(String[] args) {
		
		Conta cliente1 = new Conta(1); //instanciar
		Conta clientevip = new Conta(2);
		Conta clienteEspecial = new Conta(3);
		Conta clijaque = new Conta(45,1955,2000.00);
		System.out.println("numero da conta"+clienteEspecial.getNumero());
		clienteEspecial.setNumero(300);
		System.out.println("numero da conta"+cliente1.getNumero());
		System.out.println("numero da conta"+clienteEspecial.getNumero());

		cliente1.setNumero(888);
		System.out.println("número da conta: "+cliente1.getNumero());
		
		clijaque.imprimeExtrato();		
		clientevip.imprimeExtrato();
		
		clijaque.sacar(1000.33);
		clijaque.imprimeExtrato();
		clienteEspecial.depositar(5000.55);
		clienteEspecial.imprimeExtrato();
		
		cliente1.sacar(100);
		cliente1.imprimeExtrato();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
