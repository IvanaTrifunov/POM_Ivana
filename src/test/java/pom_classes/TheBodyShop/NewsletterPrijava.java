package pom_classes.TheBodyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsletterPrijava {


    WebDriver driver;

    public NewsletterPrijava(WebDriver driver) {
        this.driver = driver;

    }

    private By unosEmail = By.cssSelector("#footer_newsletter");
    private By posaljiMejl = By.cssSelector(".actions>.action.subscribe.primary");



    public void prijaviSe(String emailAdresa) {
        driver.findElement(unosEmail).sendKeys(emailAdresa);
        driver.findElement(posaljiMejl).click();

    }
}
