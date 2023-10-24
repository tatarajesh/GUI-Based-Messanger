package signup;

import main.*;



import welcome.*;
import data.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class Signup 
{
	public	Signup() 
	{
		JFrame f=new JFrame("Signup");
		f.setVisible(true);
		f.setLayout(null); 
		JLabel un=new JLabel("Set Username");
		un.setBounds(50,60,250,30 );
		JTextField tf1=new JTextField();
		tf1.setBounds(150,60,150,20);
		f.add(un);
		f.add(tf1);
		JLabel l3=new JLabel("Set Password");
		l3.setBounds(50,100,150,20);
		JPasswordField pf =new JPasswordField();
		pf.setBounds(150,100,150,20);
		f.add(pf);
		f.add(l3);
		JLabel l4=new JLabel("Re_enter Password");
		l4.setBounds(35,140,150,20);
		JPasswordField pf2 =new JPasswordField();
		pf2.setBounds(150,140,150,20);
		f.add(pf2);
		f.add(l4);
		JCheckBox cb = new JCheckBox("Show password");
		cb.setBounds(35,180,120,20);
		f.add(cb);
		JTextField tf2=new JTextField();
		//tf2.setBounds(155,180,145,20);
		JButton b=new JButton("SignUp");
		b.setBounds(115,230,80,25);
		f.add(b);
		JButton lg=new JButton("<- BACK");
		lg.setBounds(30,410,100,25 );
		f.add(lg);
		lg.addActionListener(new ActionListener()
		{
		public  void actionPerformed(ActionEvent e)
		{
			Welcome obj=new Welcome();
			f.dispose();
		}
		});
		cb.addItemListener(new ItemListener()
		{    
	         public void itemStateChanged(ItemEvent e) 
	         {                 
	        	 
	        	if( e.getStateChange()==1)
	        		{
	        		String pw=String.valueOf(pf.getPassword());  
	        		String pw2=String.valueOf(pf2.getPassword());  
	        		if(pw.equals(pw2))
	        		{
	        		tf2.setBounds(155,180,145,20);
					f.add(tf2); 
	        		tf2.setText(pw);
					}
	        		else
	        		{
	        			JOptionPane.showMessageDialog(f,"Check Your Password");
	        		}
	        		}
	        	else
	        	{
					tf2.setBounds(0,0,0,0);
					f.add(tf2);
	        	}
	         }    
	      });  
		f.setSize(500,500);
			
			b.addActionListener(new ActionListener()
			{
			public  void actionPerformed(ActionEvent e)
			{
				
				int flag=0;
				String pw=String.valueOf(pf.getPassword());  
	    		String pw2=String.valueOf(pf2.getPassword());  
	    		String un=tf1.getText();
	    		
	    		if(pw.equals("") || un.equals(""))
	    		{
	    			JOptionPane.showMessageDialog(f,"All fields are Mandatory");
	    		}
	    		else
	    		{
	    		if(pw.equals(pw2))
	    		{	
	    			try {
						Data obj=new Data(un,pw);
						//f.dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    			JOptionPane.showMessageDialog(f,"Account Created 'SUCCESSFULLY'");
	    			Welcome obj3=new Welcome();
	    			f.dispose();
	    		}
	    		else
	    		{
	    			JOptionPane.showMessageDialog(f,"Check Your Password");
	    		}
	    		}
			}
			});
			
		}
}//signup class ends

