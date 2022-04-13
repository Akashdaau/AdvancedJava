package BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementInsert {
	public static void main(String[] args) throws Exception{
	
		testInsert();
	}

	public static void testInsert() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
		
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		
		stmt.addBatch("insert into marksheet(id,fname,lname,phy,chem,maths) values(6, 'Zaheer', 'Abbbas', 67, 78, 89)");
		stmt.addBatch("insert into marksheet(id,fname,lname,phy,chem,maths) values(7, 'Zakir', 'Khan', 97, 78, 89)");
		stmt.addBatch("insert into marksheet(id,fname,lname,phy,chem,maths) values(8, 'Zabbar', 'Khan', 67, 78, 89)");
		stmt.addBatch("insert into marksheet(id,fname,lname,phy,chem,maths) values(9, 'Zubair', 'Abbbas', 67, 78, 89)");
		
		int[] count = stmt.executeBatch();
		
		conn.commit();
		
		System.out.println(count + "inserted");
		
		
		stmt.close();
		conn.close();
		
	}

}
