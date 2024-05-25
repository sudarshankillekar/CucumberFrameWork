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
	private By emailId = By.name("email");
	private By password = By.name("password");
	private By Login =By.xpath("//button[normalize-space()='Login']");
	//Constructor of the page class 
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	//page actions : faeture (behavior ) of the page the form of methods 
//	public String getLoginPageTitle() {
//		return driver.getTitle();
//	}
	
	
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pasword) {
		driver.findElement(password).sendKeys(pasword);
	}
	
    public void clickonLoginButton() {
    	driver.findElement(Login).click();
    }
	
    
    
}
