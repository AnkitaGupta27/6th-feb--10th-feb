package org.antwalk;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
private String name,username,password;
private int age;
private String SSN;
private String address;
private String email;
private long phone;
private float bal;

@Autowired

@Qualifier("saving")
Account acc;
public void display()
{
	System.out.println("The account is :"+acc.showAccount());
}

}
