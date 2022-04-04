package br.gov.prodesp.calculos;

public class ValeAlimentacao {

	public static void main(String[] args) {
		

		double salario = 0;
		double desconto = 0;
		double novoSalario = 0;
		
		salario     = 15600.20;
		desconto    = 15.68;
		novoSalario = salario-desconto;
		
		
		System.out.println("Salário        "+salario);
		System.out.println("Valor do VA    "+desconto);
		System.out.println("Novo Salários  "+novoSalario);

	}

}
