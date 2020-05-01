package Assignments;

public class BrowserActionTest {

	public static void main(String[] args) {
	
		BrowserActionsAssign b= new BrowserActionsAssign();
		b.launchbrowser("chrome");
		b.lauchurl("https://www.ikea.com");
		String S2 =b.GetPageSource();
		System.out.println(S2);
		String S1=b.GetTitle();
		System.out.println(S1);
		b.quit();
	}

}
