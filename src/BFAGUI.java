import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BFAGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassword;
	private JTextField txtUsername;
	private JTextField txtPassword_1;
	private JTextField txtUsername_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BFAGUI frame = new BFAGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BFAGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuitProgram = new JButton("Quit Program");
		btnQuitProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BFA.QuitProgram();
			}
		});
		btnQuitProgram.setBounds(477, 343, 117, 29);
		contentPane.add(btnQuitProgram);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(6, 6, 588, 311);
		contentPane.add(tabbedPane);
		
		JPanel username = new JPanel();
		tabbedPane.addTab("Spam Username", null, username, null);
		username.setLayout(null);
		
		JPanel password = new JPanel();
		tabbedPane.addTab("Spam Password", null, password, null);
		password.setLayout(null);
		
		JLabel lblUsePassword = new JLabel("Use Password: ");
		lblUsePassword.setBounds(6, 39, 273, 22);
		JLabel lblUsePassword_1 = new JLabel("Use Password: ");
		lblUsePassword.setBounds(6, 39, 273, 22);
		username.add(lblUsePassword);
		password.add(lblUsePassword_1);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setBounds(281, 33, 280, 28);
		txtPassword.setText("Password");
		txtPassword_1 = new JTextField();
		txtPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword_1.setBounds(281, 33, 280, 28);
		txtPassword_1.setText("Password");
		username.add(txtPassword);
		password.add(txtPassword_1);
		txtPassword.setColumns(10);
		txtPassword_1.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setText("Username");
		txtUsername.setBounds(281, 5, 280, 28);
		txtUsername_1 = new JTextField();
		txtUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername_1.setText("Username");
		txtUsername_1.setBounds(281, 5, 280, 28);
		username.add(txtUsername);
		password.add(txtUsername_1);
		txtUsername.setColumns(10);
		txtUsername_1.setColumns(10);
		
		JLabel lblStartOnUsername = new JLabel("Start On Username: ");
		lblStartOnUsername.setBounds(6, 11, 280, 16);
		JLabel lblStartOnUsername_1 = new JLabel("Start On Username: ");
		lblStartOnUsername_1.setBounds(6, 11, 280, 16);
		username.add(lblStartOnUsername);
		password.add(lblStartOnUsername_1);
		
		JRadioButton rdbtnIncludeAllSymbols = new JRadioButton("Include All Symbols");
		buttonGroup_1.add(rdbtnIncludeAllSymbols);
		rdbtnIncludeAllSymbols.setBounds(6, 67, 273, 23);
		JRadioButton rdbtnIncludeAllSymbols_1 = new JRadioButton("Include All Symbols");
		buttonGroup_3.add(rdbtnIncludeAllSymbols_1);
		rdbtnIncludeAllSymbols_1.setBounds(6, 67, 273, 23);
		username.add(rdbtnIncludeAllSymbols);
		password.add(rdbtnIncludeAllSymbols_1);
		
		JRadioButton rdbtnIncludeCommonSymbols = new JRadioButton("Include Common Symbols (! ? $)");
		buttonGroup_1.add(rdbtnIncludeCommonSymbols);
		rdbtnIncludeCommonSymbols.setBounds(6, 102, 273, 23);
		JRadioButton rdbtnIncludeCommonSymbols_1 = new JRadioButton("Include Common Symbols (! ? $)");
		buttonGroup_3.add(rdbtnIncludeCommonSymbols_1);
		rdbtnIncludeCommonSymbols_1.setBounds(6, 102, 273, 23);
		username.add(rdbtnIncludeCommonSymbols);
		password.add(rdbtnIncludeCommonSymbols_1);
		
		JRadioButton rdbtnIncludeNoSymbols = new JRadioButton("Include No Symbols");
		rdbtnIncludeNoSymbols.setSelected(true);
		buttonGroup_1.add(rdbtnIncludeNoSymbols);
		rdbtnIncludeNoSymbols.setBounds(6, 137, 273, 23);
		JRadioButton rdbtnIncludeNoSymbols_1 = new JRadioButton("Include No Symbols");
		rdbtnIncludeNoSymbols_1.setSelected(true);
		buttonGroup_3.add(rdbtnIncludeNoSymbols_1);
		rdbtnIncludeNoSymbols_1.setBounds(6, 137, 273, 23);
		username.add(rdbtnIncludeNoSymbols);
		password.add(rdbtnIncludeNoSymbols_1);
		
		JRadioButton rdbtnIncludeNumbers = new JRadioButton("Include Numbers");
		rdbtnIncludeNumbers.setSelected(true);
		buttonGroup.add(rdbtnIncludeNumbers);
		rdbtnIncludeNumbers.setBounds(281, 73, 280, 23);
		JRadioButton rdbtnIncludeNumbers_1 = new JRadioButton("Include Numbers");
		rdbtnIncludeNumbers_1.setSelected(true);
		buttonGroup_2.add(rdbtnIncludeNumbers_1);
		rdbtnIncludeNumbers_1.setBounds(281, 73, 280, 23);
		username.add(rdbtnIncludeNumbers);
		password.add(rdbtnIncludeNumbers_1);
		
		JRadioButton rdbtnDontIncludeNumbers = new JRadioButton("Dont Include Numbers");
		buttonGroup.add(rdbtnDontIncludeNumbers);
		rdbtnDontIncludeNumbers.setBounds(281, 102, 280, 23);
		JRadioButton rdbtnDontIncludeNumbers_1 = new JRadioButton("Dont Include Numbers");
		buttonGroup_2.add(rdbtnDontIncludeNumbers_1);
		rdbtnDontIncludeNumbers_1.setBounds(281, 102, 280, 23);
		username.add(rdbtnDontIncludeNumbers);
		password.add(rdbtnDontIncludeNumbers_1);
		
		JButton btnSpamUsername = new JButton("Spam Username");
		btnSpamUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BFA.SpamUsername();
			}
		});
		btnSpamUsername.setBounds(200, 230, 178, 29);
		username.add(btnSpamUsername);
		
		JButton btnSpamPassword = new JButton("Spam Password");
		btnSpamPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BFA.SpamPassword();
			}
		});
		btnSpamPassword.setBounds(200, 230, 178, 29);
		password.add(btnSpamPassword);
		
		JButton btnStopProgram = new JButton("Stop Program");
		btnStopProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BFA.StopProgram();
			}
		});
		btnStopProgram.setBounds(477, 314, 117, 29);
		contentPane.add(btnStopProgram);
		
		JLabel lblTotalAttempts = new JLabel("Total Attempts: ");
		lblTotalAttempts.setBounds(16, 319, 135, 16);
		contentPane.add(lblTotalAttempts);
		
		JLabel lblCurrentlyTesting = new JLabel("Currently Testing: ");
		lblCurrentlyTesting.setBounds(16, 343, 135, 16);
		contentPane.add(lblCurrentlyTesting);
	}
}
