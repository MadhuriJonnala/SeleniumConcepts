package ExplicitWait;
	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class ExplicitWait {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			
//			WebDriverWait wait = new WebDriverWait(driver, 15);
//			//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
//			wait.until(ExpectedConditions.titleContains("Login"));
	//
//			//tried for 3 second(s) with 500 milliseconds interval
//			
//			System.out.println(driver.getTitle());
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
			
			WebElement emailId = driver.findElement(By.id("username"));
			emailId.sendKeys("test");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("test123");
			
			WebElement loginButton = driver.findElement(By.id("loginBtn"));
			loginButton.click();

	}

}
