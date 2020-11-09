package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit6.pageobjects.RecoveryAccountObjects;

public class RecoveryAccountActions {
	static RecoveryAccountObjects recovery;
	
	public RecoveryAccountActions(WebDriver driver) {
		recovery = new RecoveryAccountObjects(driver);
	}
	
	public static void findAccount() {
		recovery.getInpEmailRecovery().sendKeys("erick@erick.com");
		recovery.getButtonEmailRecovery().click();
	}
}
