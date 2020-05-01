package MouseMovements_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");  
	
		WebElement source  = driver.findElement(By.id("draggable"));
		WebElement target  = driver.findElement(By.id("droppable"));
		
		Actions actions =new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();// here we have one action 
		//it will collect it, build it and finally perform the action.
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
