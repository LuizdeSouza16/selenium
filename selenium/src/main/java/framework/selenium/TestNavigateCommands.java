package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNavigateCommands {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		navigate();
	}
	
	public static void navigate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.linkText("Shopping")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
