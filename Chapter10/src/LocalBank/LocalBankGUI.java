package LocalBank;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBankGUI {

	private JFrame frame;
	private JTextField accountNum;
	private JTextField amt;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField beginningBalance;
	
	Bank easySave = new Bank();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LocalBankGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		accountNum = new JTextField();
		accountNum.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				accountNum.setText(null);
			}
		});
		accountNum.setForeground(Color.RED);
		accountNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accountNum.setText("Enter account Number:");
		accountNum.setBounds(34, 106, 436, 19);
		frame.getContentPane().add(accountNum);
		accountNum.setColumns(10);
		
		amt = new JTextField();
		amt.setText("Enter amount:");
		amt.setForeground(Color.RED);
		amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amt.setColumns(10);
		amt.setBounds(34, 140, 436, 19);
		frame.getContentPane().add(amt);
		
		firstName = new JTextField();
		firstName.setText("Enter first name:");
		firstName.setForeground(Color.BLACK);
		firstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		firstName.setColumns(10);
		firstName.setBounds(34, 179, 436, 19);
		frame.getContentPane().add(firstName);
		
		lastName = new JTextField();
		lastName.setText("Enter last name:");
		lastName.setForeground(Color.BLACK);
		lastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lastName.setColumns(10);
		lastName.setBounds(34, 214, 436, 19);
		frame.getContentPane().add(lastName);
		
		beginningBalance = new JTextField();
		beginningBalance.setText("Enter beginning balance:");
		beginningBalance.setForeground(Color.BLACK);
		beginningBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		beginningBalance.setColumns(10);
		beginningBalance.setBounds(34, 253, 436, 19);
		frame.getContentPane().add(beginningBalance);
		
		JLabel acctinfo = new JLabel("Account info will be displayed here");
		acctinfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		acctinfo.setBounds(34, 296, 436, 52);
		frame.getContentPane().add(acctinfo);
		
		JComboBox bankActivities = new JComboBox();
		
		JButton btnNewButton = new JButton("Process Transaction");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String amount, message;
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					amount = amt.getText();
					message = easySave.transaction(1, accountNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("Widhdrawal"))
				{
					amount = amt.getText();
					message = easySave.transaction(2, accountNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
				
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					amount = beginningBalance.getText();
					message = easySave.addAccount(firstName.getText(),lastName.getText(), Double.parseDouble(amount));
					acctinfo.setText("New Account ID: " + message);
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
				
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(34, 358, 210, 54);
		frame.getContentPane().add(btnNewButton);
		
		
		
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					accountNum.setForeground(Color.red);
					amt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					
				}
					
				
				
			}
		});
		bankActivities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an action:", "Deposit", "Widhdrawal", "Check Balance", "Add Account", "Remove Account"}));
		bankActivities.setBounds(34, 24, 436, 46);
		frame.getContentPane().add(bankActivities);
	}

			
		}