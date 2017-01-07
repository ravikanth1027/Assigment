package com.travelplan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
	
	WebDriver driver;
	
	By roundTripRadio = By.id("RoundTrip");

    By from = By.id("FromTag");

    By to  =By.id("ToTag");

    By OndatePicker  = By.xpath("//div[@id='ORtrip']/section[2]/div/dl/dd/div/a/i");
    By onDate  = By.xpath("//a[contains(text(),'15')]");
    By returnDatePicker = By.xpath("//dl[@id='ReturnDateContainer']/dd/div/a/i");
    By retunDate = By.xpath("//a[contains(text(),'25')]");
    By membersDropdown = By.id("Adults");
    
    By search = By.id("SearchBtn");
	
    
    
    public FlightsPage(WebDriver driver){
    	this.driver = driver;
    }
    
    public void selectRoundTrip(){
    	driver.findElement(roundTripRadio).click();
    }
    
    public void setFrom(String fromLocation){
    	driver.findElement(from).sendKeys(fromLocation);
    }
    
    public void setTo(String toLocation){
    	driver.findElement(to).sendKeys(toLocation);
    }
    
    public void setOnDate(){
    	driver.findElement(OndatePicker).click();
    	driver.findElement(onDate).click();
    }
    
    public void setReturnDate(){
    	driver.findElement(returnDatePicker).click();
    	driver.findElement(retunDate).click();
    }
    
    
    public void numberofPassengers(int passengers){
    	WebElement mySelectElement = driver.findElement(membersDropdown);
    	Select dropdown= new Select(mySelectElement);
    	dropdown.selectByIndex(passengers-1);
    }
    
    public void getFlights(){
    	driver.findElement(search).click();
    }
    
	/*driver.findElement(By.id("RoundTrip")).click();
	driver.findElement(By.id("FromTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
	Thread.sleep(10000);
	driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@id='ORtrip']/section[2]/div/dl/dd/div/a/i")).click();
	Thread.sleep(10000);
	//driver.close();
	driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//dl[@id='ReturnDateContainer']/dd/div/a/i")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
	Thread.sleep(10000);
	WebElement mySelectElement = driver.findElement(By.id("Adults"));
	Thread.sleep(10000);
	Select dropdown= new Select(mySelectElement);
	dropdown.selectByIndex(0);
	Thread.sleep(10000);
	driver.findElement(By.id("SearchBtn")).click();*/
}
