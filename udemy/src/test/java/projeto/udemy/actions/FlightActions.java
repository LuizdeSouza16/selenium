package projeto.udemy.actions;

import org.openqa.selenium.WebDriver;
import projeto.udemy.pageobjects.FlightObjects;

public class FlightActions {

    private static FlightObjects objFly;

    public FlightActions(WebDriver driver) {
        objFly = new FlightObjects(driver);
    }

    public void searchFly(){
        objFly.getRadioOneway().click();
        objFly.getButtonFindFlights().click();
    }
}
