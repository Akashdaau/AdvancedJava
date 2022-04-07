package Marksheet;

public class TestClassGet {
		public static void main(String[] args) throws Exception {

			testGet();
		}

		public static void testGet() throws Exception {
			MarksheetBean bean = new MarksheetBean();

			bean.setId(1);
			//bean.setFname("Akshay");
			
			//bean.setFname("Aksh");
			
		/*
		 * bean.setLname("Gupta"); bean.setPhy(70); bean.setChem(80); bean.setMaths(90);
		 */

			MarksheetModelGet model = new MarksheetModelGet();
			model.get(bean);
		}
	}


