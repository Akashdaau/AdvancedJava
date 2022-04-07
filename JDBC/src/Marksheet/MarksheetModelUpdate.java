package Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModelUpdate {
	public void update(MarksheetBean bean) throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
			
			conn.setAutoCommit(false);
			
		PreparedStatement ps = conn.prepareStatement("update marksheet set fname=? where id=?");
			
		
		ps.setInt(2, bean.getId());
		ps.setString(1, bean.getFname());
		
		//ps.setInt(1, bean.getId());
			/*ps.setString(2, bean.getFname());
			ps.setString(3, bean.getLname());
			ps.setInt(4, bean.getPhy());
			ps.setInt(5, bean.getChem());
			ps.setInt(6, bean.getMaths());*/
			
			int r = ps.executeUpdate(); 
			System.out.println(r + "updated");
			
			conn.commit();
			
			ps.close();
			conn.close();

}
}
