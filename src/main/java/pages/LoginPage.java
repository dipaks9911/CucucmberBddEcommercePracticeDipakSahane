package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class LoginPage {
WebDriver driver;
	private ElementUtils elementUtils;
	
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	elementUtils=new ElementUtils(driver);	
	}
	@FindBy(id="input-email")
	private WebElement emailField;
	
	
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@class, 'alert-dismissible')]")
	private WebElement warningMessge;
	
	public void enteremailAddress(String emailText) {
		
		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}

public void enterePassword(String passwordText) {
		
		elementUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}

public AccountPage clickOnLoginButton() {
	
	elementUtils.clickOnElement(loginButton, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	return new AccountPage(driver);
}

	public String getWarningMessageText() {
		return elementUtils.getTextFromElement(warningMessge, CommonUtils.EXPLICIT_WAIT_BASIC_WAIT_TIME);
	}
	
}
