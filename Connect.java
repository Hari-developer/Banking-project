package com.Besant.Banking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect
{

	static Connection getConnection()
	{
		
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/banking", "root", "Harisre");
		
			if(con!=null)
			{
				return con;
			}
		}
		catch(SQLException e)
			{
				e.getMessage();
				e.printStackTrace();
			}
			return null;
			
 }
	
}
