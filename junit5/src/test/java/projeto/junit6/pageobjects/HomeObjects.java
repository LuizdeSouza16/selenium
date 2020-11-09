package projeto.junit6.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {
	private WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement inputEmail;
	
	@FindBy(name = "pass")
	private WebElement inputPass;
	
	@FindBy(id = "u_0_b")
	private WebElement buttonLogin;
	
	@FindBy(linkText = "Esqueceu a senha?")
	private WebElement linkForgot;

	public HomeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public void setInputPass(WebElement inputPass) {
		this.inputPass = inputPass;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public void setButtonLogin(WebElement buttonLogin) {
		this.buttonLogin = buttonLogin;
	}

	public WebElement getLinkForgot() {
		return linkForgot;
	}

	public void setLinkForgot(WebElement linkForgot) {
		this.linkForgot = linkForgot;
	}
	
	
}	

