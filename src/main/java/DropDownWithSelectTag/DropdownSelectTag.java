package DropDownWithSelectTag;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelectTag {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));

//		Select select = new Select(day);
//		select.selectByVisibleText("15");// visible text
//		select.selectByIndex(20);//Count of the index
//		select.selectByValue("5");//Value depends on Value property 
//
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Jan");
//
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("2001");
						
//		selectDropDown(day,"5");
//		selectDropDown(month,"Jan");
//		selectDropDown(year,"1990");
		
		
		Select select = new Select(day);
		select.selectByVisibleText("15");
		select.selectByIndex(5);
		select.selectByValue("9");
		//System.out.println(select.isMultiple());
	
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
	}

//		Select select2 = new Select(year);	
//		select2.deselectAll();
	/**
	 * This method is to get all drop-down values.	
	 * @param element
	 */

	
	public static void getDropDownValues(WebElement element){
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: "+ optionsList.size());
		for(int i=0; i<optionsList.size(); i++){
		System.out.println(optionsList.get(i).getText());
		}
		
}
	

/**
 * this method is for visible text
* @param element
 * @param value
 */
	public static void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);	}

/**
 * this method is for index
 * @param element
 * @param index
 */
	public static void selectDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);	}

/**
 * This method if for Value
 * @param element
 * @param value
 */
	public static void selectDropDown1(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);	}


}




