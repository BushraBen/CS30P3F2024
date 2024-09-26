package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class semavg {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semavg window = new semavg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public semavg() {
		initialize();
	}

	
	private void initialize() 
	{
		ImageIcon cres = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\chhs.png");
		ImageIcon pears = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\pears.png");
		ImageIcon forest = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\forest.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 588, 414);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.setBackground(SystemColor.text);
		Fn.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				Fn.setText("");
				
				
			}
		});
		Fn.setForeground(Color.DARK_GRAY);
		Fn.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		Fn.setText("First Name");
		Fn.setBounds(29, 48, 159, 34);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setBackground(SystemColor.text);
		Ln.setForeground(Color.DARK_GRAY);
		Ln.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		Ln.setText("Last Name");
		Ln.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Ln.setText("");
				
			}
		});
		Ln.setColumns(10);
		Ln.setBounds(240, 48, 159, 34);
		panel.add(Ln);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Script MT Bold", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		comboBox.setBounds(32, 120, 156, 39);
		panel.add(comboBox);
		
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setBounds(25, 196, 374, 68);
		panel.add(disp);
		
		JComboBox school = new JComboBox();
		school.setBackground(SystemColor.inactiveCaptionBorder);
		school.setForeground(Color.RED);
		school.setFont(new Font("Script MT Bold", Font.PLAIN, 18));
		school.setModel(new DefaultComboBoxModel(new String[] {"Select School:", "Crescent", "Pearson", "Forest"}));
		school.setBounds(198, 120, 169, 39);
		panel.add(school);
		
		JLabel imgd = new JLabel("");
		imgd.setBounds(389, 245, 189, 158);
		panel.add(imgd);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setFont(new Font("Palatino Linotype", Font.BOLD, 32));
		btnNewButton.setBounds(35, 265, 288, 117);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String sch = " ";
				
				String firstN = Fn.getText();
				String lastN = Ln.getText();
				
				if(comboBox.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(comboBox.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				if(school.getSelectedItem().equals("Crescent"))
				{
					sch = "Crescent";
					imgd.setIcon(cres);
					
				}
				else if(school.getSelectedItem().equals("Pearson"))
				{
					sch = "Pearson";
					imgd.setIcon(pears);
				}
				else
				{
					sch = "Forest";
					imgd.setIcon(forest);
				}
				
				
				
				
				
				
				disp.setText(firstN + " " +
							   	lastN + " is in grade: "+
								grade + " "+ "and goes to "+ 
							   	sch + "."
								);
				
				
				
			}
		});
		
		
		
	}
}