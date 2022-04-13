package rb;

import java.util.ResourceBundle;

public class MultiLanguage {
	public static void main(String[] args) {

		ResourceBundle rb1 = ResourceBundle.getBundle("rb.hi");
		System.out.println(rb1.getString("greeting"));

		// ,new Locale("sp")
	}
}
