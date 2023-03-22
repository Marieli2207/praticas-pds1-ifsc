
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

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		/*
		 * Faça uma janela (JFrame) com três campos de texto (inputs) - que representam
		 * os lados de um triângulo - e apenas um botão. Programe o botão para que,
		 * quando clicado, verifique que tipo de triângulo é representado pelos lados
		 * inseridos triângulo equilátero (três lados iguais), isósceles (dois lados
		 * iguais) ou escaleno (três lados diferentes).
		 * 
		 * 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Lado 1: ");
		lblNewLabel.setBounds(21, 30, 46, 14);
		contentPane.add(lblNewLabel);

		txtN1 = new JTextField();
		txtN1.setBounds(67, 27, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Lado 2:");
		lblNewLabel_1.setBounds(21, 65, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Lado 3:");
		lblNewLabel_2.setBounds(21, 107, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtN2 = new JTextField();
		txtN2.setBounds(67, 62, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtN3 = new JTextField();
		txtN3.setBounds(67, 104, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);

		JButton btnNewButton = new JButton("Ver tipo de Triângulo ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String click1 = txtN1.getText();
				String click2 = txtN2.getText();
				String click3 = txtN3.getText();
				
					Integer  numero1 = Integer.valueOf ( click1 );
					Integer  numero2 = Integer.valueOf ( click2 );
					Integer  numero3 = Integer.valueOf ( click3 );
					
					if ( numero1 == numero2 && numero1 == numero3 && numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , "triângulo  Equilátero" );
					}
					else 
						if ( numero1 == numero2 || numero1 == numero3 || numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , " triângulo  Isoceles" );
					}
						else 
							if ( numero1 != numero2 && numero1 != numero3 && numero2 != numero3 ) {
						JOptionPane . showMessageDialog ( null , " triângulo  Escaleno" );
						
					}
				}
		});
		btnNewButton.setBounds(64, 149, 167, 23);
		contentPane.add(btnNewButton);
	}

}
