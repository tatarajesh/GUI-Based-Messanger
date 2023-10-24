package welcome;

import main.*;

import signup.*;
import login.*;
import java.awt.event.*;
import javax.swing.*;


public class Welcome 
{
	public Welcome() 
	{
		JFrame f=new JFrame("Welcome");
		f.setVisible(true);
		f.setLayout(null); 
		JLabel un=new JLabel("Welcome to Mass Messanger...");
		un.setBounds(95,60,250,30 );
		f.add(un);
		JButton b1=new JButton("Sign up");
		b1.setBounds(80,120,100,30);
		f.add(b1);
		JButton b2=new JButton("Login");
		b2.setBounds(190,120,100,30);
		f.add(b2);

	b1.addActionListener(new ActionListener()  
	{
	public  void actionPerformed(ActionEvent e)
	{
		Signup obj=new Signup();
		f.dispose();
	}
	});
	
	b2.addActionListener(new ActionListener()  
	{
	public  void actionPerformed(ActionEvent e)
	{
		Login obj=new Login();
		f.dispose();
	}
	});
	f.setSize(500,500);
	}
}
