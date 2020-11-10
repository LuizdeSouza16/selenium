package projeto.udemy.actions;

import org.openqa.selenium.WebDriver;
import projeto.udemy.pageobjects.HomeObjects;

public class HomeActions {

    private static HomeObjects objHome;
    public HomeActions(WebDriver driver) {
         objHome = new HomeObjects(driver);
    }

    public void login(){
        objHome.getInputUserName().sendKeys("luiz");
        objHome.getInputPassword().sendKeys("123456");
        objHome.getButtonSubmit().click();
    }

    public void clickRegister(){
        objHome.getLinkRegister().click();
    }

    public void clickHome(){
        objHome.getLinkHome().click();
    }

    public void clickFlights(){
        objHome.getLinkFlights().click();
    }


}
