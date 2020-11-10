package projeto.udemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PageObject home Facebook.
 */
public class PageObjects
{
    private WebDriver driver;

    @CacheLookup
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement inputPass;

    @FindBy(css = "#u_0_b")
    private WebElement buttonLogin;

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

    /**
     * Constructor to PageObject Home Facebook
     * @param driver
     */
    public PageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
