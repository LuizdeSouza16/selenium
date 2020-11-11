package projeto.udemy.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import projeto.udemy.actions.FlightActions;
import projeto.udemy.actions.HomeActions;
import projeto.udemy.actions.RegisterActions;
import projeto.udemy.actions.ReservationActions;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsJUnit {

    static WebDriver driver;
    static HomeActions actHome;
    static RegisterActions actReg;
    static FlightActions actFly;
    static ReservationActions actRes;


    @BeforeAll()
    static void openEdge(){
        System.setProperty("webdriver.edge.driver", "c:/autodrivers/msedgedriver.exe");
        // Set driver
        driver = new EdgeDriver();
        //Wait devido a falha nos testes
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Site to test
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        // maximize the window
        driver.manage().window().maximize();

        //instance actions
        actHome = new HomeActions(driver);
        actReg = new RegisterActions(driver);
        actFly = new FlightActions(driver);
        actRes = new ReservationActions(driver);
    }

    @Test
    void register(){
        assertEquals("http://demo.guru99.com/test/newtours/index.php", driver.getCurrentUrl());
        actHome.clickRegister();
        actReg.register();
        assertTrue(driver.getCurrentUrl().contains("register_sucess"), "registro não foi criado");
    }

    @Test
    void login(){
        actHome.clickHome();
        actHome.login();
    }

    @Test
    void reserveFlights(){
        actHome.clickFlights();
        actFly.searchFly();
        actRes.clickBackHome();
    }

    @AfterAll()
    static void closeEdge(){
        driver.close();
    }
}
