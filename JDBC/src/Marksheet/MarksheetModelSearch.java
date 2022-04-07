package Marksheet;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MarksheetModelSearch {
	public ArrayList <MarksheetBean> search() throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
			
			conn.setAutoCommit(false);
			
			PreparedStatement ps = conn.prepareCall("select * from marksheet");
			
			ResultSet rs = ps.executeQuery();
			
			ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
			
			while(rs.next())
			{
				MarksheetBean bean = new MarksheetBean();
				
				bean.setId(rs.getInt(1));
				bean.setFname(rs.getString(2));
				bean.setLname(rs.getString(3));
				bean.setPhy(rs.getInt(4));
				bean.setChem(rs.getInt(5));
				bean.setMaths(rs.getInt(6));
				
				list.add(bean);
				
				
				
			}
			
			conn.commit();
			
			ps.close();
			conn.close();
			return list;
	}

}
