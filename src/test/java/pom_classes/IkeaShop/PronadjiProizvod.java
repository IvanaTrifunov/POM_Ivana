package pom_classes.IkeaShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PronadjiProizvod {

    WebDriver driver;
    public PronadjiProizvod(WebDriver driver){
        this.driver = driver;
    }
    private By unosZaPretragu = By.cssSelector(".search-field__input");
    private By pretraziDugme = By.cssSelector("#search-box__searchbutton");


    public void pronadjiProzivod(String Topic){
        driver.findElement(unosZaPretragu).sendKeys(Topic);
        driver.findElement(pretraziDugme).click();
    }


}
