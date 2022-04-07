package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUPDATE {
	public static void main(String[] args) throws Exception {
		//testCRUD();
		//testUpdating();
		testDelete();
	}
	
	private static void testDelete() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		Statement stmt = conn.createStatement();
		
		int re = stmt.executeUpdate("delete from employee where id=6");
		
		System.out.println(re + "updated");
		
		
		//re.close();
		stmt.close();
		conn.close();
	}
}
		
	

/*
 * private static void testUpdating() throws Exception {
 * Class.forName("com.mysql.jdbc.Driver");
 * 
 * Connection conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root",
 * "root");
 * 
 * Statement stmt = conn.createStatement();
 * 
 * int re =
 * stmt.executeUpdate(" update employee set Address='Mumbai' where Id=6");
 * 
 * System.out.println(re + "updated");
 * 
 * 
 * //re.close(); stmt.close(); conn.close();
 * 
 * }
 * 
 * private static void testCRUD() throws Exception {
 * Class.forName("com.mysql.jdbc.Driver");
 * 
 * Connection conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root",
 * "root");
 * 
 * Statement stmt = conn.createStatement();
 * 
 * int re = stmt.
 * executeUpdate("Insert into employee values(6,'Shivam','Patel',56000,'Agra',3)"
 * );
 * 
 * System.out.println(re + "inserted");
 * 
 * 
 * //re.close(); stmt.close(); conn.close();
 * 
 * }
 * 
 * 
 * }
 */