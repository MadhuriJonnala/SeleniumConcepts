package BrowserWindowPopUp;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpCase1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> Handles =driver.getWindowHandles();
		//Set will create a object and will divide into 2parts referring by Handles, Parent Window ID and Child Window ID 
		/*In Set there will not be any order like in Array list,this doesn't store 
		the value on the basis of indexing so we use iterator */
		Iterator<String> it=Handles.iterator();
		
		String parentWindowID= it.next();
		// Iterator go to the next and it capture the value in the form of String
		//Parent Window ID is Captured
		System.out.println("Parent Window ID "+ parentWindowID);
		
		String childwindowID =it.next();// Child Window Id is captured with it.next method 
		System.out.println("Child Window ID "+ childwindowID);

		//Now the control is in Parent Window 
		//We need to move the Control from Parent to Child 
		driver.switchTo().window(childwindowID);// Switching to child window
		System.out.println("Child Window Title is" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);//Switching to Parent Window 
		System.out.println("Parent Window Title is" + driver.getTitle());

	}

}
