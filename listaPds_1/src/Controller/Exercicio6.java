package Controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtxNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6 frame = new Exercicio6();
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
	public Exercicio6() {
		/*Faça uma janela (JFrame) como se pede:
		 * Quatro campos de texto (JTextField): um campo de texto representa o nome do estudante e outros três
		 *  representam as notas de um(a) estudante;
         * Quatro JLabels para cada campo de texto, representando o que cada campo de texto é, 
         * respectivamente (nome, nota 1, nota 2, nota 3);
         * Um botão  (JButton) com texto “CALCULAR”
          Ao clicar no botão, o seu sistema deve calcular a média do estudante e exibir o resultado em uma caixa de diálogo 
          com o showMessageDialog (JOptionPane)
		 * 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome :");
		lblNewLabel.setBounds(39, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 30, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(39, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtxNota1 = new JTextField();
		txtxNota1.setBounds(76, 68, 86, 20);
		contentPane.add(txtxNota1);
		txtxNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(76, 118, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(76, 168, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(39, 121, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(39, 171, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Mostrar media");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtNome.getText();
				String not1 = txtxNota1.getText();
				String not2 = txtNota2.getText();
				String not3 = txtNota3.getText();
				
				Double nota1 = Double.valueOf(not1);
				Double nota2 = Double.valueOf(not2);
				Double nota3 = Double.valueOf(not3);
				
				Double soma = (nota1+nota2+nota3)/3;
				JOptionPane.showMessageDialog(null," nome do aluno "+nom+" nota "+soma);
				
			}
		});
		btnNewButton.setBounds(76, 199, 151, 23);
		contentPane.add(btnNewButton);
		
	
	}

}
       

