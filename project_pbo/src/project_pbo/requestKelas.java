package project_pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.DebugGraphics;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class requestKelas {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					requestKelas requestKelas = new requestKelas();
					requestKelas.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public requestKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setIgnoreRepaint(true);
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 738, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 240, 434);
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KelasKu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 60, 104, 36);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(15, 350, 201, 25);
		panel.add(btnNewButton);
		
		JButton btnJadwal = new JButton("Jadwal");
		btnJadwal.setHorizontalAlignment(SwingConstants.LEFT);
		btnJadwal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnJadwal.setBorderPainted(false);
		btnJadwal.setBackground(Color.WHITE);
		btnJadwal.setBounds(15, 206, 201, 25);
		panel.add(btnJadwal);
		
		JButton btnKelas = new JButton("Kelas");
		btnKelas.setHorizontalAlignment(SwingConstants.LEFT);
		btnKelas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKelas.setBorderPainted(false);
		btnKelas.setBackground(Color.LIGHT_GRAY);
		btnKelas.setBounds(15, 160, 201, 25);
		panel.add(btnKelas);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(299, 142, 71, 72);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(requestKelas.class.getResource("/asset/download.jpg")));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblRequestKelasYang = new JLabel("Request Kelas Yang Ingin Digunakan");
		lblRequestKelasYang.setBounds(267, 63, 284, 36);
		lblRequestKelasYang.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequestKelasYang.setForeground(SystemColor.desktop);
		lblRequestKelasYang.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblRequestKelasYang);
		
		JLabel lblNewLabel_2 = new JLabel("Nama");
		lblNewLabel_2.setBounds(402, 150, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NIP");
		lblNewLabel_2_1.setBounds(402, 175, 46, 14);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Kelas Yang Ingin Digunakan");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(402, 200, 176, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(402, 226, 113, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnCek = new JButton("Cek");
		btnCek.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCek.setBorderPainted(false);
		btnCek.setBackground(Color.LIGHT_GRAY);
		btnCek.setBounds(525, 225, 58, 21);
		frame.getContentPane().add(btnCek);
		
		JButton btnAjukan = new JButton("Ajukan");
		btnAjukan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAjukan.setBorderPainted(false);
		btnAjukan.setBackground(new Color(0, 255, 51));
		btnAjukan.setBounds(402, 263, 85, 21);
		frame.getContentPane().add(btnAjukan);
		
		JButton btnBatalkan = new JButton("Batalkan");
		btnBatalkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBatalkan.setBorderPainted(false);
		btnBatalkan.setBackground(new Color(255, 0, 0));
		btnBatalkan.setBounds(497, 263, 85, 21);
		frame.getContentPane().add(btnBatalkan);
		
		textField = new JTextField();
		textField.setBounds(458, 151, 120, 14);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(458, 176, 120, 14);
		frame.getContentPane().add(textField_1);
	}
}
