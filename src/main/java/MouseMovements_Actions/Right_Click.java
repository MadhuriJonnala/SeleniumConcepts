package MouseMovements_Actions;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement RightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> optionslist=
				driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span")); }
	
	//doRightClcik()
	
		
				
		public static void doRightCLick(WebDriver driver, WebElement RightClickOptions,List<WebElement>optionslist, String value ) {
			
			Actions action =new Actions(driver);
			action.contextClick(RightClickOptions).build().perform();
			System.out.println("Total no of options in OptionsList :" + optionslist.size());
			
			for (int i=0;i<optionslist.size();i++) {
				String text =optionslist.get(i).getText();
				System.out.println(i+"--->"+ text);
				
			if(text.equals(value)) {
				optionslist.get(i).click();
				break;}
			}
			
			
		}
		
}


