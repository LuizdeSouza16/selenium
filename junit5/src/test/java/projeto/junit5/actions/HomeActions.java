package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit5.pageobjects.HomeObjects;

public class HomeActions {

	static HomeObjects objHome;
	
	public HomeActions(WebDriver driver) {
		objHome = new HomeObjects(driver);	
	}
	
	public static void login() {
		objHome.getInputEmail().sendKeys("erick@erick.com");
		objHome.getInputPass().sendKeys("senhaErick");
		objHome.getButtonLogin().click();
	}
	
	public static void linkRecoveryPass() {
		objHome.getLinkForgot().click();
	}
	
}
