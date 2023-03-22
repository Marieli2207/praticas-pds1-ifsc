package Controller;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie uma lista (ArrayList) de String. 
		 * Preencha 10 (dez) elementos nesta lista fazendo a leitura com o método showInputDialog da classe
		 *  JOptionPane em um for array. 
		 * Em seguida, exiba todos os dados de uma só vez utilizando o método showMessageDialog da classe JOptionPane.
		 */
		
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0;i<=10 ;i++) {
		String elementos = JOptionPane.showInputDialog("Informe elementos");
		lista.add(elementos);
	
		}
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

}
