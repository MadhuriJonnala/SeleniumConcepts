package DropDownWithSelectTag;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling2 {
	

public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("http://www.facebook.com");
			WebElement day = driver.findElement(By.id("day"));// storing the weblement in an variable 'day'
			WebElement month = driver.findElement(By.id("month"));
			WebElement year = driver.findElement(By.id("year"));
			
			 String dob = "23-Nov-1995";
			
			selectDropDownValue(day,dob.split("23")[0]);
			selectDropDownValue(month, dob.split("Nov")[1]);
			selectDropDownValue(year, dob.split("1975")[2]);
			
	}

/**
 * This method is to get all the drop down values
 * @param element
 * @param value
 */
public static void selectDropDownValue(WebElement element , String value) {
	Select select = new Select(element);
	List<WebElement> valueslist=select.getOptions();// get options is get all the options from dropdown
	
	System.out.println(valueslist.size());// .size is to get size of the drop down 
	
	for (int i=0; i<valueslist.size();i++) 
	{
		if( valueslist.get(i).getText().equals(value))
		{   // if text is equals to June 
			valueslist.get(i).click();//click it 
			break; 
			}// break the loop 
	}
    	  
    	  
  }

}
