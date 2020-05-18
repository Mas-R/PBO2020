package project_pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class editInfo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editInfo window = new editInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public editInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 240, 434);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("KelasKu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 60, 104, 36);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBorderPainted(false);
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
		lblNewLabel_1.setIcon(new ImageIcon(editInfo.class.getResource("/asset/download.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(310, 138, 71, 72);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEditInfoAkun = new JLabel("Edit Info Akun");
		lblEditInfoAkun.setHorizontalAlignment(SwingConstants.LEFT);
		lblEditInfoAkun.setForeground(Color.BLACK);
		lblEditInfoAkun.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEditInfoAkun.setBounds(278, 59, 284, 36);
		frame.getContentPane().add(lblEditInfoAkun);
		
		JLabel lblNewLabel_2 = new JLabel("Nama");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(413, 146, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NIP");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(413, 171, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnAjukan = new JButton("Simpan");
		btnAjukan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAjukan.setBorderPainted(false);
		btnAjukan.setBackground(new Color(0, 255, 51));
		btnAjukan.setBounds(413, 259, 85, 21);
		frame.getContentPane().add(btnAjukan);
		
		JButton btnBatalkan = new JButton("Cancel");
		btnBatalkan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBatalkan.setBorderPainted(false);
		btnBatalkan.setBackground(Color.RED);
		btnBatalkan.setBounds(543, 259, 85, 21);
		frame.getContentPane().add(btnBatalkan);
		
		JLabel lblNewLabel_2_3 = new JLabel("Password");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(413, 196, 58, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("New Password");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_4.setBounds(413, 221, 85, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		textField = new JTextField();
		textField.setBounds(502, 146, 138, 16);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(502, 171, 138, 16);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(502, 196, 138, 16);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(502, 219, 138, 16);
		frame.getContentPane().add(textField_3);
	}

}
