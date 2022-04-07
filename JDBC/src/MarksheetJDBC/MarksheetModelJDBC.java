package MarksheetJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MarksheetModelJDBC {

			public void add(MarksheetBeanJDBC bean) throws Exception
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




		public void update(MarksheetBeanJDBC bean2) throws Exception
		{
			 Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
				
				conn.setAutoCommit(false);
				
			PreparedStatement ps = conn.prepareStatement("update marksheet set fname=? where id=?");
				
			
			ps.setInt(2, bean2.getId());
			ps.setString(1, bean2.getFname());
			
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
		public void delete(MarksheetBeanJDBC bean3) throws Exception
		{
			 Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
				
				conn.setAutoCommit(false);
				
			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=?");
				
			
			ps.setInt(1, bean3.getId());
			//ps.setString(1, bean.getFname());
			
			int r = ps.executeUpdate(); 
			System.out.println(r + "deleted");
			
			conn.commit();
			
			ps.close();
			conn.close();
			

	}
		public ArrayList <MarksheetBeanJDBC> search() throws Exception
		{
			 Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
				
				conn.setAutoCommit(false);
				
				PreparedStatement ps = conn.prepareCall("select * from marksheet");
				
				ResultSet rs = ps.executeQuery();
				
				ArrayList<MarksheetBeanJDBC> list = new ArrayList<MarksheetBeanJDBC>();
				
				while(rs.next())
				{
					MarksheetBeanJDBC bean4 = new MarksheetBeanJDBC();
					
					bean4.setId(rs.getInt(1));
					bean4.setFname(rs.getString(2));
					bean4.setLname(rs.getString(3));
					bean4.setPhy(rs.getInt(4));
					bean4.setChem(rs.getInt(5));
					bean4.setMaths(rs.getInt(6));
					
					list.add(bean4);
					
					
					
				}
				
				conn.commit();
				
				ps.close();
				conn.close();
				return list;
		}
		public ArrayList <MarksheetBeanJDBC> getMeritList() throws Exception
		{
			 Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
				
				conn.setAutoCommit(false);
				
				PreparedStatement ps = conn.prepareCall("select *, (Phy+Chem+Maths) as total, (Phy+Chem+Maths)/3 as percentage from marksheet where (Phy,Chem,Maths)>(40,40,40) order by (Phy+Chem+Maths)/3 desc limit 3");
				
				ResultSet rs = ps.executeQuery();
				
				ArrayList<MarksheetBeanJDBC> listt = new ArrayList<MarksheetBeanJDBC>();
				while(rs.next())
				{
					MarksheetBeanJDBC bean5 = new MarksheetBeanJDBC();
				
					bean5.setId(rs.getInt(1));
					bean5.setFname(rs.getString(2));
					bean5.setLname(rs.getString(3));
					bean5.setPhy(rs.getInt(4));
					bean5.setChem(rs.getInt(5));
					bean5.setMaths(rs.getInt(6));
					
					listt.add(bean5);

	}
				conn.commit();
				ps.close();
				return listt;
	}
		public void get(MarksheetBeanJDBC bean6) throws Exception
		{
			 Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcmarksheet","root","root");
				
				conn.setAutoCommit(false);
				
			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id=?");
				
			
			ps.setInt(1, bean6.getId());
	}
}




