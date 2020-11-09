package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		
		String xPathAbsoluteSearch = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div/input";
		
		 driver.findElement(By.xpath(xPathAbsoluteSearch)).sendKeys("celular");
		 
		 String pathCellphone = "/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div/div[2]/ul/li[2]/a[1]/div/img";
		 
		 String searchButton = "/html/body/div[1]/div[2]/div/div[1]/div/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[1]/span";
		 driver.findElement(By.xpath(searchButton)).click();
		 
         JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,400)");
		 
		 driver.findElement(By.xpath(pathCellphone)).click();
	
	}
	
	public static void xPathRelative() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		//Set driver
		driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://magazineluiza.com.br");
		
		String inputSearch = "//input[@id='inpHeaderSearch']";
				
		driver.findElement(By.xpath(inputSearch)).sendKeys("celular");
		
		String buttonSearchString = "//span[contains(@title,'Buscar')]";
		
		driver.findElement(By.xpath(buttonSearchString)).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
			 
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//*[contains(@alt, 'Smartphone Samsung Galaxy A21s')]")).click();
		
		}
}
