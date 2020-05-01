package ImplicitWait;
//Implicit wait does not work for loading title.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForTitleCase {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://app.hubspot.com/login");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(driver.getTitle());

			WebElement emailId = driver.findElement(By.id("username")); //5 secs -- 10 secs
			emailId.sendKeys("tttttt");
			

			
		}

	}


