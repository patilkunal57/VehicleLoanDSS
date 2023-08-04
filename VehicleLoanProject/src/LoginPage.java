import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Validators.*;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldForEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		panel.setBounds(10, 10, 1205, 635);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Apply For Vehicle Loan ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(543, 59, 138, 42);
		panel.add(lblNewLabel);

		JLabel label = new JLabel("New label");
		label.setBounds(10, 600, 276, -354);
		panel.add(label);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(385, 146, 104, 42);
		panel.add(lblNewLabel_1);

		textFieldForEmail = new JTextField();
		textFieldForEmail.setBounds(586, 157, 383, 32);
		panel.add(textFieldForEmail);
		textFieldForEmail.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(365, 235, 206, 32);
		panel.add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setBounds(586, 235, 383, 32);
		panel.add(passwordField);

		JLabel ErrMsgForEmail = new JLabel("Enter Valid Email Id");
		ErrMsgForEmail.setForeground(Color.red);
		ErrMsgForEmail.setBounds(995, 166, 155, 13);
		panel.add(ErrMsgForEmail);
		ErrMsgForEmail.setVisible(false);
		JButton btnNewButton = new JButton("Login");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!AllValidators.isValidEmail(textFieldForEmail.getText())) {

					System.out.println("Invalid email");
					ErrMsgForEmail.setVisible(true);
					textFieldForEmail.setText("");
				}
				
				if (textFieldForEmail.getText().equals("adminlog@gmail.com") && passwordField.getText().equals("admin@123")  ) {
//				System.out.println(textFieldForEmail.getText());
					AdminPage adminPage=new AdminPage();
					adminPage.setVisible(true);
				}
				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(412, 316, 159, 49);
		panel.add(btnNewButton);

		JButton btnCancel = new JButton("cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(655, 316, 159, 49);
		panel.add(btnCancel);

		JLabel lblNewLabel_3 = new JLabel("New User? Are you a");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(412, 429, 138, 21);
		panel.add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FarmerRegistrationPage farmerRegistrationPage = new FarmerRegistrationPage();
				farmerRegistrationPage.setVisible(true);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(543, 430, 85, 21);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_3_1 = new JLabel("or");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(638, 429, 20, 21);
		panel.add(lblNewLabel_3_1);

		JButton btnNewButton_1_1 = new JButton("Bidder");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BidderRegistrationPage bidderRegistrationPage = new BidderRegistrationPage();
				bidderRegistrationPage.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBounds(668, 430, 85, 21);
		panel.add(btnNewButton_1_1);

		JLabel lblNewLabel_3_2 = new JLabel("Register Here");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(763, 429, 138, 21);
		panel.add(lblNewLabel_3_2);

		JButton btnNewButton_2 = new JButton("Forgot Password");
		btnNewButton_2.setBounds(543, 388, 175, 21);
		panel.add(btnNewButton_2);

	}
}