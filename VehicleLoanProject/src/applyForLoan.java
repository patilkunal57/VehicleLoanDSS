import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import Validators.AllValidators;
import vehicle.Application;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class applyForLoan extends JFrame {

	private JPanel contentPane;
	private JTextField fullNameTextField;
	private JTextField contactNoTextField;
	private JTextField ageTextField;
	private JTextField genderTextField;
	private JTextField salaryTextField;
	private JTextField textField_1;
	Application applicant = new Application();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applyForLoan frame = new applyForLoan();
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
	public applyForLoan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1351, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 54, 1300, 732);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application for Vehicle Loan");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 23));
		lblNewLabel.setBounds(544, 0, 265, 58);
		panel.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(603, 45, 134, 30);
		panel.add(lblPersonalDetails);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("Age");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(482, 173, 69, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(502, 136, 69, 24);
	
		
		ageTextField = new JTextField();
		ageTextField.setColumns(10);
		ageTextField.setBounds(651, 177, 265, 19);
		panel.add(ageTextField);
		
		genderTextField = new JTextField();
		genderTextField.setColumns(10);
		genderTextField.setBounds(651, 212, 265, 19);
		panel.add(genderTextField);
	
		
	
	
	
		
		JButton btnNewButton = new JButton("Submit");
		
		
	
		
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(449, 526, 112, 36);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBounds(736, 526, 112, 36);
		panel.add(btnReset);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Gender");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(482, 207, 69, 24);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Salary");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1_1.setBounds(482, 247, 69, 24);
		panel.add(lblNewLabel_1_2_1_1);
		
		salaryTextField = new JTextField();
		salaryTextField.setColumns(10);
		salaryTextField.setBounds(651, 252, 265, 19);
		panel.add(salaryTextField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(651, 305, 265, 19);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Number Of EMI");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1_1_1.setBounds(482, 301, 114, 24);
		panel.add(lblNewLabel_1_2_1_1_1);
	  
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				applicant.setAge(Integer.parseInt(ageTextField.getText()));
				applicant.setGender(genderTextField.getText());
			    applicant.setYearlySalary(Integer.parseInt(salaryTextField.getText()));
			    applicant.setExistingEMIs(Integer.parseInt(textField_1.getText()));
				ApplyLoan applyLoan = new ApplyLoan(applicant);
				applyLoan.setVisible(true);
				
			
				try {
					DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
					Connection conn =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		
		

	}
}