package org.antwalk;

import org.antwalk.interfaces.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	Customer c1=context.getBean(Customer.class);
	c1.display();
	Account saving=context.getBean("saving",Account.class);
	Account current=context.getBean("current",Account.class);
	System.out.println(saving.showAccount());
	System.out.println(current.showAccount());
//	System.out.println(c1.display());rr
//	System.out.println(c2.display());

}
}
