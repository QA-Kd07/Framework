package Testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel2 {


	@BeforeClass 
	public void beforeclass() {
	
	}
	@BeforeMethod 
	public void beforemethod() {
		
	}
	@Test 
	public void test1() {
		System.out.println("1");
	}
	@Test 
	public void test2() {
		System.out.println("2");
	}
	@Test 
	public void test3() {
		System.out.println("3");
	}
	@Test 
	public void test4() {
		System.out.println("4");
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterClass
	public void Afterclss() {
		
	}

}
