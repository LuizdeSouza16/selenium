package projeto.junit5.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import projeto.junit5.actions.GoogleActions;

public class TestGoogle {

	static WebDriver driver;
	static GoogleActions actGoogle;
	
	@BeforeAll
	static void beginTests() {
		System.out.println("Iniciando os testes do google com beforeAll");
	}
	
	@BeforeEach
	void openGoogle() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		// Set driver
		driver = new EdgeDriver();
		//Site to test
		driver.get("https://www.google.com");
		// maximize the window
		driver.manage().window().maximize();
		
		actGoogle = new GoogleActions(driver);
		
	}
	
	@Test
	void TestSearch() throws Exception{
		actGoogle.makeSearch();
	}
	
	
	@AfterEach
	void closeWindow() {
		driver.close();
	}
	
	@AfterAll
	static void finishTest() {
		System.out.println("Finalizado os testes automatizados com o after all");
	}
}
