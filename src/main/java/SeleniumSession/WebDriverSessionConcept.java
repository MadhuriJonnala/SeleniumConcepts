// Bonigarcia- WebDriverManager its the third party libraries not available in selenium 
/**
 * <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>3.8.1</version>
    <scope>test</scope>
   </dependency>
   this is the webdriver dependencies we need to save in POM.XML File.
   WebDriverManager.chromedriver().setup(); (this line will check  check which chrome browser we have it 
   automatically download the respective chrome .exefile 

   Everytime we run the program a unique session ID will be generated. 
   Our code gets interacted with selenium server and then with the browser 
   When we write driver code after quitting the browser then session ID will be null. and we get NoSuchSessionException error

   Quit Case1:
   ChromeDriver: chrome on XP (35d315e202aa50e47b46fa6781d05fd9)
   ChromeDriver: chrome on XP (35d315e202aa50e47b46fa6781d05fd9)
   ChromeDriver: chrome on XP (35d315e202aa50e47b46fa6781d05fd9)
   Quit:driver.quit()
   Session ID will be null
   ChromeDriver: chrome on XP (null)

   Close Case2:
   ChromeDriver: chrome on XP (382ad14f54e10d87b7f7eb15261172fe)
   ChromeDriver: chrome on XP (382ad14f54e10d87b7f7eb15261172fe)
   ChromeDriver: chrome on XP (382ad14f54e10d87b7f7eb15261172fe)
   Close:driver.close()
   ChromeDriver: chrome on XP (382ad14f54e10d87b7f7eb15261172fe)// invalid session ID 


 */
package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSessionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("http://www.google.com"); // launch url

		String title = driver.getTitle();// get the page title
		System.out.println("page title is : " + title);

		//driver.quit(); //quit the browser
		driver.close();

		System.out.println(driver.getTitle()); // NoSuchSessionException: invalid session id


	}

}