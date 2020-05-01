package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		String browser= "ff";
		WebDriver driver =null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jonnala\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();}
		
		else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else if (browser.equalsIgnoreCase("IE")){
			driver= new InternetExplorerDriver();
		}
		
		driver.get("http://www.google.com");// Launch URL
	    String title =driver.getTitle();// Storing the Title value in title variable.
		System.out.println(title);//printing on the console.
//--------------------------------------------------------------------------------------		
		
		//Validation Point: Actual vs Expected Result:
		if (title.equals("Google")){  // validate the title of the page.
			System.out.println("Correct Title");
			}
		else {
			System.out.println("Incoprrect Title");
		}
		
//--------------------------------------------------------------------------------------		
	
		String url= driver.getCurrentUrl();// Current URL have google in it or 
		if (url.contains("google")) {
			System.out.println("Correct URl");
		}
		else {
			System.out.println("Incorrect URL");
		}
//----------------------------------------------------------------------------------------
		
		String PageSource = driver.getPageSource();// to check the page source. 
		if (PageSource.contains("copyright"))
		{
			System.out.println("Copyright Key word is present");
		}
		else 
		{
			System.out.println("Copyright Key word is not present");
		}
//---------------------------------------------------------------------------------------		
		//to quit the browser :
		driver.quit();// Quitting the page.

		
	
			
		}
		
			
		}
		

	


