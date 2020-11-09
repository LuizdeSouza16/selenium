package framework.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIframe {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		testIframe();
		
	}
	
	public static void testIframe() {
		
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//WebElement frame = driver.findElement(By.id("mce_0_ifr"));
    	
		//driver.switchTo().frame("mce_0_ifr");
		
		//driver.switchTo().frame(frame);
		
		List <WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		for(int i = 0; i <frames.size(); i++) {
			System.out.println(frames.get(i).getAttribute("id"));
		}
		
		driver.switchTo().frame(0);

		
		driver.findElement(By.id("tinymce")).clear();
		
		driver.findElement(By.id("tinymce")).sendKeys("Estou no iframe no selenium");
	
		driver.switchTo().parentFrame();
		
		driver.findElement(By.linkText("Elemental Selenium")).click();;
	
	}
}
