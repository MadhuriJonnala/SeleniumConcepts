package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
		
		List<WebElement> List = driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a"));
		System.out.println("otal values in the header is : "+ List.size());
		
		for(int i=0; i<List.size(); i++){
		System.out.println(i + "--->"+List.get(i).getText());}
	}
		
}
		
		
	