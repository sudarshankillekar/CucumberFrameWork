package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver ;

	//By Locators
	private static By HomepageLogo = By.xpath("//a[normalize-space()='Home']");
	private  static By ClickOnLoginSinguPbutton = By.xpath("//a[normalize-space()='Signup / Login']");
	private  static By VerifyLoginToYourAcount = By.xpath("//h2[normalize-space()='Login to your account']");
	private  static By emailId = By.name("email");
	private  static By password = By.name("password");
	private  static By Login =By.xpath("//button[normalize-space()='Login']");
	private  static By loggedInAs = By.xpath("//li[10]//a[1]");
	private  static By DeleteAcount = By.xpath("//a[normalize-space()='Delete Account']");
	private static By AccountDeleted = By.xpath("//a[normalize-space()='Delete Account']");
	//Constructor of the page class 
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	
    public boolean homePageIsVisibleSuccefully() {
    	return driver.findElement(HomepageLogo).isDisplayed();
    }
	
    public void clickOnLoginSignUpButton() {
    	driver.findElement(ClickOnLoginSinguPbutton).click();
    }
    
    public boolean VerifyLoginToyourAcount() {
    	return driver.findElement(VerifyLoginToYourAcount).isDisplayed();
    }
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pasword) {
		driver.findElement(password).sendKeys(pasword);
	}
	
    public void clickonLoginButton() {
    	driver.findElement(Login).click();
    }
	
    public void VerifyForLoggedInAs() {
    	driver.findElement(loggedInAs).isDisplayed();
    }
    
    public void clickOnDeleteAccount() {
    	driver.findElement(DeleteAcount).click();
    }
    
    public void VerifyAccountDeleted() {
    	driver.findElement(AccountDeleted).isDisplayed();
    }
    
    public HomePage DoLoginWith(String Username, String Password) {
    	driver.findElement(emailId).sendKeys(Username);
    	driver.findElement(password).sendKeys(Password);
    	driver.findElement(Login).click(); 
    	return new HomePage(driver);
    }
}
