import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import Validators.AllValidators;
import vehicle.Application;
import vehicle.Eligibilty;
import vehicle.Loan;

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

public class ApplyLoan extends JFrame {

	private JPanel contentPane;
	
	private JTextField roadPriceTextField;
	private JTextField creditScoreTextField;
	private JTextField downPaymentTextField;
	private JTextField tolTextField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Application nouse = new Application();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplyLoan frame = new ApplyLoan(nouse);
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
	public ApplyLoan(Application applicant) {
		Loan loan;
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
		
		JLabel lblNewLabel = new JLabel("Apply for Loan");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 23));
		lblNewLabel.setBounds(544, 0, 265, 58);
		panel.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Loan Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(603, 45, 134, 30);
		panel.add(lblPersonalDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Vehicle Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(482, 94, 124, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Road Price");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(482, 128, 114, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Credit Score");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(482, 173, 103, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(502, 136, 69, 24);
		
		JTextField VehicleTypeTextField = new JTextField();
		VehicleTypeTextField.setBounds(651, 98, 265, 19);
//		fullNameTextField.setRequired(true);
//		fullNameTextField.addActionListener();
		VehicleTypeTextField.addKeyListener(null);
		panel.add(VehicleTypeTextField);
		
//		fullNameTextField.setRequired(true);
//		fullNameTextField.setRe
		VehicleTypeTextField.setColumns(10);
		
		roadPriceTextField = new JTextField();
		roadPriceTextField.setColumns(10);
		roadPriceTextField.setBounds(651, 132, 265, 19);
		panel.add(roadPriceTextField);
		
		creditScoreTextField = new JTextField();
		creditScoreTextField.setColumns(10);
		creditScoreTextField.setBounds(651, 177, 265, 19);
		panel.add(creditScoreTextField);
		
		downPaymentTextField = new JTextField();
		downPaymentTextField.setColumns(10);
		downPaymentTextField.setBounds(651, 212, 265, 19);
		panel.add(downPaymentTextField);
	
		
	
	
	
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Loan loan = applicant.applyForLoan(applicant );
			
			loan.setCreditScore(Integer.parseInt(creditScoreTextField.getText()));
			loan.setDownPayment(Integer.parseInt(downPaymentTextField.getText()));
			loan.setTentureOfLoan(Integer.parseInt(tolTextField.getText()));
			loan.setPrice(Integer.parseInt(roadPriceTextField.getText()));
			loan.setVehicleModel(VehicleTypeTextField.getText());
	        int x= (int) (Math.random() * 1000);
	        System.out.println(x);
			loan.setApplicationId(x);
			
			Eligibilty eligibility = new Eligibilty();
			boolean b  = eligibility.checkEligibility(loan);
			System.out.println(b);
				try {
					DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
					Connection conn =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(473, 472, 112, 36);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Back");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBounds(723, 472, 112, 36);
		panel.add(btnReset);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Down payment");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(482, 208, 134, 24);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("tensure of Loan");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1_1.setBounds(482, 242, 160, 24);
		panel.add(lblNewLabel_1_2_1_1);
		
		tolTextField = new JTextField();
		tolTextField.setColumns(10);
		tolTextField.setBounds(651, 252, 265, 19);
		panel.add(tolTextField);
	
		
		
		
		
		

	}
}