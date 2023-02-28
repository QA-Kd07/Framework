package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	public static WebDriver driver;
	public static String main;
	
	public static void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("ChromeBrowser")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\FireFoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		} else {
			System.out.println("no browser found");
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
}
