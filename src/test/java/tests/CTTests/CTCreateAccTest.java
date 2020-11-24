package tests.CTTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom_classes.CT.CTAccount;
import pom_classes.CT.CTCreateAcc;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;
import selenium_core.HelpfulMethods;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CTCreateAccTest {


    WebDriver driver;
    String URL = "https://www.ctshop.rs/customer/account/create";
    DriverManager driverManager;
    CTCreateAcc CTC;
    CTAccount CTA;


    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    @Parameters({"ime", "prezime", "sifra", "alMsg"})
    public void createAccTest(String ime, String prezime, String sifra, String alMsg){
        CTC = new CTCreateAcc(driver);

        Random random = new Random();
      //  char c = (char)(random.nextInt(26));
        String[] chars = {"a", "b", "c", "d", "e", "f"};
        String email = "iv"+random.nextInt(5)+chars[random.nextInt(5)]+"iv@iv.com";
        System.out.println(email);

        CTC.createAcc(ime, prezime, email, sifra);
        CTA = new CTAccount(driver);
        CTA.checkMsg(alMsg);

    }


    @AfterClass
    public void tearDown(){
        driverManager.quitDriver();
    }
}
