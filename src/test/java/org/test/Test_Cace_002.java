package org.test;

import org.testng.annotations.Test;
import org.user.UserRegistrationPage;


public class Test_Cace_002 extends Test_Case_001 {
	@Test(priority = 1)
	public void test1() {
		Test_Case_001 tc = new Test_Case_001();
		tc.launchUrl();
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {
		Thread.sleep(3000);
		UserRegistrationPage r = new UserRegistrationPage();
		r.reg();
	}
	
	

	

	}

	



