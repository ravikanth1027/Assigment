package com.trip.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.travelplan.pages.FlightsPage;
import com.travelplan.pages.HomePage;

public class travelPlan {

	public String driverPath = "src/test/resources/drivers/chromedriver.exe";
	public WebDriver driver;
	public WebDriverWait wait ;
	HomePage homePage;
	FlightsPage flightsPage;
	
	@BeforeTest
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
		
		homePage.goToFlights();
		
		flightsPage.selectRoundTrip();
		flightsPage.setFrom("Bangalore, IN - Kempegowda International Airport (BLR)");
		flightsPage.setTo("New Delhi, IN - Indira Gandhi Airport (DEL)");
		flightsPage.setOnDate();
		flightsPage.setReturnDate();
		flightsPage.numberofPassengers(1);
		flightsPage.getFlights();
		
		/*driver.findElement(By.xpath("//a[contains(text(),'Hotels')]")).click();
		WebElement flightstab ;
		flightstab = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Flights')]"))));//.click();
		flightstab.click();
		driver.findElement(By.id("RoundTrip")).click();
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("insurance_confirm")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("itineraryBtn")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("username")).sendKeys("ravikanth27@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("LoginContinueBtn_1")).click();
		Thread.sleep(10000);
		WebElement mySelectElementtitle = driver.findElement(By.id("AdultTitle1"));
		Thread.sleep(10000);
		Select titleDropdown= new Select(mySelectElementtitle);
		titleDropdown.selectByValue("Mr");
	
		driver.findElement(By.id("AdultFname1")).sendKeys("ravi");
	
		driver.findElement(By.id("AdultLname1")).sendKeys("k");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("919897969512");
		Thread.sleep(10000);
		driver.findElement(By.id("travellerBtn")).click();
		Thread.sleep(10000);
	}
	
}
