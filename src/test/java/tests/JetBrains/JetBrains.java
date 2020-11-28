package tests.JetBrains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
        driverManager = DriverManagerFactory.getDriverManager("CHROME");
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    @Parameters ({"email", "sifra"})

    public void LoginJB(String email, String sifra) throws InterruptedException {
        login = new Login(driver);
        login.login(email, sifra);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".js-auth-dialog-div-errors")));
        Assert.assertEquals(login.warningMsg(), "Incorrect username and/or password");
    }


    @AfterClass
    public void tearDown(){
        driverManager.quitDriver();
    }


}
