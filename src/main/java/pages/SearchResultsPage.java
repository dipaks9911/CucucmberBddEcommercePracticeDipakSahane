package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class SearchResultsPage {
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public SearchResultsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	elementUtils=new ElementUtils(driver);	
	}
	@FindBy(xpath="//a[normalize-space()='HP LP3065']")
	private WebElement validHPProduct;
	
	@FindBy(xpath="//p[contains(text(),'Stop your co-workers in their tracks with the stun')]")
	private WebElement messageText;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	private WebElement invalidProduct;
	
	
	public boolean displayStatusOfValidProduct() {
		return elementUtils.displayStatusOfElement(validHPProduct, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}
	
	
	public String getMessageText() {
		return elementUtils.getTextFromElement(messageText, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}	
	
	public String getMessageText1() {
		return elementUtils.getTextFromElement(invalidProduct, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}
	
	
	
	
}
