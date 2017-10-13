import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/loginServlet")
public class MainServlet extends HttpServlet 
{
	 FunctionServlet v= new  FunctionServlet();
	 protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
     {
    	 if(request.getParameter("pageName").equals("Login"))
    	 {
    	     String username = request.getParameter("userId");
    	     String password = request.getParameter("password");
    	     PrintWriter out = response.getWriter();
    	     if(v.VerifyUsers(username,password))
    	     {
    	            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/GoogleMap.jsp");
    	            dispatcher.forward(request, response);
    	      }
    	      else	
    	      {
    	            PrintWriter writer = response.getWriter();
    	            String htmlRespone = "<html>";
    	            htmlRespone += "<h2>Your username or password does not exist";    
    	            htmlRespone += "</html>";
    	            writer.println(htmlRespone);
    	        }
    	         
    	  }
    	 if(request.getParameter("pageName").equals("SignUp"))
    	 {
    		 String userName = request.getParameter("userName");
    		 String userId = request.getParameter("userid");
    		 String pwd = request.getParameter("password");
    		 String email = request.getParameter("email");
    		 String phno = request.getParameter("phno");
    		 v.insertDetails(userName,userId,pwd,email,phno);
    		 //PrintWriter out = response.getWriter();
    		// out.println("login");
    		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/LoginPage.jsp");
	         dispatcher.forward(request, response);
    	 }
    	         
     }
}