package projeto.udemy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tests {
    static WebDriver driver;

    public static void main(String[] args) {
        testFactory();
    }

    static void testFactory(){
        System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
        // Set driver
        driver = new EdgeDriver();
        //Site to test
        driver.get("https://www.facebook.com.br");

        PageObjects obj = new PageObjects(driver);

        obj.getInputEmail().sendKeys("luiz@luiz.com");
        obj.getInputPass().sendKeys("123456");
        obj.getButtonLogin().click();

        closeDriver();
    }

    static void closeDriver(){
        driver.close();
    }
}
