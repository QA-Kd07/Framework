package Pom_Packs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alice_Pin {

	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement sbt;
	
	public Alice_Pin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String Pin) {
		pin.sendKeys(Pin);
	}
	
	public void clickonSubmit() {
		sbt.click();
	}
	
}
