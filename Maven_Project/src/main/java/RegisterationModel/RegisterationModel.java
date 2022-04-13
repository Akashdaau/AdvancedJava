package RegisterationModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import RegisterationBean.RegisterationBean;


public class RegisterationModel {
	
	public void add(RegisterationBean bean) throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration","root","root");
			
			conn.setAutoCommit(false);
			
		PreparedStatement ps = conn.prepareStatement("Insert into user values(?,?,?,?,?,?)");
			
			ps.setString(1, bean.getFName());
			ps.setString(2, bean.getLName());
			ps.setString(3, bean.getEmail());
			ps.setInt(4, bean.getContact());
			ps.setString(5, bean.getAddress());
			ps.setInt(6, bean.getPassword());
			
			int r = ps.executeUpdate(); 
			
			System.out.println(r +"inserted");
			conn.commit();
			ps.close();
			conn.close();

}
}
