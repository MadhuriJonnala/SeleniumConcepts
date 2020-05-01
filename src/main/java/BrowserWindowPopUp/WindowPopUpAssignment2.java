package BrowserWindowPopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpAssignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> Handles =driver.getWindowHandles();
		Iterator<String> it=Handles.iterator();
		
		String parentWindowID= it.next();
		System.out.println("Parent Window ID "+ parentWindowID);
		
		String childwindowID1 =it.next();
		System.out.println("Child Window ID 1 "+ childwindowID1);
		
		driver.switchTo().window(childwindowID1);// Switching to child window -1 
		System.out.println("Child Window Title 1 is" + driver.getTitle());
		driver .close();
		
		
		Set<String> Handles1 =driver.getWindowHandles();
		Iterator<String> it1=Handles1.iterator();
		
		driver.switchTo().window(parentWindowID);//Switching to Parent Window
		driver.findElement(By.linkText("Good PopUp #2")).click();// click on the popup -2
		
		String childwindowID2 =it1.next();
		System.out.println("Child Window ID 2 "+ childwindowID2);
		
		driver.switchTo().window(childwindowID2);// Switching to child window -2 
		System.out.println("Child Window Title 2 is" + driver.getTitle());
		driver .quit();
		
	}

}
