package login;

import main.*;
import chat.*;
import welcome.*;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import data.Data;

public class Login 
{
	public	Login()
	{
	JFrame ff=new JFrame("Login");
	ff.setVisible(true);
	ff.setLayout(null); 
	JLabel un=new JLabel("Enter Username");
	un.setBounds(50,60,250,30 );
	JTextField tf1=new JTextField();
	tf1.setBounds(150,60,150,20);
	ff.add(un);
	ff.add(tf1);
	JLabel l3=new JLabel("Enter Password");
	ff.add(l3);
	l3.setBounds(50,100,150,20);
	JPasswordField pf =new JPasswordField();
	pf.setBounds(150,100,150,20);
	ff.add(pf);
	JCheckBox cb = new JCheckBox("Show password");
	cb.setBounds(35,140,120,20);
	ff.add(cb);
	JTextField tf2=new JTextField();
	
	JButton b=new JButton("Submit");
	b.setBounds(110,180,80,25);
	ff.add(b);
	ff.setSize(500,500);
	JButton lg=new JButton("<- BACK");
	lg.setBounds(30,410,100,25 );
	ff.add(lg);
	//start editing here
	lg.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		Welcome obj=new Welcome();
		ff.dispose();
	}
	});
	
	cb.addItemListener(new ItemListener()
	{    
         public void itemStateChanged(ItemEvent e) 
         {                 
        	if( e.getStateChange()==1)
        		{
        		String pw=String.valueOf(pf.getPassword()); 
        		tf2.setBounds(155,140,145,20);
				ff.add(tf2); 
        		tf2.setText(pw);
        		}
        	else
        	{
    				tf2.setBounds(0,0,0,0);
    				ff.add(tf2);
        	}
        }
	 }); 
	
	b.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		String pw=String.valueOf(pf.getPassword());  
		String un=tf1.getText();
		if(pw.equals("") || un.equals(""))
		{
			JOptionPane.showMessageDialog(ff,"All fields are Mandatory");
		}
		else
		{
			int n=1;
			try {
				Data obj=new Data(n,un,pw);
				ff.dispose();
			} 
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	}
	});
}
//login class ends

public	Login(int n)
{
JFrame ff=new JFrame("Login");
ff.setVisible(true);
ff.setLayout(null); 
JLabel un=new JLabel("Enter Username");
un.setBounds(50,60,250,30 );
JTextField tf1=new JTextField();
tf1.setBounds(150,60,150,20);
ff.add(un);
ff.add(tf1);
JLabel l3=new JLabel("Enter Password");
ff.add(l3);
l3.setBounds(50,100,150,20);
JPasswordField pf =new JPasswordField();
pf.setBounds(150,100,150,20);
ff.add(pf);
JCheckBox cb = new JCheckBox("Show password");
cb.setBounds(35,140,120,20);
ff.add(cb);
JTextField tf2=new JTextField();

JButton b=new JButton("Submit");
b.setBounds(110,180,80,25);
ff.add(b);
ff.setSize(500,500);
JButton lg=new JButton("<- BACK");
lg.setBounds(30,410,100,25 );
ff.add(lg);
JOptionPane.showMessageDialog(ff,"Check Your credentials");

lg.addActionListener(new ActionListener()
{
public  void actionPerformed(ActionEvent e)
{
	Welcome obj=new Welcome();
	ff.dispose();
}
});
cb.addItemListener(new ItemListener()
{    
     public void itemStateChanged(ItemEvent e) 
     {                 
    	 
    	if( e.getStateChange()==1)
    		{
    		String pw=String.valueOf(pf.getPassword()); 
    		tf2.setBounds(155,140,145,20);
			ff.add(tf2); 
    		tf2.setText(pw);
    		}
    	else
    	{
				tf2.setBounds(0,0,0,0);
				ff.add(tf2);
    	}
    }
 }); 

b.addActionListener(new ActionListener()
{
public  void actionPerformed(ActionEvent e)
{
	String pw=String.valueOf(pf.getPassword());  
	String un=tf1.getText();
	if(pw.equals("") || un.equals(""))
	{
		JOptionPane.showMessageDialog(ff,"All fields are Mandatory");
	}
	else
	{
		int n=1;
		try {
			Data obj=new Data(n,un,pw);
			ff.dispose();
		} 
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
}
});
}
}//login class ends


