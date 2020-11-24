package pom_classes.TheBodyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewsletterPrijava {


    WebDriver driver;

    public NewsletterPrijava(WebDriver driver) {
        this.driver = driver;

    }

    private By unosEmail = By.cssSelector("#footer_newsletter");
    private By posaljiMejl = By.cssSelector(".subscribe > span");



    public void prijaviSe(String emailAdresa) {
        driver.findElement(unosEmail).sendKeys(emailAdresa);
       // driver.findElement(unosEmail).sendKeys(Keys.ENTER);
       driver.findElement(posaljiMejl).click(); //ovo ne radi, ne znam zasto osvezi stranu umesto da da warning

    }
}
