package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {
	public static void main(String[] args) throws Exception{
		testSelect();
		testInsert();
	}

	public static void testInsert() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		
		int r =  stmt.executeUpdate("Insert into employee values(12,'Hari','Patel',56000,'Agra',3)");
			r= stmt.executeUpdate("Insert into employee values(13,'Harish','Patel',56000,'Agra',3)");
		
		
		conn.commit();
		
		
		stmt.close();
		conn.close();
		
	}
	

	
	private static void testSelect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from employee");
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
		
		stmt.close();
		conn.close();
		
	
		
	
	}
	

}
