package chat;

import main.*;

import welcome.*;
import data.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;


public class Chat 
{
public Chat()
{
	JFrame f=new JFrame("Online"); 
	f.setVisible(true);
	f.setLayout(null);
	JLabel un0=new JLabel("Friends...");
	un0.setBounds(80,20,250,30 );
	f.add(un0);
	JButton b1=new JButton("Rajesh");
	b1.setBounds(150,50,100,30);
	f.add(b1);
	JButton b2=new JButton("Chandrika");
	b2.setBounds(150,100,100,30);
	f.add(b2);
	JButton b3=new JButton("Rakesh");
	b3.setBounds(150,150,100,30);
	f.add(b3);
	JButton b4=new JButton("Harini");
	b4.setBounds(150,200,100,30);
	f.add(b4);
	JButton b5=new JButton("Mahesh");
	b5.setBounds(150,250,100,30);
	f.add(b5);
	JButton b6=new JButton("NTR");
	b6.setBounds(150,300,100,30);
	f.add(b6);
	JLabel un=new JLabel("Mass Messanger...");
	un.setBounds(250,360,250,30 );
	f.add(un);
	JButton lg=new JButton("LOGOUT");
	lg.setBounds(300,400,120,30 );
	f.add(lg);
	f.setSize(500,500);
	
	lg.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		Welcome obj=new Welcome();
		f.dispose();
	}
	});
	
	b1.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	b2.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	b3.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	b4.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	b5.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	b6.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		history();
		f.dispose();
	}
	});
	
}
void history()
{
	JFrame f=new JFrame("Online"); 
	f.setVisible(true);
	f.setLayout(null);
	
	JLabel un=new JLabel("Enter Message...");
	un.setBounds(50,120,250,30 );
	f.add(un);
	JTextField tf=new JTextField();
	tf.setBounds(50,150,250,50);
	f.add(tf);
	JButton msg=new JButton("Send");
	msg.setBounds(297,200,80,30 );
	f.add(msg);
	JButton lg=new JButton("<- BACK");
	lg.setBounds(50,410,100,23);
	f.add(lg);
	f.setSize(500,500);
	JButton lgd=new JButton("LOGOUT->");
	lgd.setBounds(310,410,100,23 );
	f.add(lgd);
	f.setSize(500,500);
	
	
	msg.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		tf.setText("");
		JOptionPane.showMessageDialog(f,"Message sent successfully");
	}
	});
	lgd.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		Welcome obj=new Welcome();
		f.dispose();
	}
	});
	lg.addActionListener(new ActionListener()
	{
	public  void actionPerformed(ActionEvent e)
	{
		Chat obj=new Chat();
		f.dispose();
	}
	});
	
}
}