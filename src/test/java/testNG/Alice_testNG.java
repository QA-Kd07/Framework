package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
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

public class Alice_testNG extends BaseClass {

	Alice_login login;
	Alice_Pin pin;
	Alice_HomePage home;
	Date d;
	
	@BeforeClass
	@Parameters("browser")
	public void beforeclass(String browser) throws InterruptedException {
		
		BaseClass.launchBrowser(browser);
		
		login = new Alice_login(driver);
		pin = new Alice_Pin(driver);
		home = new Alice_HomePage(driver);
		d = new Date();
	}
	@BeforeMethod
	public void beforermethod() throws EncryptedDocumentException, IOException {
		System.out.println("after method");
		Utility.path = "C:\\Users\\hp\\Desktop\\All Testing\\Project\\Alice Blue\\TC\\LogIn TC01.xlsx";
		Utility.sheetno = "Sheet1";
	
	
	}
	@Test
	public void TestLogin() throws InterruptedException, EncryptedDocumentException, IOException {
		
	
		String pd = Utility.getExcelData(8,7);
		System.out.println(pd);
		String id = Utility.getExcelData(7,7);
    	System.out.println(id);
		
		String expectedtitle = "Ant Web";
		String actualtitle = driver.getTitle();
		System.out.println("Title Match" + expectedtitle.equals(actualtitle));
		login.enteruserId(id);
		Thread.sleep(3000);
		login.enterpwd(pd);
		Thread.sleep(3000);
		login.clickloginbtn();
		Thread.sleep(3000);
		pin.enterPin("1994");
		Thread.sleep(3000);
		pin.clickonSubmit();
		Thread.sleep(3000);
		home.searchforstock("sbin");
		home.selectSbi();
		Thread.sleep(3000);
		home.clickonBUY();
		Thread.sleep(3000);
	    boolean cnc = home.selectCNC();
		assertTrue(cnc, "CNC Failed");
		
		Thread.sleep(3000);
		home.selectMIS();
		Thread.sleep(3000);
		home.enterqty("100");
		Thread.sleep(3000);
		String time = d.toString();
		Utility.takeScreenshot(time);
		Thread.sleep(3000);
		home.buystock();
		Thread.sleep(3000);
		home.Profile();
		Thread.sleep(3000);
		home.LogOUT();
		Thread.sleep(3000);
		
	}
		
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws InterruptedException, IOException {
	
		if(result.getStatus() == ITestResult.FAILURE) {
			Utility.takeScreenshot("Fail");
		}
		
		System.out.println("after method");
       
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	
}
