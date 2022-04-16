package br.gov.prodesp.calculos;

public class ValeRefeicao {

	public static void main(String[] args) {
		
		double salario = 0;
		double desconto = 0;
		double novoSalario = 0;

		salario = 15600.20;
		desconto = 9.68;
		novoSalario = salario - desconto;

		System.out.println("Salário        " + salario);
		System.out.println("Valor do VR    " + desconto);
		System.out.println("Novo Salários  " + novoSalario);
	}

}
