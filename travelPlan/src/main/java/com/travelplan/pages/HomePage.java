package com.travelplan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	By flightstab  = By.xpath("//a[contains(text(),'Flights')]");
	By hotelstab = By.xpath("//a[contains(text(),'Hotels')]");
	
	
	public HomePage(WebDriver driver) {
			this.driver = driver;
	}
	
	
	public void goToFlights(){
		driver.findElement(flightstab).click();
	}
	
	public void goToHotels(){
		driver.findElement(hotelstab).click();
	}
}
