package Prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PSDelete {
		public static void main(String[] args) throws Exception {
			//testCRUD();
			//testUpdating();
			testDelete();
		}
		
		private static void testDelete() throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
			int id =8;
			
			PreparedStatement ps = conn.prepareStatement("delete from employee where id=?");
			
			ps.setInt(1, id);
			
			int re = ps.executeUpdate();
			
			System.out.println(re + "updated");
			
			
			//re.close();
			ps.close();
			conn.close();
		}
	}
