package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("uid-firstName-5")).sendKeys("Madhuri");
		driver.findElement(By.id("uid-lastName-6")).sendKeys("Chikkala");
		driver.findElement(By.id("uid-email-7")).sendKeys("madhuri.chikkala@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.className("layout-submit-button")).click();

	}

}
