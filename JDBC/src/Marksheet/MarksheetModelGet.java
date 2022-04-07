package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModelGet {
	public void get(MarksheetBean bean) throws Exception
	{

	 Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id=?");
		
		ps.setInt(1, 1);
		
		ResultSet rs = ps.executeQuery(); 
		
		while(rs.next())
		{
			MarksheetBean bean1 = new MarksheetBean();
			
			bean1.setId(rs.getInt(1));
			bean1.setFname(rs.getString(2));
			bean1.setLname(rs.getString(3));
			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));
			
		}
            conn.commit();
           
			ps.close();
			conn.close();
			

}
		 
}
	
