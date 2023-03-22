package Controller;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Considere um programa que deve calcular a média final (MF) de apenas um(a)
		 * discente com três notas (tipo Double) obtidas através do método
		 * showInputDialog da classe JOptionPane. Ao final, o programa deve informar
		 * (usando showMessageDialog da classe JOptionPane): Se MF >= 6: Aprovado(a) Se
		 * MF >= 4 e < 6: Recuperação Se MF < 4: Reprovado(a)
		 * 
		 */
		Double n = 0.0; 
		for(int i =0; i<3; i++) {
			String notas = JOptionPane.showInputDialog("informe a nota"+i);
			Double nota = Double.valueOf(notas);
			n = n + nota;
			
			
		}
		Double total= 0.0;
		total = n/3;
		System.out.println(total);
		if(total>=6) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		if(total<6 && total >=4 ) {
			JOptionPane.showMessageDialog(null, "Recuperacao");
		}
		if(total<4){
			JOptionPane.showMessageDialog(null, "reprovado");
		}
	}

}
