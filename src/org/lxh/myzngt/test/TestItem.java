package org.lxh.myzngt.test;

import org.lxh.myzngt.dao.IItemDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IItemDAO id = (IItemDAO) ctx.getBean("iitemdaoimpl");
		System.out.println(id.queryAll());
	}

}
