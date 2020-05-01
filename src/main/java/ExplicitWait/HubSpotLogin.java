package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		ElementUtil elementUtil= new  ElementUtil(driver);
		
		By emailID =By.id("username");
		By password =By.id("password");
		By LoginButton =By.id("loginBtn");
		By signUp= By.linkText("Sign up");
		
		driver.get("https://app.hubspot.com/login");
		elementUtil.clickWhenReady(signUp, 6);
		
		
//		//String Title=elementUtil.waitForElementToBePresent("Login", 6);
//		System.out.println(Title);
		
	
		
//	
//		 elementUtil.waitForElementToBePresent(emailID, 15).sendKeys("Naveen@gmail.com");
//		 elementUtil.waitForElementToBePresent(password, 0).sendKeys("Test@123");
//		 elementUtil.doClick(LoginButton);
//		 
//		
		 
		 
	}

}
