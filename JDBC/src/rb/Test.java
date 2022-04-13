package rb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import rb.MarksheetBean;
import rb.MarksheetModel;
	

	public class Test {
			public static void main(String[] args) throws Exception {

				testAdd();
			
			}

			public static void testAdd() throws Exception {
				MarksheetBean bean = new MarksheetBean();

				bean.setId(14);
				bean.setFname("Anuj");
				bean.setLname("Gupta");
				bean.setPhy(70);
				bean.setChem(80);
				bean.setMaths(90);

				MarksheetModel model = new MarksheetModel();
				model.add(bean);
			}

}
