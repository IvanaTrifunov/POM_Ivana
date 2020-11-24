package tests.TheBodyShop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom_classes.Google.GoogleResultPage;
import pom_classes.Google.GoogleSearchPage;
import pom_classes.TheBodyShop.KreirajKorpu;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.concurrent.TimeUnit;

public class TBSTests {




    WebDriver driver;
    String URL = "http://www.thebodyshop.rs";
    DriverManager driverManager;
    KreirajKorpu korpa;

    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void napraviKorpu() throws InterruptedException {
        korpa = new KreirajKorpu(driver);
        korpa.kreirajKorpu();
        Thread.sleep(3_000);
       // korpa.ukloniIzKorpe();


    }


   // @AfterClass
   // public void tearDown(){
      //  driverManager.quitDriver();
   // }

}
