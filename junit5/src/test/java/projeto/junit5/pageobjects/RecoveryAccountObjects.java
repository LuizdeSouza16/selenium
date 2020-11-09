package projeto.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoveryAccountObjects {
	
	private WebDriver driver;
	
	@FindBy(id = "identify_email")
	private WebElement inpEmailRecovery;
	
	@FindBy(id = "u_0_5")
	private WebElement buttonEmailRecovery;
	
	public RecoveryAccountObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public WebElement getInpEmailRecovery() {
		return inpEmailRecovery;
	}

	public void setInpEmailRecovery(WebElement inpEmailRecovery) {
		this.inpEmailRecovery = inpEmailRecovery;
	}

	public WebElement getButtonEmailRecovery() {
		return buttonEmailRecovery;
	}

	public void setButtonEmailRecovery(WebElement buttonEmailRecovery) {
		this.buttonEmailRecovery = buttonEmailRecovery;
	}
	

}
