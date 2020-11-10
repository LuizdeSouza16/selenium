package projeto.udemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightObjects {
    private WebDriver driver;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement radioOneway;

    @FindBy(name = "findFlights")
    private WebElement buttonFindFlights;


    public WebElement getRadioOneway() {
        return radioOneway;
    }

    public void setRadioOneway(WebElement radioOneway) {
        this.radioOneway = radioOneway;
    }

    public WebElement getButtonFindFlights() {
        return buttonFindFlights;
    }

    public void setButtonFindFlights(WebElement buttonFindFlights) {
        this.buttonFindFlights = buttonFindFlights;
    }

    public FlightObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
