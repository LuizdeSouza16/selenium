package framework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		testTable();
	}
	
	public static void testTable() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://scrud.whirlwind.nl/");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='table_companies']/tbody/tr"));
		System.out.println(tableRows.size());
		
		List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@id='table_companies']/tbody/tr/td"));
		System.out.println(tableColumns.size());
//		
//		for(int i = 0 ; i < tableRows.size(); i++) {
//			for (int j = 0; j < tableColumns.size(); j++) {
//				
//				System.out.println(tableColumns.get(j).getText());
//			}
//		}
		

		String empresaEditar = "Mercado Pagliasi";
		
		for(int a= 0 ; a < tableRows.size(); a++) {
			for (int b = 0; b < tableColumns.size(); b++) {
				if (tableColumns.get(b).getText().contentEquals(empresaEditar)) {
					
					driver.findElement(By.xpath("//li[@class='function_edit']/a[@data-name='"+empresaEditar+"']")).click();
					
					break;
				}
				
				
			}
			break;
		}
		
		
	}
}
