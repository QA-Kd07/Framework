package Pom_Packs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alice_HomePage {

	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='STATE BANK OF INDIA']")
	private WebElement selectSbiEq;
	
	@FindBy(xpath="//span[text()='WIPRO EQ']")
	private WebElement selectWiproEq;
	
	@FindBy(xpath="//span[text()='HDFC LTD']")
	private WebElement selectHdfcEq;
	
	@FindBy(xpath="//button[@aria-label='Buy']")
	private WebElement clickonbuy;
	
	@FindBy(xpath="//span[text()='CNC']")
	private WebElement selectCNC;
	
	@FindBy(xpath="//span[text()='MIS']")
	private WebElement selectMIS;
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement enterQuantity;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement buystock;
	
	@FindBy(xpath="//button[@aria-label='account of current user']")
	private WebElement Profile;
	
	@FindBy(xpath="(//span[text()='Logout'])[2]")
	private WebElement Logout;
	
	
	// constructor
	public Alice_HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	public void searchforstock(String stockname) {
		search.click();
		search.sendKeys(stockname);
	}
	public void selectSbi() {
	    selectSbiEq.click();
	}
	public void selectWipro(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(selectWiproEq).click().build().perform();
	}
	public void selectHdfc(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(selectHdfcEq).click().build().perform();
	}
	public void clickonBUY() {
		clickonbuy.click();
	}
	public boolean selectCNC() {
		selectCNC.click();
		System.out.println("CNC is enable =" + selectCNC.isEnabled());
		boolean cnc = selectCNC.isEnabled();
		return cnc;
	}
	public void selectMIS() {
		selectMIS.click();
		System.out.println("MIS is Enable =" + selectMIS.isEnabled());
	}
	public void enterqty( String qty) throws InterruptedException {
		enterQuantity.clear();
		Thread.sleep(1500);
		enterQuantity.sendKeys(qty);
	}
	public void buystock() {
		buystock.click();	
	}
	public void Profile() {
		Profile.click();
	}
	public void LogOUT() {
		Logout.click();
	}
}
