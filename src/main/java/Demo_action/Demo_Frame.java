package Demo_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		Thread.sleep(10000);
		
		driver.close();

	}

}
