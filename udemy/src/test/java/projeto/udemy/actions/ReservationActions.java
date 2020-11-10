package projeto.udemy.actions;

import org.openqa.selenium.WebDriver;
import projeto.udemy.pageobjects.ReservationObjects;

public class ReservationActions {
    public static ReservationObjects objReserv;

    public ReservationActions(WebDriver driver) {
        objReserv = new ReservationObjects(driver);
    }

    public void clickBackHome(){
        objReserv.getButtonBackHome().click();
    }
}
