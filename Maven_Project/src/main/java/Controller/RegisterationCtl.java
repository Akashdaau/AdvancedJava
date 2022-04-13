package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import modelClass.MarksheetModelJDBC;

@WebServlet("/RegisterationCtl")
public class RegisterationCtl extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		 resp.setContentType("text/html");
			String F = req.getParameter("fname");
				String L = req.getParameter("lname");
			int dob = Integer.parseInt(req.getParameter("dob"));
				String email = req.getParameter("email");
				int contact = Integer.parseInt(req.getParameter("contact"));
				String gender = req.getParameter("gender");
				String address = req.getParameter("address");
				int createpass = Integer.parseInt(req.getParameter("pwd"));
			    
				
			
					PrintWriter out = resp.getWriter();
					
					out.println(F);
					out.println(L);
					out.println(dob);
					out.println(email);
					out.println(contact);
					out.println(gender);
					out.println(address);
					out.println(createpass);
	
	}
	
	
	
	

}
