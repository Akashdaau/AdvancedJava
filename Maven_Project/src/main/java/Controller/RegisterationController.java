package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RegisterationBean.RegisterationBean;
import RegisterationModel.RegisterationModel;

@WebServlet("/RegisterationController")
public class RegisterationController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
		 resp.setContentType("text/html");
		 
		 RegisterationBean bean = new RegisterationBean();
			String FName = req.getParameter("FName");
				String LName = req.getParameter("LName");
				String Email = req.getParameter("Email");
				int Contact = Integer.parseInt(req.getParameter("Contact"));
				String Address = req.getParameter("Address");
				int Password = Integer.parseInt(req.getParameter("Password"));
				
				bean.setFName(FName);
				bean.setLName(LName);
				bean.setEmail(Email);
				bean.setContact(Contact);
				bean.setAddress(Address);
				bean.setPassword(Password);	
		
		  RegisterationModel model = new RegisterationModel(); 
		  try {
			  model.add(bean); 
			  }
		  catch (Exception e) { 
			  e.printStackTrace();
		  }
		 
	}
	
	

}
