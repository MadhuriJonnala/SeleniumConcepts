package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//create webelemnt + perform actions on it
		
		//1. id: -- I
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
//		loginButton.click();
//		email.sendKeys("naveen@gmail.com");
		
		//2. name: -- II
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		WebElement email = driver.findElement(By.name("username"));

		//3. className: -- IV
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("m-bottom-3")).sendKeys("test@123");

		//4. xpath: is a locator, but not an attribute -- III
		//this is the address of the element in DOM (document object Model)
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		//5. cssSelector: is a locator, but not an attribute -- III
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6. linkText: only for links
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: only for links:
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//Sign up
		//Sign in
		
		//8. tagName:
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);

	}

}
