package Prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class PSGet {
	public static void main(String[] args) throws Exception {
		testGet();
	}

	public static void testGet() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

		java.sql.PreparedStatement ps = conn.prepareStatement(("Select * from employee where ID=?"));

		// ps.setInt(1,pk);
		ps.setInt(1, 4);
		ResultSet rs = ps.executeQuery();
		// ResultSet r = stmt.executeQuery("Select * from employee");

		while (rs.next()) {
			
			  System.out.print(rs.getInt(1));
			 
			  System.out.print("\t" + rs.getString(2)); 
			
			  System.out.print("\t" + rs.getString(3)); System.out.print("\t" +
			  rs.getInt(4)); System.out.print("\t" + rs.getString(5));
			  System.out.println("\t" + rs.getInt(6));
			 
			 

		}
	}
}
