package testClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*import Marksheet.MarksheetBean;
import Marksheet.MarksheetModel;
import Marksheet.MarksheetModelDelete;
import Marksheet.MarksheetModelGetMeritList;
import Marksheet.MarksheetModelSearch;
import Marksheet.MarksheetModelUpdate;*/
import beanClass.MarksheetBeanJDBC;
import modelClass.MarksheetModelJDBC;

	

	

	public class Test {
			public static void main(String[] args) throws Exception {

				//testAdd();
				
				//testUpdate();
				//testDelete();
				testSearch();
				//testGetMeritList();
				//testGet();
			}

			public static void testAdd() throws Exception {
				MarksheetBeanJDBC bean = new MarksheetBeanJDBC();

				bean.setId(7);
				bean.setFname("Amar");
				bean.setLname("Gupta");
				bean.setPhy(70);
				bean.setChem(80);
				bean.setMaths(90);

				MarksheetModelJDBC model = new MarksheetModelJDBC();
				model.add(bean);
			}
	public static void testUpdate() throws Exception {
		MarksheetBeanJDBC bean2 = new MarksheetBeanJDBC();

		bean2.setId(7);
		bean2.setFname("Ajay");
		
		//bean.setFname("Aksh");
		
	/*
	 * bean.setLname("Gupta"); bean.setPhy(70); bean.setChem(80); bean.setMaths(90);
	 */

		MarksheetModelJDBC model2 = new MarksheetModelJDBC();
		model2.update(bean2);
	}
	public static void testDelete() throws Exception {
		MarksheetBeanJDBC bean3 = new MarksheetBeanJDBC();

		bean3.setId(7);
		//bean.setFname("Akshay");
		
		//bean.setFname("Aksh");
		
	/*
	 * bean.setLname("Gupta"); bean.setPhy(70); bean.setChem(80); bean.setMaths(90);
	 */

		MarksheetModelJDBC model3 = new MarksheetModelJDBC();
		model3.delete(bean3);
	}
	public static void testSearch() throws Exception {
		
		MarksheetModelJDBC model4 = new MarksheetModelJDBC();
		
		List list = model4.search();
		
		Iterator it = list.iterator();
				
		while(it.hasNext())
		{
			MarksheetBeanJDBC bean4 = (MarksheetBeanJDBC) it.next();
			
			System.out.println(bean4.getId());
			System.out.println(bean4.getFname());
			System.out.println(bean4.getLname());
			System.out.println(bean4.getPhy());
			System.out.println(bean4.getChem());
			System.out.println(bean4.getMaths());
			
		}
		
		  if(list == null)
		  {
		  System.out.println("list is null");
		  }
	}

	private static void testGetMeritList() throws Exception{
		MarksheetModelJDBC model5 = new MarksheetModelJDBC();
		
		List listt = model5.getMeritList();
		
		Iterator it = listt.iterator();
		
		while(it.hasNext())
		{
			MarksheetBeanJDBC bean5 = (MarksheetBeanJDBC) it.next();
			
			System.out.println(bean5.getId());
			System.out.println(bean5.getFname());
			System.out.println(bean5.getLname());
			System.out.println(bean5.getPhy());
			System.out.println(bean5.getChem());
			System.out.println(bean5.getMaths());
		}
		/*
		 * if(listt == null) { System.out.println("list is null"); }
		 */
		
		
		
	}
	public static void testGet() throws Exception {
		
		MarksheetModelJDBC model6 = new MarksheetModelJDBC();
		
		List listtt = model6.get(2);
		
		Iterator it = listtt.iterator();
				
		while(it.hasNext())
		{
			MarksheetBeanJDBC bean6 = (MarksheetBeanJDBC) it.next();
			
			//bean6.setId(5);
			System.out.println(bean6.getId());
			System.out.println(bean6.getFname());
			System.out.println(bean6.getLname());
			System.out.println(bean6.getPhy());
			System.out.println(bean6.getChem());
			System.out.println(bean6.getMaths());
			
		}


	}
	}


