package Demo_action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Calender {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).clear();
		
		driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("FLL");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).clear();
		driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("LGA");
		
		Thread.sleep(5000);
		
		JavascriptExecutor date =(JavascriptExecutor) driver;
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='02/19/2020'");
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='02/27/2020'");
		
		driver.findElement(By.xpath("//button[@class='actionable actionable_button actionable_no-outline actionable_primary button submit-button form-container--search-button']")).click();

	    Thread.sleep(5000);
	    
	    driver.quit();
	}

}
