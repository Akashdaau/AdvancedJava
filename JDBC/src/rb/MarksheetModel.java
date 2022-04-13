package rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import MarksheetJDBC.MarksheetBeanJDBC;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception
	{
		ResourceBundle rb = ResourceBundle.getBundle("rb.app");
		
		Class.forName(rb.getString("driver"));
			Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("pwd"));
			
			conn.setAutoCommit(false);
			
		PreparedStatement ps = conn.prepareStatement("Insert into marksheet values(?,?,?,?,?,?)");
			
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getFname());
			ps.setString(3, bean.getLname());
			ps.setInt(4, bean.getPhy());
			ps.setInt(5, bean.getChem());
			ps.setInt(6, bean.getMaths());
			
			int r = ps.executeUpdate(); 
			
			System.out.println(r +"inserted");
			conn.commit();
			
			ps.close();
			conn.close();

}
}