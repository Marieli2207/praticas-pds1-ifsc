package Controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Execicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Execicio4 frame = new Execicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Execicio4() {
		
		/*
		 * Faça uma janela (JFrame) com dois campos de texto (inputs).
		 *  Você deve criar quatro botões com os operadores de soma, subtração, divisão e multiplicação. 
		 *  Programe cada botão para realizar uma operação de acordo com o que foi clicado, 
		 *  e exiba o resultado em uma caixa de diálogo com o showMessageDialog (JOptionPane).
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setBounds(33, 51, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setBounds(33, 85, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		txtN1 = new JTextField();
		txtN1.setBounds(92, 48, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(92, 82, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtN1.getText();
				String n2 = txtN2.getText();
				Double numero1 = Double.valueOf(n1);
				Double numero2 = Double.valueOf(n2);
				Double soma =  numero1+numero2;
				JOptionPane.showMessageDialog(null, soma);
			}
		});
		btnNewButton.setBounds(233, 47, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dividir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtN1.getText();
				String n2 = txtN2.getText();
				Double numero1 = Double.valueOf(n1);
				Double numero2 = Double.valueOf(n2);
				Double soma =  numero1/numero2;
				JOptionPane.showMessageDialog(null, soma);
			}
		});
		btnNewButton_1.setBounds(233, 85, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Subtrair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtN1.getText();
				String n2 = txtN2.getText();
				Double numero1 = Double.valueOf(n1);
				Double numero2 = Double.valueOf(n2);
				Double soma =  numero1-numero2;
				JOptionPane.showMessageDialog(null, soma);
			}
		});
		btnNewButton_2.setBounds(233, 119, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Multiplicar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtN1.getText();
				String n2 = txtN2.getText();
				Double numero1 = Double.valueOf(n1);
				Double numero2 = Double.valueOf(n2);
				Double soma =  numero1*numero2;
				JOptionPane.showMessageDialog(null, soma);
			}
		});
		btnNewButton_3.setBounds(233, 153, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
