package Marksheet;

public class TestClass {
	public static void main(String[] args) throws Exception {

		testAdd();
	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setId(1);
		bean.setFname("Akash");
		bean.setLname("Gupta");
		bean.setPhy(70);
		bean.setChem(80);
		bean.setMaths(90);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}
}
