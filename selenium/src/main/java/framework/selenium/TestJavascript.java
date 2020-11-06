package framework.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestJavascript {

	static WebDriver driver;
	
	public static void main(String[] args) {
		javascript();

	}
	
	public static void submarino() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		//Set driver
		driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://submarino.com.br");
		
		JavascriptExecutor js  = (JavascriptExecutor) driver; 
		
		js.executeScript("document.getElementById('h_search-input').value='livros'");
		
		js.executeScript("document.getElementById('h_search-btn').click()");
		
		js.executeScript("window.scrollBy(0,600)", "");
		String altLivro = "img[alt='Livro - A Fazenda dos Animais: Um conto de fadas']";
		
		WebElement livro = driver.findElement(By.cssSelector(altLivro));
		js.executeScript("arguments[o].click()", livro);
		
		driver.close();
	}
	
	public static void javascript() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		//Set driver
		driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		WebElement linkTeste = driver.findElement(By.linkText("Checkboxes"));
		
		js.executeScript("arguments[0].click()", linkTeste);
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		js.executeScript("arguments[0].checked=true", checkbox);
		
		js.executeScript("alert('O elemento foi checkado')");
		
		Alert alerta = driver.switchTo().alert();
		alerta.accept();
		
		js.executeScript("arguments[0].checked=false", checkbox);
		
	}

}
