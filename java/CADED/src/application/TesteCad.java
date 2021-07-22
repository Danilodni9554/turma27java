package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("001", 40, 10.00);
		Terceiro terc1 = new Terceiro("100", 40, 10.00,50);
		
		System.out.println("FUNCIONARIO CLT");
		System.out.println("Matrícula : " + func1.getMatricula());
		System.out.println("Salario atual: "+func1.salario());
		
		System.out.println("FUNCIONARIO TERCEIRO");
		System.out.println("Matrícula : " + terc1.getMatricula());
		System.out.println("Salario atual: "+terc1.salario());
		
		
	}

}
