package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CSCrud {
	public static void main(String[] args) throws Exception{
		testSelect();
	}
	private static void testSelect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		CallableStatement cs = conn.prepareCall("{CALL empCount(?)}");
		
		cs.registerOutParameter(1,Types.INTEGER);
		
		cs.execute();
		
		/*
		 * int count = cs.getInt(1);
		 * 
		 * System.out.println("count"+count);
		 * 
		 * 
		 */
		
	     System.out.println("emp  " + cs.getInt(1));
		

}
}