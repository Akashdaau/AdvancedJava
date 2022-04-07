package CallableStatement;

import java.sql.CallableStatement;
import java.sql.DriverManager;

public class CSInsert {
	 Class.forName("com.mysql.jdbc.Driver");
	  
	  java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
	
	  CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
	  
	stmt.setInt(1,1011);  
	stmt.setString(2,"Amit");  
	stmt.execute();  
	  
	System.out.println("success");  


}
