package MouseMovements_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		WebElement contentLink=driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(contentLink).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();
		
	}

}
