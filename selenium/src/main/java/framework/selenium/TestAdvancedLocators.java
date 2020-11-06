package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestAdvancedLocators {

	static WebDriver driver;

	public static void main(String[] args) {
		advanced();
	}

	public static void advanced() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		// Set driver
		driver = new EdgeDriver();
		// maximize the window
		driver.manage().window().maximize();

		String url = "https://facebook.com/";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("email@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
		driver.findElement(By.cssSelector("button#u_0_b")).click();

	}
	
	public static void testCssSelectorClass() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		// Set driver
		driver = new EdgeDriver();
		// maximize the window
		driver.manage().window().maximize();

		String url = "http://www.esteio.rs.gov.br/sitro/?p=login";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("email@gmail.com");
		driver.findElement(By.cssSelector("input#senha")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	

}