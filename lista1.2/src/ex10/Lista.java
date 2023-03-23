package ex10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTable;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
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
	public Lista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 380);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(185, 204, 219));
		panel.setBounds(21, 11, 511, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(185, 204, 215));
		table.setBounds(0, 0, 511, 319);
		panel.add(table);
	}
}
