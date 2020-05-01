package SeleniumSession;

public class GoogleTest {

	public static void main(String[] args) {
		
		BrowserActions br = new BrowserActions();
		br.launchBrowser("chrome");
		br.launchurl("https://www.google.com");
		String Title=br.GetTitle();
		System.out.println("Title of the page is :" + Title);
		if (Title.equals ("Google")) {
			System.out.println("Correct Title");}
		else {
			System.out.println("Incorrect Title");
		}
		br.quit();
		}
	    
	}


