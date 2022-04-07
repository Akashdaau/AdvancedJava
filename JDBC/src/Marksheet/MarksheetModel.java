package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
			
			conn.setAutoCommit(false);
			
		PreparedStatement ps = conn.prepareStatement("Insert into marksheet values(?,?,?,?,?,?)");
			
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getFname());
			ps.setString(3, bean.getLname());
			ps.setInt(4, bean.getPhy());
			ps.setInt(5, bean.getChem());
			ps.setInt(6, bean.getMaths());
			
			int r = ps.executeUpdate(); 
			

			/* PreparedStatement ps = conn.prepareStatement("Select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
				System.out.print(rs.getString(4));
				System.out.print(rs.getString(5));
				//System.out.println(rs.getString(6));
				 * 
				 */
			
			System.out.println(r +"inserted");
			conn.commit();
			
			
			
			//r.close();
			ps.close();
			conn.close();
			
	}

}

