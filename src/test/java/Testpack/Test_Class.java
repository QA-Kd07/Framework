package Testpack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Packs.Alice_HomePage;
import Pom_Packs.Alice_Pin;
import Pom_Packs.Alice_login;

public class Test_Class {
public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://ant.aliceblueonline.com/");
	Thread.sleep(3000);
	
	Alice_login alice = new Alice_login(driver);
	alice.enteruserId("173858");
	Thread.sleep(3000);
	alice.enterpwd("KhushD@1994");
	Thread.sleep(3000);
	alice.clickloginbtn();
	Thread.sleep(3000);
	
	Alice_Pin alice1=new Alice_Pin(driver);
	alice1.enterPin("1994");
	Thread.sleep(3000);
	alice1.clickonSubmit();
	Thread.sleep(3000);
	
	Alice_HomePage alice2=new Alice_HomePage(driver);
	Thread.sleep(3000);
	alice2.searchforstock("sbin");
	Thread.sleep(3000);
	alice2.selectSbi();
	Thread.sleep(3000);
	alice2.clickonBUY();
	Thread.sleep(3000);
	alice2.selectCNC();
	Thread.sleep(3000);
	alice2.selectMIS();
	Thread.sleep(3000);
	alice2.enterqty("100");
	alice2.buystock();
	Thread.sleep(3000);
	alice2.Profile();
	Thread.sleep(3000);
	alice2.LogOUT();
	
}
}
