package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	
	WebDriver driver;
	/**
	 * This method is used to launch the browser / initialize the browser on the basis of given browser name 
	 * @param browser
	 */

	public void launchBrowser(String browser ) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Safari":
			WebDriverManager.chromedriver().setup();
			driver=new SafariDriver();
			break;


		default:
			System.out.println("Please pass the correct browser--"+browser);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
}

	
	public void launchurl(String Url) {
		driver.get(Url);
		
	}
	
	public String GetTitle() {
		return driver.getTitle();
	}
	public void quit() {
		driver.quit();
	}
	
	
}
