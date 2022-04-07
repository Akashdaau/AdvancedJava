package TransactionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TH {
	public static void main(String[] args) throws Exception {
		testInsert();
	}
		public static void testInsert() throws Exception{
	        Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			int r =  stmt.executeUpdate("Insert into department values(9,'Lab')");
				r= stmt.executeUpdate("Insert into department values(10,'Assistant')");
			
			
			conn.commit();
			
			System.out.println("inserted");
			
			
			stmt.close();
			conn.close();
		
		
	}

}
