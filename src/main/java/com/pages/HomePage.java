package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
public class HomePage {

	private WebDriver driver;
	private By CategorySectionList = By.cssSelector("div.brands_products");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public int getCategorySectionCount() {
		return driver.findElements(CategorySectionList).size();
	}
	
	public List<String> getCategorySectionList() {
		List<String> categorylist = new ArrayList<>(); 
		WebElement parentElement = driver.findElement(By.cssSelector("div.brands_products"));
		List<WebElement> categorySectionList = parentElement.findElements(By.tagName("li"));
		for(WebElement e : categorySectionList ) {
			String text = e.getText();
			System.out.println(text);
			categorylist.add(text);
		}
		return categorylist;
		
	}
}










