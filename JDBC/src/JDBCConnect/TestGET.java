package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestGET {
	public static void main(String[] args) throws Exception {
		testGet();
	}

	public static void testGet() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from employee where id =4");
		
		// ResultSet r = stmt.executeQuery("Select * from employee");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getString(4));
			System.out.print(rs.getString(5));
			System.out.println(rs.getString(6));

		}
	}
}
