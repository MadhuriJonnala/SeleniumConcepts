package DropDownWithSelectTag;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingwithoutSelectUsingCSS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
	    WebElement day = driver.findElement(By.id("day"));// storing the web element in an variable 'day'
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
		String dob = "1-Dec-2020";

		
		String day_xpath="//select[@id='day']/option";
		String month_xpath="//select[@id='month']/option";
		String year_xpath="//select[@id='year']/option";

		doselectValuesfromDropDownWithoutSelect(driver,"xpath",day_xpath,dob.split("-")[0]);
		doselectValuesfromDropDownWithoutSelect(driver,"xpath",month_xpath, dob.split("-")[1]);
		doselectValuesfromDropDownWithoutSelect(driver,"xpath",year_xpath, dob.split("-")[2]);

	}
	/**
     * This Method is to select the drop-down values to find the element with either of CSS or xpath.
     * @param driver
     * @param xpath
     * @param value
     */
	public static void doselectValuesfromDropDownWithoutSelect(WebDriver driver, String LocatorValue,String Locator,String value) {
		List<WebElement> DropDownValuesList =null;
		
		if (Locator.equals("xpath")) {
		DropDownValuesList =driver.findElements(By.xpath(LocatorValue));
		}
		else if (Locator.equals("css")) {
		 DropDownValuesList =driver.findElements(By.cssSelector(LocatorValue));
		}
		//System.out.println(DropDownValuesList.size());
		for(int i=0; i<DropDownValuesList.size(); i++) {
			if(DropDownValuesList.get(i).getText().equals(value)) {
				DropDownValuesList.get(i).click();
				break;
			}
		}
			
		}	
	
	
		/**
		 * This method is get all drop down values 
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
		 * this method is used to select the value from the drop down - without
		 * using Select class in Selenium
		 * 
		 * @param locator
		 * @param locatorValue
		 * @param value
		 */
		public void doSelectValueFromDropDownWithOutSelect(WebDriver driver,String locator, String locatorValue, String value) {
			List<WebElement> valuesList = null;
			if (locator.equals("xpath")) {
				valuesList = driver.findElements(By.xpath(locatorValue));
			}
			else if (locator.equals("css")) {
				valuesList = driver.findElements(By.cssSelector(locatorValue));
			}

			System.out.println(valuesList.size());

			for (int i = 0; i < valuesList.size(); i++) {
				if (valuesList.get(i).getText().equals(value)) {
					valuesList.get(i).click();
					break;
				}
			}

		}
	}




