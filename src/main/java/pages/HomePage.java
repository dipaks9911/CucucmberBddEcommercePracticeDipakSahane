package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	elementUtils=new ElementUtils(driver);	
	}
	@FindBy(id="input-email")
	private WebElement emailField;
	
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement loginOption;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	private WebElement registerOption;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchBoxFiels;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchButton;
	
	
	public void clickOnMyAccountMenu() {
		
		elementUtils.clickOnElement(myAccountDropMenu, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}

public LoginPage selectLoginOption() {
		
		elementUtils.clickOnElement(loginOption, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
		return new LoginPage(driver);
	}

public RegisterPage selectRegisterOption() {
	
	elementUtils.clickOnElement(registerOption, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	return new RegisterPage(driver);
}
public void enterProductIntoSearchBox(String productText) {
	
	elementUtils.typeTextIntoElement(searchBoxFiels, productText, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
}
public SearchResultsPage clickOnSearchButton() {
	
	elementUtils.clickOnElement(searchButton, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	return new SearchResultsPage(driver);
}
	

	
}
