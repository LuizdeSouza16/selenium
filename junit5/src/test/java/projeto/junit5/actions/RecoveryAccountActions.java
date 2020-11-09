package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit5.pageobjects.RecoveryAccountObjects;

public class RecoveryAccountActions {
	static RecoveryAccountObjects recovery;
	
	public RecoveryAccountActions(WebDriver driver) {
		recovery = new RecoveryAccountObjects(driver);
	}
	
	public static void findAccount(String email) {
		recovery.getInpEmailRecovery().sendKeys(email);
		recovery.getButtonEmailRecovery().click();
	}
}
