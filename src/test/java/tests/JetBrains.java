package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_classes.JetBrains.Login;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.concurrent.TimeUnit;

public class JetBrains {

    WebDriver driver;
    String URL = "https://account.jetbrains.com/login";
    DriverManager driverManager;
    Login login;


    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void LoginJB() throws InterruptedException {
        login = new Login(driver);
        login.login("iv", "iv");
        Assert.assertEquals(login.warningMsg(), "Incorrect username and/or password");
    }


    @AfterClass
    public void tearDown(){
        driverManager.quitDriver();
    }


}
