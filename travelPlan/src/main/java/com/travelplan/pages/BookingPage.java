package com.travelplan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
	
	
	WebDriver driver;
	By insuranceCheck = By.id("insurance_confirm");
	By continueBookinbtn = By.id("itineraryBtn");
	By username = By.id("username");
	By LoginBtn = By.id("LoginContinueBtn_1");
	By Title  = By.id("AdultTitle1");
	By FirstName = By.id("AdultFname1");
	By LastName = By.id("AdultLname1");
	By mobileNumber = By.id("mobileNumber");
	By travellerButton = By.id("travellerBtn");

	
	
	public BookingPage(WebDriver driver) {
		
		this.driver = driver;
	}



	public void InsuranceCheck(){
		driver.findElement(insuranceCheck).click();
	}
	
	public void Continue(){
		driver.findElement(continueBookinbtn).click();
	}
	
	public void setUserName(String user){
		driver.findElement(username).sendKeys(user);
	}
	
	public void Login(){
		driver.findElement(LoginBtn).click();
	}
	
	public void setTitle(String title){
		WebElement mySelectElement = driver.findElement(Title);
    	Select dropdown= new Select(mySelectElement);
    	dropdown.selectByValue(title);
	}
	
	public void setFirstName(String fname){
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname){
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void setMobileNumber(String phonenumber){
		driver.findElement(mobileNumber).sendKeys(phonenumber);
	}
	
	public void goToPayment(){
		driver.findElement(travellerButton).click();;
	}
	
}
