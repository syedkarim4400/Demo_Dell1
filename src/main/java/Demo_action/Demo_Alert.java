package Demo_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.dell.com/Identity/global/LoginOrRegister/98254675-ac6f-47d9-a7e4-4537724f135d?c=us&l=en&r=us&s=corp&~ck=mn&redirectUrl=https%3A%2F%2Fwww.dell.com%2Fen-us&pn=LoginOrRegister&feir=1");
		driver.manage().window().maximize();
		driver.findElement(By.id("sign-in-button")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(10000);
		
		

	}

}
