package pom_classes.TheBodyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProveriKorpu {

    WebDriver driver;
    public ProveriKorpu(WebDriver driver) {
        this.driver = driver;

    }
    private By placanje = By.cssSelector(".page-title");


    public String proveriKorpu(){
        return driver.findElement(placanje).getText();
    }
}
