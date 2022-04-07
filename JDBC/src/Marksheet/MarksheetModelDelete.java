package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModelDelete {
	public void delete(MarksheetBean bean) throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
			
			conn.setAutoCommit(false);
			
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=?");
			
		
		ps.setInt(1, bean.getId());
		//ps.setString(1, bean.getFname());
		
		int r = ps.executeUpdate(); 
		System.out.println(r + "deleted");
		
		conn.commit();
		
		ps.close();
		conn.close();
		

}
}
