package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MarksheetModelGetMeritList {
	public ArrayList <MarksheetBean> getMeritList() throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
			
			conn.setAutoCommit(false);
			
			PreparedStatement ps = conn.prepareCall("select *, (Phy+Chem+Maths) as total, (Phy+Chem+Maths)/3 as percentage from marksheet where (Phy,Chem,Maths)>(40,40,40) order by (Phy+Chem+Maths)/3 desc limit 3");
			
			ResultSet rs = ps.executeQuery();
			
			ArrayList<MarksheetBean> listt = new ArrayList<MarksheetBean>();
			while(rs.next())
			{
				MarksheetBean bean1 = new MarksheetBean();
			
				bean1.setId(rs.getInt(1));
				bean1.setFname(rs.getString(2));
				bean1.setLname(rs.getString(3));
				bean1.setPhy(rs.getInt(4));
				bean1.setChem(rs.getInt(5));
				bean1.setMaths(rs.getInt(6));
				
				listt.add(bean1);

}
			conn.commit();
			ps.close();
			return listt;
}
}
