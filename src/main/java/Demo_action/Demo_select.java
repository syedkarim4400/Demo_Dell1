package Demo_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo_select {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("month")).click();
		WebElement Apr = driver.findElement(By.id("month"));
		Select lisa = new Select(Apr);
		lisa.selectByIndex(9);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("day")).click();
		WebElement Apr1 = driver.findElement(By.id("day"));
		Select lisa1 = new Select(Apr1);
		lisa1.selectByIndex(22);
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("year")).click();
		WebElement Apr2 = driver.findElement(By.id("year"));
		Select lisa2 = new Select(Apr2);
		lisa2.selectByIndex(0);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
