package Prepared;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

public class PSUpdate {
	public static void main(String[] args) throws Exception{
		testUpdate();
	}

	  public static void testUpdate() throws Exception {
	  Class.forName("com.mysql.jdbc.Driver");
	  
	  java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
	  
	 String Address="Srinagar";
	 
	 int Id = 1;
	 String LName="Patel";
	 
	  PreparedStatement ps = conn.prepareStatement(" update employee set Address=?, LName=? where Id=?");
	  
	  ps.setString(1, Address);
	  ps.setInt(3, Id);
	  ps.setString(2, LName);
	  
	  
	  int re = ps.executeUpdate();
	  
	  System.out.println(re + "updated");
	  
	  
	  //re.close(); 
	  ps.close(); conn.close();
	  
	  }


}
