package Marksheet;

public class TestClassUpdate {
		public static void main(String[] args) throws Exception {

			testUpdate();
		}

		public static void testUpdate() throws Exception {
			MarksheetBean bean = new MarksheetBean();

			bean.setId(1);
			bean.setFname("Akshay");
			
			//bean.setFname("Aksh");
			
		/*
		 * bean.setLname("Gupta"); bean.setPhy(70); bean.setChem(80); bean.setMaths(90);
		 */

			MarksheetModelUpdate model = new MarksheetModelUpdate();
			model.update(bean);
		}
	}


