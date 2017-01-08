package com.trip.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.travelplan.pages.BookingPage;
import com.travelplan.pages.FlightsPage;
import com.travelplan.pages.HomePage;
import com.travelplan.pages.SearchResultPage;

public class travelPlan {

	public String driverPath = "src/test/resources/drivers/chromedriver.exe";
	public WebDriver driver;
	public WebDriverWait wait ;
	HomePage homePage;
	FlightsPage flightsPage;
	SearchResultPage resultPage;
	BookingPage bookingPage;
	
	@BeforeClass
	public void setDriver(){
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		
	}
	
	@Test
	public void travelplanTest() throws InterruptedException{
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		homePage = new HomePage(driver);
		flightsPage = new FlightsPage(driver);
		bookingPage = new  BookingPage(driver);
		resultPage = new SearchResultPage(driver);
		homePage.goToFlights();
		
		Assert.assertEquals("Search flights", flightsPage.getTextButton());
		///System.out.println("Search Button Text"+flightsPage.getTextButton());
		flightsPage.selectRoundTrip();
		flightsPage.setFrom("Bangalore, IN - Kempegowda International Airport (BLR)");
		flightsPage.setTo("New Delhi, IN - Indira Gandhi Airport (DEL)");
		flightsPage.setOnDate();
		flightsPage.setReturnDate();
		flightsPage.numberofPassengers(1);
		flightsPage.getFlights();
		
		Thread.sleep(10000);
		
		resultPage.bookFlight();
	
		bookingPage.InsuranceCheck();
		bookingPage.Continue();
		bookingPage.setUserName("ravikanth27@gmail.com");
		bookingPage.Login();
		bookingPage.setTitle("Mr");
		bookingPage.setFirstName("RaviKanth");
		bookingPage.setLastName("Kotha");
		bookingPage.setMobileNumber("91123456789");
		bookingPage.goToPayment();
		
	}
	
	@AfterClass
	public void close(){
		driver.quit();
	}
	
}
