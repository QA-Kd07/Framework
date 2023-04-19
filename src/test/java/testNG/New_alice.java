package testNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pom_Packs.Alice_HomePage;
import Pom_Packs.Alice_Pin;
import Pom_Packs.Alice_login;
import basePackage.BaseClass;
import utilityPackage.Utility;

public class New_alice extends BaseClass  {
	
	Alice_login login;
	Alice_Pin pin;
	Alice_HomePage home;
	String userid; // declared globally
	String pwd;
	String pin1;
	
	@BeforeClass 
	@Parameters("browser")
	public void broserLaunch(String browser) {

		launchBrowser(browser);
		login = new Alice_login(driver);
		pin = new Alice_Pin(driver);
		home = new Alice_HomePage(driver);
	}
	@BeforeMethod 
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		Utility.path = "C:\\Users\\hp\\Desktop\\All Testing\\Project\\Alice Blue\\TC\\LogIn TC01.xlsx";
		Utility.sheetno = "Sheet1";
		 userid = Utility.getExcelData(7, 7); // stored data from excel sheet
		 pwd = Utility.getExcelData(8, 7);
		 pin1 = "1994";
		
	}
	@Test (priority = 0)
	public void testLogin () throws InterruptedException, IOException {
		Thread.sleep(3000);
		login.enteruserId(userid);
		Thread.sleep(3000);
		login.enterpwd(pwd);
		Thread.sleep(3000);
		login.clickloginbtn();
		Thread.sleep(3000);
		pin.enterPin(pin1);
		Thread.sleep(3000);
		pin.clickonSubmit();
		Thread.sleep(6000);
		Utility.takeScreenshot("testLogin");
		Thread.sleep(3000);
		    
	}
	@Test (priority = 1)
	public void addStocksToWatchlist () throws InterruptedException, IOException {
		home.searchforstock("Sbin");
		Thread.sleep(2000);
		home.selectSbi();
		Thread.sleep(2000);
		home.searchforstock("Wipro");
		Thread.sleep(2000);
		home.selectWipro(driver);
		Thread.sleep(2000);
		home.searchforstock("Hdfc");
		Thread.sleep(2000);
		home.selectHdfc(driver);
		Thread.sleep(2000);
		Utility.takeScreenshot("Watchlist");
		Thread.sleep(3000);

	}
	@AfterMethod 
	public void aftermethod () {
		
	}
	
	@AfterClass 
	public void afterClass () throws InterruptedException {
		home.Profile();
		Thread.sleep(3000);
		home.LogOUT();
		Thread.sleep(3000);
	    login.clickSwitchUser();
	    Thread.sleep(3000);
	    driver.quit();
	}

}
