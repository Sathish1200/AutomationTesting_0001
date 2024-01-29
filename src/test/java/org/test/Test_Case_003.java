package org.test;

import org.testng.annotations.Test;
import org.user.ProductPurchasePage;
import org.user.UserRegistrationPage;

public class Test_Case_003 extends Test_Cace_002 {

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

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		ProductPurchasePage pp = new ProductPurchasePage();
		Thread.sleep(3000);
		pp.purchaseProduct();
	}

}
