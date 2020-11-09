package framework.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestModalPopUp {

	static WebDriver driver;
	
	public static void main(String[] args) {
		popUp();
	}
	
	public static void modal() {
		
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.cssSelector("button[data-target='#myModal']")).click();
		WebElement confirmModal = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-primary")));
		confirmModal.click();
		
	}
	
	private static void popUp() {
		
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		String principalWindow = driver.getWindowHandle();
		
		System.out.println(driver.switchTo().window(principalWindow).getCurrentUrl());
		
		driver.findElement(By.linkText("Opens in a new window")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.contentEquals(principalWindow)) {
				System.out.println(driver.switchTo().window(window).getCurrentUrl());
			}
		}
		
		driver.switchTo().window(principalWindow);
	}
}
