package Pom_Packs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alice_login {

	// declaration :- as private
	
  	@FindBy(xpath="//input[@name='userId']")
  	private WebElement userID;
  	
  	@FindBy(xpath="//input[@name='password']")
  	private WebElement pwd;
  	
  	@FindBy(xpath="//button[@type='submit']")
  	private WebElement login;
  	
  	@FindBy(xpath="//a[text()='Forgot Password/2FA?']")
  	private WebElement forgotPwd;
  	
  	@FindBy(xpath= "//a[text()='Switch User']")
  	private WebElement switchUser;
  	
  	// Initialization := always create constructor
  	
  	public Alice_login(WebDriver driver) {
  		
  		PageFactory.initElements(driver, this);;
  	}
  	// usage :- methods(Action)
  	
  	
  	public void enteruserId(String userid) throws InterruptedException {
  		userID.sendKeys(userid);;
  	}
  	
  	public void enterpwd(String pwsd) throws InterruptedException {
  		pwd.clear();
  		Thread.sleep(3000);
  		pwd.sendKeys(pwsd);
  	}
  	
  	public void clickloginbtn() {
  		login.click();
  	}
  	
  	public void clickforgotpwd() {
  		forgotPwd.click();
  	}
  	
  	public void clickSwitchUser() {
  		switchUser.click();
  	}
  	public void clearText() throws InterruptedException {
  		userID.clear();
  		Thread.sleep(4000);
  	} 	
	
}
