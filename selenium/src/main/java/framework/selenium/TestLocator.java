package framework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class TestLocator {

	public static WebDriver driver;

	public static void main(String[] args) {
		// testeFacebook();
		testeText();
	}

	public static void before() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	public static void after() {
		driver.close();
	}

	public static void testeFacebook() {

		before();

		driver.get("http://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("luizubiratan@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("123");

		driver.findElement(By.name("login")).click();

		after();

	}

	public static void TestClass() {
		before();
		driver.get("https://www.trivago.com.br");


		driver.findElement(By.className("siteheader__control")).click();


		driver.close();
	}

	public static void TestTag() {
		before();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("iphone");
		WebElement submit = driver.findElement(By.name("btnK"));
		Actions ac = new Actions(driver);

		ac.sendKeys(Keys.ENTER).build().perform();

		List<WebElement> links = driver.findElements(By.tagName("h1"));

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		driver.close();
	}
	
	public static void testeText() {
		before();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Esqueceu a senha?")).click();
		
		driver.findElement(By.partialLinkText("Campanhas")).click();
		
		after();
	}
}
