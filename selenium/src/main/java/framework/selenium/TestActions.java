package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	static WebDriver driver;
	
	public static void main(String[] args) {
		clickAndHold();
	}
	
	public static void before() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
	
	public static void after() {
		driver.close();
	}
	public static void testKeyboard() {
		before();
		
		driver.get("https://www.facebook.com");
		
		WebElement elementEmail = driver.findElement(By.id("email"));
		WebElement elementPass = driver.findElement(By.id("pass"));
		
		Actions ac = new Actions(driver);
		
		ac.sendKeys(elementEmail, "email.luiz@gmail.com").build().perform();
		ac.sendKeys(elementPass, "email").build().perform();
		
		ac.keyDown(elementEmail, Keys.SHIFT).build().perform();
		ac.sendKeys(elementEmail, "teste shift").build().perform();
		
		ac.keyUp(elementEmail, Keys.SHIFT).build().perform();
		ac.sendKeys(elementEmail, "teste sem o shift").build().perform();
		
		//after();
		
	}
	
	public static void testActionMouse() {
		before();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		Actions act = new Actions(driver);
		
		WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		
//		act.sendKeys(userName, "admin");
//		act.sendKeys(password, "admin");
//		act.click(submit).build().perform();
		
		act.sendKeys(userName, "tomsmith13").build().perform();
		act.doubleClick(userName).build().perform();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.sendKeys(userName, "tomsmith").build().perform();
		act.sendKeys(password, "SuperSecretPassword").build().perform();
		act.click(submit).build().perform();		
		
		
	}
	
	public static void clickAndHold() {
		
		before();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		Actions act = new Actions(driver);
		
		WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		
		act.sendKeys(userName, "admin").build().perform();;
		act.sendKeys(password, "admin").build().perform();;
		act.clickAndHold(submit).build().perform();
		
		
		
	}
}
