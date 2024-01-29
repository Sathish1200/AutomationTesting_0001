package org.test;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test_Case_001 extends BaseClass {
	@BeforeClass
	public void launchtheBrowser() throws InterruptedException {
		Thread.sleep(3000);
		launchBrowser();
		WindowMaximize();

	}

	@AfterClass
	public void closetheBrowser() {
//		closeEntireBrowser();

	}

	@Test
	public void launchUrl() {
		launchUrl("https://demowebshop.tricentis.com/");

	
	
	

}
}



