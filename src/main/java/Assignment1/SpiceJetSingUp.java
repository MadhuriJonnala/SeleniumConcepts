package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetSingUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement SignUpLink=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Actions action = new Actions(driver);
		action.moveToElement(SignUpLink).build().perform();
		
		Thread.sleep(2000);
		WebElement SpiceClubMemeber=driver.findElement(By.linkText("SpiceClub Members"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(SpiceClubMemeber).build().perform();
		
		Thread.sleep(2000);
		WebElement SignUp=driver.findElement(By.linkText("Sign up"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(SignUp).build().perform();
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement Title = driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle"));
		Select select = new Select(Title);
	    select.selectByVisibleText("MS");
	    
	    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("Madhuri");
	    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("chikkala");
	    driver.findElement(By.cssSelector("input.country-mobile")).sendKeys("9885675651");
	    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys("abcxyz123");
	    driver.findElement(By.id("datepicker")).click();
	}

	
	By SpiceClubMemeber= By.linkText("SpiceClub Members");
	By SignUpLink = By.id("ctl00_HyperLinkLogin");
	By SignUp =By.linkText("Sign up");



	public static void SpicejectSignUp(WebDriver driver,WebElement element,By locator){ 
		
		WebElement element1=driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element1).build().perform();	
		
		
	}
}
