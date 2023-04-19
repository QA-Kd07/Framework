package amazon_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLog_In {

	@FindBy(xpath= "//span[text()='Hello, Sign in']")
	private WebElement login;
	
	@FindBy(xpath= "//span[text()='Sign in']") 
	private WebElement signin;
	
	public AmazonLog_In(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void amazonSignInDropdown(WebDriver driver) {
	//	Actions act = new Actions(driver);
		login.click();
		
	}
	
	public void clickOnSignIn() {
		//signin.click();
	}
}
