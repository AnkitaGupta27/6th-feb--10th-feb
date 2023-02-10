package org.antwalk;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{
	public String showAccount() {
		return "Current";
	}

}
