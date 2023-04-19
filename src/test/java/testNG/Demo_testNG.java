package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_testNG {

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforermethod() throws EncryptedDocumentException, IOException {
		System.out.println("before method");	
	}
	@Test (priority=0, groups = "even")
	public void TC01() {
		System.out.println("Test 1");	
	}
	@Test (dependsOnMethods ="TC04")
	public void TC02() {
		System.out.println("Test 2");	
	}
	@Test(timeOut = 1000)
	public void TC03() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 3");	
	}
	@Test(enabled = false)
	public void TC04() {
		System.out.println("Test 4");	
	}
	@Test(invocationCount = 3)
	public void TC05() {
		System.out.println("Test 5");	
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
}
