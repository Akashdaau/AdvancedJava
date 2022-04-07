package CallableStatement;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

public class CSUpdate {

		public static void main(String[] args) throws Exception{
			testUpdate();
		}

		  public static void testUpdate() throws Exception {
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
		  
		 String Address="Srinagar";
		 
		 int Id = 1;
		 String LName="Patel";
		 
		  CallableStatement cs = conn.prepareCall("{CALL empcount(?)}");
		  
		  cs.setString(1, Address);
		  cs.setInt(3, Id);
		  cs.setString(2, LName);
		  
		  
		  int re = cs.executeUpdate();
		  
		  System.out.println(re + "updated");
		  
		  
		  //re.close(); 
		  cs.close(); conn.close();
		  
		  }


	}


}
