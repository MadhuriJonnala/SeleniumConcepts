package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		// headless : no browser
		// not visible
		// testing is happening behind the scene
		// fast

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		//co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.google.com"); // launch url

		String title = driver.getTitle();// get the page title
		System.out.println("page title is : " + title);

		// validation point: actual vs expected result:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}

	}
		

	}


