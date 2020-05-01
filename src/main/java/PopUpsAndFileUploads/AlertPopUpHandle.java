package PopUpsAndFileUploads;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //launch url
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String text =alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct error Message"); }
		else {
			System.out.println("incorrect error Message");}
		
		alert.accept();
		
		//alert.dismiss();
		
	}
		

	}


