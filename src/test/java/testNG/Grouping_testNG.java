package testNG;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Grouping_testNG {
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforermethod() {
		System.out.println("before method");	
	}
	@Test (groups = "odd" , priority=0)
	public void TC01() {
		Date d = new Date();
		System.out.println(d.toString());
		
		System.out.println("Test 1");	
	}
	@Test (groups = "even" , priority=1)
	public void TC02() {
		System.out.println("Test 2");	
	}
	@Test (groups = "odd", priority=2)
	public void TC03()  {
		
		System.out.println("Test 3");	
	}
	@Test (groups = "even", priority=3)
	public void TC04() {
		System.out.println("Test 4");	
	}
	@Test (groups = "odd", priority=4)
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
