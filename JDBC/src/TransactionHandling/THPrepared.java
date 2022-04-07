package TransactionHandling;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class THPrepared {
	

			public static void main(String[] args) throws Exception {
				testInsert();
			}
				public static void testInsert() throws Exception{
			        
			        	Class.forName("com.mysql.jdbc.Driver");
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
					
					conn.setAutoCommit(false);
					
					//Statement stmt = conn.createStatement();
					
					int ID = 14;
					String dept_name ="Teaching";
					
					try{PreparedStatement ps = conn.prepareStatement("Insert into department values(?,?)");
					ps=conn.prepareStatement("Insert into department values(?,?)");
					
				
					ps.setInt(1,ID);
					ps.setString(2, dept_name);
					
					
					conn.commit();
					
					int r = ps.executeUpdate();
					System.out.println(r + "try chal gaya");
					}
			        
					catch(SQLException e)
					{
						conn.rollback();
						System.out.println("catch me gaya");
					}
					
					
					
					
					//ps.close();
					conn.close();
				
				
			}

		}
