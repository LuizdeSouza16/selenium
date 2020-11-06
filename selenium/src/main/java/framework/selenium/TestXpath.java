package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestXpath {

	private static WebDriver driver;
	
	public static void main(String[] args) {
		xPathAbsolute();
	}
	public static void xPathAbsolute() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		//Set driver
		driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://magazineluiza.com.br");
		
		String xPathAbsoluto = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[1]/input[1]";
		
		 driver.findElement(By.xpath(xPathAbsoluto)).sendKeys("celular");
	
	}
}
