package pom_classes.IkeaShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IzaberiProizvod {
    WebDriver driver;
    public IzaberiProizvod(WebDriver driver){
        this.driver = driver;
    }
    private By izaberiArtikal = By.cssSelector(".serp-grid__item.serp-grid__item--product.search-grid__item.range-revamp-product-compact");
    private By kupiArtikal = By.cssSelector(".range-revamp-btn__label");

    public void kupiArtikal(){
        driver.findElement(izaberiArtikal).submit();
        driver.findElement(kupiArtikal).click();
    }

}
