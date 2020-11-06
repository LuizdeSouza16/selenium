package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCommandsBrowser {

	 public static WebDriver driver;
	
	public static void main(String[] args) {
		commandsBrowser();
	}
	
	public static void commandsBrowser() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		//Set driver
		driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	
		
		//get title the page
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		//get source code to the page
        //String codeSource = driver.getPageSource();
        //System.out.println(codeSource);
		//close the actual window the browser
		driver.close();
	}
}
