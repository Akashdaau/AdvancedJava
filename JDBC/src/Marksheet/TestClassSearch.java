package Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestClassSearch {
	public static void main(String[] args) throws Exception {

		testSearch();
	}

	public static void testSearch() throws Exception {
		
		MarksheetModelSearch model = new MarksheetModelSearch();
		
		List list = model.search();
		
		Iterator it = list.iterator();
				
		while(it.hasNext())
		{
			MarksheetBean bean = (MarksheetBean) it.next();
			
			System.out.println(bean.getId());
			System.out.println(bean.getFname());
			System.out.println(bean.getLname());
			System.out.println(bean.getPhy());
			System.out.println(bean.getChem());
			System.out.println(bean.getMaths());
			
		}
		
		  if(list == null)
		  {
		  System.out.println("list is null");
		  }
}
}
