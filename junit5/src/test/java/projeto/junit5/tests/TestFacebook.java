package projeto.junit5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import projeto.junit5.actions.HomeActions;
import projeto.junit5.actions.RecoveryAccountActions;

class TestFacebook {

	static WebDriver driver;
	static HomeActions homeAct;
	static RecoveryAccountActions accRecovery;
	
	@BeforeAll
	static void beginTests() {
		System.out.println("Foi iniciado os testes com o before all");
	}
	
	@BeforeEach
	void openFacebook() {
		System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
		// Set driver
		driver = new EdgeDriver();
		//Site to test
		driver.get("https://www.facebook.com");
		// maximize the window
		driver.manage().window().maximize();
		
		//instances 
		homeAct = new HomeActions(driver);
		accRecovery = new RecoveryAccountActions(driver);
	}
	
	@Test
	@Tag("Credenciais")
	void logarFacebook() throws Exception {
		
		assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		homeAct.login();
	}
	
	@Disabled("O teste de inscrever novo usúario não foi implementado")
	@Test
	void newUser() {
		System.out.println("Novo usuário inserido");
	}
	@Tag("Recuperação")
	@ParameterizedTest
	@ValueSource(strings = {"erick@erick.com", "carlos@carlos.com", "maria@maria.com"})
	void recoveryPass(String email) throws Exception {
		homeAct.linkRecoveryPass();
		assertTrue(driver.getTitle().contains("Esqueci a senha"), "Não contém as palavras no título");
		accRecovery.findAccount(email);
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
