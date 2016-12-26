package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import customers.ICustomer;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		ICustomer customer=(ICustomer) ctx.getBean("customer");
		customer.haveDinner();
	}

}