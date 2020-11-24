package tests.IkeaTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom_classes.IkeaShop.IzaberiProizvod;
import pom_classes.IkeaShop.PronadjiProizvod;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.concurrent.TimeUnit;

public class IkeaTest {


    WebDriver driver;
    String URL = "https://www.ikea.com/rs/sr/";
    String Topic = "los za ljuljanje";
    DriverManager driverManager;
    PronadjiProizvod nadji;
    IzaberiProizvod izaberi;

    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void nadjiProizvod() throws InterruptedException {
        nadji = new PronadjiProizvod(driver);
        nadji.pronadjiProzivod(Topic);
        Thread.sleep(4000);
        izaberi = new IzaberiProizvod(driver);
        izaberi.kupiArtikal();


    }


//    @AfterClass
//    public void tearDown(){
//        driverManager.quitDriver();
//    }

}
