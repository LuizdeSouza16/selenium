package projeto.udemy.actions;

import org.openqa.selenium.WebDriver;
import projeto.udemy.pageobjects.RegisterObjects;

public class RegisterActions {
    private static RegisterObjects objReg;
    public RegisterActions(WebDriver driver) {
        objReg = new RegisterObjects(driver);
    }

    public void register(){
        objReg.getInputFirstName().sendKeys("luiz");
        objReg.getInputLastName().sendKeys("souza");
        objReg.getInputPhone().sendKeys("51982161612");
        objReg.getInputUserName().sendKeys("luiz@luiz.com");
        objReg.getInputAddress().sendKeys("vitor hugo");
        objReg.getInputCity().sendKeys("sapucaia do suil");
        objReg.getInputState().sendKeys("rio grande do sul");
        objReg.getInputPostalCode().sendKeys("93234070");
//        objReg.getSelectCountry().selectByValue("BRAZIL");
        objReg.getInputEmail().sendKeys("luiz@luiz.com");
        objReg.getInputPassword().sendKeys("123456");
        objReg.getInputConfirmPassword().sendKeys("123456");
        objReg.getInputSubmit().click();
    }
}
