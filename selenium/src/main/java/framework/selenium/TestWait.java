package framework.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWait {

	static WebDriver driver;
	public static void main(String[] args) {
		testWaitExplicito();

	}

	public static void testWaitImplicito() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		String link = "//*[@id=\"content\"]/div/a[2]";
		driver.findElement(By.xpath(link)).click();
		
		String button = "//*[@id=\"start\"]/button";
		driver.findElement(By.xpath(button)).click();
				
		WebElement h4  = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println(h4.getAttribute("innerText").toString());
		
	}
	
	public static void testWaitExplicito() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
				
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();;
		
		driver.findElement(By.xpath("//button")).click();
		
		WebElement textHelloWorld = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='finish']/h4")));
		
		textHelloWorld.click();
		
		
		System.out.println(textHelloWorld.getAttribute("innerText").toString());
		
	
	}
}
