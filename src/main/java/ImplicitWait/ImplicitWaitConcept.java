package ImplicitWait;

import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ImplicitWaitConcept {

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			//it will be applied for all the Weblements by default
			//w1 w2 w3 w..... wn 
			//global wait
			
			driver.get("https://app.hubspot.com/login");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			//Thread.sleep(15000);
			//w1 w2 w3 w..... wn  ---- 15 secs
			//w1 w2 ....w10 --> 15 secs x 10 => 150 secs
			
			WebElement emailId = driver.findElement(By.id("username")); //5 secs -- 10 secs
			WebElement password = driver.findElement(By.id("password"));//1 sec -- 14 secs		
			WebElement loginButton = driver.findElement(By.id("loginBtn"));//0 sec -- 15 secs
			
			emailId.sendKeys("naveen@gmail.com");
			password.sendKeys("naveen123");
			loginButton.click();
			
			//home page :
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			///w1......wn ---> 10 secs
			
			//search page: //nullify the imp wait:
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			//w1.....wn --> 0 sec
			
			//home page:
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//w1.....wn ---> 10 secs

	}

}
