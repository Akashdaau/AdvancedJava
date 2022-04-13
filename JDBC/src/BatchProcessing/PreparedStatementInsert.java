package BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementInsert {
	public static void main(String[] args) throws Exception{
		
		testInsert();
	}

	public static void testInsert() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Insert into marksheet values(?,?,?,?,?,?)");
		
		ps.setInt(1, 10);
		ps.setString(2, "Priya");
		ps.setString(3, "Sharma");
		ps.setInt(4, 88);
		ps.setInt(5, 98);
		ps.setInt(6, 78);
		
		ps.addBatch();
		
		ps.setInt(1, 11);
		ps.setString(2, "Riya");
		ps.setString(3, "Sharma");
		ps.setInt(4, 68);
		ps.setInt(5, 58);
		ps.setInt(6, 98);
		
		ps.addBatch();
		
int[] count = ps.executeBatch();
		
		conn.commit();
		
		
		System.out.println(count + "inserted");
		
		
		ps.close();
		conn.close();
		
		

}
}