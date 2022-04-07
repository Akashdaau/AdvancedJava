package Marksheet;

public class TestClassDelete {
		public static void main(String[] args) throws Exception {

			testDelete();
		}

		public static void testDelete() throws Exception {
			MarksheetBean bean = new MarksheetBean();

			bean.setId(1);
			//bean.setFname("Akshay");
			
			//bean.setFname("Aksh");
			
		/*
		 * bean.setLname("Gupta"); bean.setPhy(70); bean.setChem(80); bean.setMaths(90);
		 */

			MarksheetModelDelete model = new MarksheetModelDelete();
			model.delete(bean);
		}
	}




