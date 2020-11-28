package tests.TheBodyShop;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pom_classes.TheBodyShop.KreirajKorpu;
import pom_classes.TheBodyShop.NewsletterPrijava;
import pom_classes.TheBodyShop.ProveriKorpu;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.concurrent.TimeUnit;

public class TBSTests {




    WebDriver driver;
    String URL = "http://www.thebodyshop.rs";
    DriverManager driverManager;
    KreirajKorpu korpa;
    ProveriKorpu placanje;
    NewsletterPrijava prijava;

    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager("CHROME");
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void napraviKorpu() {
        korpa = new KreirajKorpu(driver);
        korpa.kreirajKorpu();
       // korpa.ukloniIzKorpe();
        placanje = new ProveriKorpu(driver);
        Assert.assertEquals(placanje.proveriKorpu(), "Vaša korpa");

    }
    @Test
    @Ignore
    //ovde dodati parametre za email adresu
    public void prijavaNewsletter(){
        prijava=new NewsletterPrijava(driver);
        prijava.prijaviSe("iv");

    }


    @AfterClass
    public void tearDown(){
        driverManager.quitDriver();
    }

}
