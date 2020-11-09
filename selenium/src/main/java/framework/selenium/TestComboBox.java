package framework.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestComboBox {

	static  WebDriver driver;
	
	public static void main(String[] args) {
		checkbox();
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
	
	private static void checkbox() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		// Set driver
		driver = new EdgeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test");
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
		driver.findElement(By.cssSelector(".cb1-element")).click();

		List<WebElement> labels  = driver.findElements(By.xpath("//label"));
		
		for (int i = 0; i < labels.size(); i++) {
			if (labels.get(i).getAttribute("innerText").contentEquals("Option 2") ||labels.get(i).getAttribute("innerText").contentEquals("Option 4")){
				labels.get(i).click();
			}
		}
	}
}
