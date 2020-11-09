package framework.selenium;


import java.awt.Checkbox;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestComboBox {

	static  WebDriver driver;
	
	public static void main(String[] args) {
		radioButton() ;
	}
	
	private static void comboBox()  {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test");
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		Select daysOfWeek = new Select(driver.findElement(By.id("select-demo")));
		
		daysOfWeek.selectByIndex(3);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		daysOfWeek.selectByValue("Friday");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		daysOfWeek.selectByVisibleText("Monday");
		
	}
	
	private static void radioButton() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test");
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='Female']"));
		radioButtonFemale.click();
		System.out.println(radioButtonFemale.getAttribute("checked"));
				

	}
	
	Checkbox
}
