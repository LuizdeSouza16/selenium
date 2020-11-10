package projeto.udemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {

    private WebDriver driver;

    @FindBy(linkText = "REGISTER")
    private WebElement linkRegister;

    @FindBy(name = "userName")
    private WebElement inputUserName;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(name = "submit")
    private WebElement buttonSubmit;

    public WebElement getLinkFlights() {
        return linkFlights;
    }

    public void setLinkFlights(WebElement linkFlights) {
        this.linkFlights = linkFlights;
    }

    @FindBy(linkText = "Home")
    private WebElement linkHome;

    @FindBy(linkText = "Flights")
    private WebElement linkFlights;

    public WebElement getLinkHome() {
        return linkHome;
    }

    public void setLinkHome(WebElement linkHome) {
        this.linkHome = linkHome;
    }

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(WebElement inputUserName) {
        this.inputUserName = inputUserName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(WebElement inputPassword) {
        this.inputPassword = inputPassword;
    }

    public WebElement getButtonSubmit() {
        return buttonSubmit;
    }

    public void setButtonSubmit(WebElement buttonSubmit) {
        this.buttonSubmit = buttonSubmit;
    }

    public WebElement getLinkRegister() {
        return linkRegister;
    }

    public void setLinkRegister(WebElement linkRegister) {
        this.linkRegister = linkRegister;
    }

    public HomeObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
