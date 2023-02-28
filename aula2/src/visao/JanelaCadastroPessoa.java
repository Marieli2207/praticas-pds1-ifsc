package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import java.awt.Label;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label lblNome = new Label("Nome:");
		lblNome.setForeground(new Color(255, 0, 0));
		lblNome.setBounds(52, 10, 41, 22);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBounds(98, 11, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		Label lblCPF = new Label("CPF:");
		lblCPF.setForeground(new Color(255, 0, 0));
		lblCPF.setBounds(52, 84, 33, 22);
		contentPane.add(lblCPF);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String CPF = txtCPF.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null), "Nenhum nome preenchido!");
				}
				
				if(CPF.isEmpty()) {
					JOptionPane.showMessageDialog(null), "Nenhum CPF preenchido!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCPF(Long.valueOf(CPF));
				
				FuncionarioDAO banquinhoDeDados = FuncionarioDAO.getInstance();
                bdPessoa.inserir(func);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(115, 140, 63, 23);
		contentPane.add(btnNewButton);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(98, 84, 86, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
	}

}
