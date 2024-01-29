package org.user;

import org.base.BaseClass;
import org.pojo.RegisterPage;

public class UserRegistrationPage extends BaseClass {
	public void reg() throws InterruptedException {
		RegisterPage p = new RegisterPage();
		clickBtn(p.RegBtn);
		Thread.sleep(3000);
		clickBtn(p.getClikRadio());
		passText("sathish", p.getFirstName());
		passText("kumar", p.getLastName());
		passText("Sksathishbsk@gmail.com", p.getEmail());
		passText("Sathish@2001", p.getPass());
		passText("Sathish@2001", p.getConfomPass());
		Thread.sleep(3000);
		clickBtn(p.getRegBtn2());
		Thread.sleep(3000);
		clickBtn(p.contn);
		
		
		
		
		
	}
	
	
	
	
		
	}
		
	


