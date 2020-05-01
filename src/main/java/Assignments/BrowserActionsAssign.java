package Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActionsAssign {
	
	WebDriver driver;
	
	public void launchbrowser(String browser){
		
		if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("no such browser");}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public void lauchurl(String url) {
		driver.get(url);
	}
	
	public String GetPageSource() {
		return driver.getPageSource();
	}
	
	public String GetTitle() {
		return driver.getTitle();
	}
	
	public void quit() {
		driver.quit();
	}

}
