package Prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PSCrud {
	public static void main(String[] args) throws Exception{
		testSelect();
	}
	private static void testSelect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		PreparedStatement ps = conn.prepareStatement("Select * from Employee");
		
		ResultSet rs = ps.executeQuery();
		//ResultSet r = stmt.executeQuery("Select * from employee");
		
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getString(4));
			System.out.print(rs.getString(5));
			System.out.println(rs.getString(6));
			
		}
		
		rs.close();
		ps.close();
		conn.close();
		

}
}
