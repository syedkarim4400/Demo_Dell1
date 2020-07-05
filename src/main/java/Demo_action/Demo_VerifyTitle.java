package Demo_action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_VerifyTitle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
		String ExpectedTitle= "Computers, Monitors & Technology Solutions | Dell USA";
		String ActualTitle="";
		ActualTitle= driver.getTitle();
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			
			System.out.println("Test Case Pass");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		}
		Thread.sleep(20000);
		driver.close();
		
		

	}

}
