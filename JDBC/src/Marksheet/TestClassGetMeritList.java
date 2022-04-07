package Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestClassGetMeritList {
	public static void main(String[] args) throws Exception {
		testGetMeritList();
	}

	private static void testGetMeritList() throws Exception{
		MarksheetModelGetMeritList model = new MarksheetModelGetMeritList();
		
		List listt = model.getMeritList();
		
		Iterator it = listt.iterator();
		
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
		/*
		 * if(listt == null) { System.out.println("list is null"); }
		 */
		
		
		
	}
	

}
