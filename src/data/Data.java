package data;

import chat.*;

import login.*;
import java.io.*;
import java.util.*;
import java.awt.Component;
import java.awt.event.*;
import javax.swing.*;

	public class Data
	{
		public Data(String nid,String npw) throws IOException
		{
			String id=nid;
			String pw=npw;
			FileOutputStream f=null;
			
			try {
				f=new FileOutputStream("output.txt",true);
				String str1=id;
				String str=";";
				String str2=pw;
				String strf=" ";
				
				byte[] byteArray1=str1.getBytes();
				byte[] byteArray=str.getBytes();
				byte[] byteArray2=str2.getBytes();
				byte[] byteArrayf=strf.getBytes();
				
				f.write(byteArray1);
				f.write(byteArray);
				f.write(byteArray2);
				f.write(byteArrayf);
				//System.out.print("successfully written");
			}
			finally
			{
				if(f != null)
				{
					f.close();
				}
			}
		}
		
		public Data(int n,String nid,String npw) throws IOException
		{
			int no=0;
			File f1=new File("output.txt"); 
		      String[] words=null;  
		      FileReader fr = new FileReader(f1);  
		      BufferedReader br = new BufferedReader(fr); 
		      String s;     
		      String input=nid+";"+npw;
		      int flag=0;
		     // System.out.print("search="+input);
		      while((s=br.readLine())!=null && flag != 1)  
		      {
		         words=s.split(" ");  
		          for (String word : words) 
		          {
		                 if (word.equals(input))   //Search for the given word
		                 {
		                	 Chat obj=new Chat();
		                	 flag=1;
		                 }
		          }
		      }
		      if(flag==0)
		      {
		    	  no=5;
		    	  Login obj=new Login(no);
		      }
		         fr.close();
		   }
}
			    


