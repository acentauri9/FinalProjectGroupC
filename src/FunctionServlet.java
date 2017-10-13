
import java.sql.*; 
import javax.swing.*;
import java.io.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;
public class FunctionServlet 
{
	//private Object String;
	//int acc =0;
	//int fin=0;
	static String UserId=null;
	static String name=null;
	static String email=null;
	static String phno=null;
	static String password=null;
	boolean flag = false;
    String databaseURL = "jdbc:mysql://localhost:3306/exampledb";
    String user = "root";
    String pwd = "passpass";
    Connection conn = null;
    public void connect()
    {
    	try 
    	{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(databaseURL, user, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
	public boolean VerifyUsers(String f, String s)
	{
		 try
		    {
			 
			connect();
	        String queryString = "SELECT * FROM personaldetails where UserId='"+f+"'";
	    	Statement st=conn.createStatement(); 
	        ResultSet results = st.executeQuery(queryString);
		    while (results.next())
		    {
		    	name = results.getString("Name");
		    	UserId= results.getString("UserId");
		        password =  results.getString("Password");
		        phno=results.getString("PhoneNumber");
		        email=results.getString("EmailId");
		     }
		    results.close();
	      }
	      catch(Exception e)
	      {
	        	
	      }
	      
	   if((f.equals(UserId)) && (s.equals(password))) 
	   {
		   flag = true;
	       
	       
	    }
	    else
	    {
	        flag=false;
	    }
	        
	     return flag;
	}
	String name()
	{
		return name;
	}
	String email()
	{
		return email;
	}
	String ph()
	{
		return phno;
	}
	void insertDetails(String n,String u,String p,String e,String ph)
	{
		try
		{
			connect();
			String queryString = "insert into personaldetails(Name,UserId,Password,EmailId,PhoneNumber)values(?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(queryString);
			stmt.setString(1,n);
			stmt.setString(2,u);
			stmt.setString(3,p);
			stmt.setString(4,e);
			stmt.setString(5,ph);
			stmt.executeUpdate();
			/*name =n;
	    	UserId= u;
	        password =p;
	        phno=ph;
	        email=e;*/
		}
		catch( SQLException sq)
		{
			System.out.println("Sql exception caught");
		}
	}
	
}