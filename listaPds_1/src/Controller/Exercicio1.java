package Controller;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que lê precoLitro (tipo Double) e quantidadeLitros 
		 * (tipo Integer) usando o método showInputDialog da classe JOptionPane.
		 *  Crie um método (função) que calcule o totalPagamento e use ele para calcular os valores inseridos.
		 *  Exiba o valor final utilizando o método showMessageDialog da classe JOptionPane.
		 */
		
		String precoLitro = JOptionPane.showInputDialog("Informe o preço do Litro");
		Double pl = Double.valueOf(precoLitro);
		String quantidadeLitros = JOptionPane.showInputDialog("Informe a quantidade de litros");
		Integer ql = Integer.valueOf(quantidadeLitros);
		
		Exercicio1 exercicio1 = new Exercicio1();
		
		Double Total = exercicio1.totalPagar(pl, ql);
		JOptionPane.showMessageDialog(null, "Quantidade a pagar"+Total);

	}
	public Double totalPagar(Double pl, int ql) {
		double soma = 0;
		soma = pl * ql;
				
		return soma;
		
	}

}
