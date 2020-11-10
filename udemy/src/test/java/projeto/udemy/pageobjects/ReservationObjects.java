package projeto.udemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationObjects {

    private WebDriver driver;
    @FindBy(xpath = "//a[@href='index.php']/img")
    private WebElement buttonBackHome;

    public WebElement getButtonBackHome() {
        return buttonBackHome;
    }

    public void setButtonBackHome(WebElement buttonBackHome) {
        this.buttonBackHome = buttonBackHome;
    }

    public ReservationObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
