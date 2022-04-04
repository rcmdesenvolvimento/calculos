package br.gov.prodesp.calculos;

public class Inss {

	public static void main(String[] args) {

		double salario = 0;
		double inss = 0;
		double desconto = 0;
		double novoSalario = 0;
		
		salario     = 15600.20;
		inss        = 12;
		desconto    = Math.round(((salario*inss)/100));
		novoSalario = salario-desconto;
		
		
		System.out.println("Salário        "+salario);
		System.out.println("Inss%          "+inss);
		System.out.println("Valor do Inss  "+desconto);
		System.out.println("Novo Salários  "+novoSalario);
		
		

	}

}
