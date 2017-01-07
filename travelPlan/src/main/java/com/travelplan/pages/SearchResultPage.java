package com.travelplan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
	WebDriver driver;
	
	By bookButton  = By.xpath("(//button[@type='submit'])[2]");
	
	
	
	public SearchResultPage(WebDriver driver) {
			this.driver = driver;
	}
	
	public void bookFligth(){
		driver.findElement(bookButton).click();
		
	}
}
