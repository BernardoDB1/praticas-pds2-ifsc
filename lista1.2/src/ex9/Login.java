import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

private Connection conexao;
private JPanel contentPane;
private JTextField txtNome;
private JTextField txtCpf;
private JTextField txtSenha;

/**
* Launch the application.
*/

private final String DATABASE = "Pessoa";
private final String USER = "root";
private final String PSW = "aluno";

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Login frame = new Login();
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
public Login() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 570, 380);
	contentPane = new JPanel();
	contentPane.setBackground(SystemColor.activeCaption);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("CPF:");
	lblNewLabel.setBounds(139, 73, 46, 14);
	contentPane.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Nome:");
	lblNewLabel_1.setBounds(139, 116, 46, 14);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Senha:");
	lblNewLabel_2.setBounds(139, 159, 46, 14);
	contentPane.add(lblNewLabel_2);
	
	JTextField textField = new JTextField();
	textField.setBounds(218, 70, 168, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	JTextField textField_1 = new JTextField();
	textField_1.setBounds(218, 113, 168, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	JTextField textField_2 = new JTextField();
	textField_2.setBounds(218, 156, 168, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	JButton btnNewButton = new JButton("Entrar");
	btnNewButton.setBounds(218, 244, 120, 52);
	contentPane.add(btnNewButton);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(185, 204, 215));
	panel.setBounds(111, 51, 310, 147);
	contentPane.add(panel);
	}
}