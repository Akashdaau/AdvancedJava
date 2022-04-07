package Prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PSInsert {
	public static void main(String[] args) throws Exception {
		testInsert();
	}

		public static void testInsert() throws Exception{
	        Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
			int Id = 8;
			String FName = "Payal";
			String LName = "Verma";
			int Salary = 30000;
			String Address = "Pune";
			int dept_id = 3;
			
			PreparedStatement ps = conn.prepareStatement("Insert into employee values(?,?,?,?,?,?)");
			
		
			ps.setInt(1,Id);
			ps.setString(2, FName);
			ps.setString(3, LName);
			ps.setInt(4,Salary);
			ps.setString(5, Address);
			ps.setInt(6,dept_id);
			
			int r =  ps.executeUpdate();
			System.out.println(r + "inserted");
			
			
			ps.close();
			conn.close();
		
	
	

}
}