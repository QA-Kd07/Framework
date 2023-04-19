package testNG;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon_pom.AmazonLog_In;
import basePackage.BaseClass;
import utilityPackage.Utility;

public class Amazon_test extends BaseClass {
	
	AmazonLog_In login;
	
	@BeforeClass
	@Parameters("browser")
	public void browserLaunch(String browser) {

		launchBrowser(browser);
		login = new AmazonLog_In(driver);	
	}
	@BeforeMethod	
	public void giveMsg() {
	System.out.println("Started");	
	}
	@Test
	public void testLogin() throws InterruptedException, IOException {
		login.amazonSignInDropdown(driver);
		Thread.sleep(3000);
		login.clickOnSignIn();
		Thread.sleep(3000);
		//Utility.takeScreenshot(amzn);
		
		
	}
	@AfterMethod
	public void lastmsg() {
		System.out.println("Ended");	
	}
	@AfterClass() 
	public void closeBrowser() {
		driver.close();
	}

}
