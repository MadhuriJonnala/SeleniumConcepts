package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		//Initially the V1 DOM is there when we refresh the page the web elements gets Staled(old).
		WebElement username = driver.findElement(By.name("username")); //v1
		// V1-- 9a91243b-7ff9-4069-b321-601e330e3b65
		username.sendKeys("naveen");//v1 
		// V1-- 9a91243b-7ff9-4069-b321-601e330e3b65
		
		driver.navigate().refresh(); //Page is refreshing and DOM gets updated to V2
		

		username = driver.findElement(By.name("username")); //As DOM is getting updated we need to 
		//V2  9a91243b-7ff9-4069-b321-601e330e3b65
		username.sendKeys("SeleniumUser");//v1 9a91243b-7ff9-4069-b321-601e330e3b65
	}

}
