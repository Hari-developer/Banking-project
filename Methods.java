package com.Besant.Banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Methods extends Connect {
	
	public static void choice() throws SQLException
	{
		
		System.out.println("1.Insert      :2.Update      :3.Delete     :4.ShowData      :5.Exit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		 if(n==1)
		 {
		      insertRecord();
		 }
		
	}
	                  //INSERT QUERY  
	public static  void  insertRecord() throws SQLException
	{
		Connection con=getConnection();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("<<<<----------SIGN UP---------->>>>");
		System.out.println();
		
		System.out.println("Enter your Id");
	         int Id=sc.nextInt();
	    System.out.println("Enter your Name");
	         String Name=sc.next();
	    System.out.println("Enter your mail");
	         String Mail=sc.next();
	    System.out.println("Enter your Phno");
	          long Phno=sc.nextLong();
	    System.out.println("Enter your Account_num");
	          long Account_num=sc.nextLong();
	    
	    String q="INSERT INTO USER VALUES (?,?,?,?,?);";
	    PreparedStatement p=con.prepareStatement(q);
	    p.setInt(1,Id);
	    p.setString(2,Name);
	    p.setString(3,Mail);
	    p.setLong(4,Phno );
	    p.setLong(5,Account_num);
	    p.execute();
	    
	   
     System.out.println("<<<-----Insert Successfully----->>>");
     System.out.println();
     choice();
	  }
	

	}
