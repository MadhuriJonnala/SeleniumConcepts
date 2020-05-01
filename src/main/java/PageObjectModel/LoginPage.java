package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 //By Locators-Page Objects 
	static By emailID = By.id("username");
	static By password=By.id("password");
	static By LoginButton =By.id("loginBtn");
	static By SignUpLink=By.linkText("Sign up");
	static By homePageHeader=By.cssSelector("h1.private-page__title");
	static By LinksTagName = By.tagName("a");
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserActions br = new BrowserActions();
		WebDriver driver=  br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		ElementUtil elementUtil= new ElementUtil(driver);
		elementUtil.dosendKeys(emailID, "madhu.chikkala@yahoo.com");
		elementUtil.dosendKeys(password, "Anil143madhu");
		elementUtil.doClick(LoginButton);
		Thread.sleep(6000);

		String header = elementUtil.doGetText(homePageHeader);
		System.out.println("home page header is : "+ header);
		
		if(header.contains("Sales Dashboard")){
			System.out.println("User has logged in successfully....");
		}else{
			System.out.println("could not login");
			
		}
		
		String s=br.doGetTitle();
		System.out.println(s);
		
		elementUtil.getLinks();
		
		br.quitBrowser();
		
				
	}
	
}
