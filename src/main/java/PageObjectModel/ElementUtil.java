package PageObjectModel;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//ElementUtil will behave like a template,like generic template 
public class ElementUtil {
	WebDriver driver;// driver will get activated
	// we have created this constructor to get the driver.
	public ElementUtil(WebDriver driver) { //constructors will help to initialize the class variables
		this.driver=driver;

	}

	public WebElement getElement(By locator) {
		WebElement element =driver.findElement(locator);
		return element; }

	public void dosendKeys(By locator, String values){
		getElement(locator).sendKeys(values);}

	public void doClick(By locator){
		getElement(locator).click();}

	public String doGetText(By locator){
		return getElement(locator).getText();}

/**
 * get all the links with a tag
 */
	public void getLinks() {
	List<WebElement> linkList = driver.findElements(By.tagName("a"));

		for (int i=0;i<linkList.size();i++) {
			String LinkText =linkList.get(i).getText();
			if (! LinkText.isEmpty()) {
				System.out.println(LinkText);
				System.out.print(i+"---------"+LinkText);
				String S=linkList.get(i).getAttribute("href");
				System.out.println(S);
			}

		}

	}
	/**
	 * to get all the drop down values size , and text
	 * @param locator
	 */
	public void getDropDownValues(By locator){
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: "+ optionsList.size());
		for(int i=0; i<optionsList.size(); i++){
			System.out.println(optionsList.get(i).getText());
		}

	}
	
	/**
	 * drop down array list
	 * @param driver
	 * @param locator
	 * @return
	 */
	public List<String> getDropDownValuesList( By locator,String value) {
		List<String> ar = new ArrayList<String>();
		ElementUtil elementUtil = new ElementUtil(driver);

		Select select = new Select(elementUtil.getElement(locator));

		List<WebElement> optionsList = select.getOptions();
		for (int i = 0; i < optionsList.size(); i++) {
			ar.add(optionsList.get(i).getText());
		}

		return ar;
			
	}


	/**
	 * this method is for visible text
	 * @param element
	 * @param value
	 */
	public void selectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);	}

	/**
	 * this method is for index
	 * @param element
	 * @param index
	 */
	public  void selectDropDown(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);	}
	
	
	/**
	 * this method is used to select the value from the drop down - without
	 * using Select class in Selenium
	 * 
	 * @param locator
	 * @param locatorValue
	 * @param value
	 */
	public void doSelectValueFromDropDownWithOutSelect(String locator, String locatorValue, String value) {
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
	
	// wait custom methods: wait utils:



		public List<WebElement> visiblilityOfAllElements(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));
			return driver.findElements(locator);
		}

		public WebElement waitForElementToBePresent(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return getElement(locator);
		}

		public WebElement waitForElementToBeClickable(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return getElement(locator);
		}

		public WebElement waitForElementToBeVisbile(By locator, int timeout) {
			WebElement element = getElement(locator);
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}

		public WebElement waitForElementVisibilityLocated(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return getElement(locator);
		}

		public String waitForUrl(String url, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.urlContains(url));
			return driver.getCurrentUrl();
		}

		public boolean waitAlertToBePresent(int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		}
        //Most used Method which are clickable 
		public void clickWhenReady(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			getElement(locator).click();
		}

		public String waitForTitleToBePresent(String title, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.titleContains(title));
			return driver.getTitle();
		}

	}