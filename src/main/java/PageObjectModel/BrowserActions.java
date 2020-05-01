package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions	 {

			WebDriver driver;

			/**
			 * This method is used to launch the browser/ initialize the driver on the basis of given Browser
			 * @param browser
			 */
			public WebDriver launchBrowser(String browser) {
				switch (browser) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				case "Safari":
					WebDriverManager.getInstance(SafariDriver.class).setup();
					driver = new SafariDriver();
					break;

				default:
					System.out.println("Please pass the correct browser ----> " + browser);
					break;
				}
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				return driver;
			}

			public void launchUrl(String url) {
				driver.get(url);
			};

			public String doGetTitle() {
				return driver.getTitle();
			}
			
			
			public void quitBrowser() {
				driver.quit();
				
			}
		}

	