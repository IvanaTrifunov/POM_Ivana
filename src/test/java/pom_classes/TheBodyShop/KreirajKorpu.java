package pom_classes.TheBodyShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KreirajKorpu {


    WebDriver driver;
    public KreirajKorpu (WebDriver driver){
        this.driver = driver;
    }
    private By nadjiKalendar = By.cssSelector(".container >[id=banner-slider-demo-15]");
    private By ubaciUKorpu = By.cssSelector(".item:nth-child(1) .actions-primary span");//mora ovde neki skrol da se ubaci
    private By proveriKorpu = By.cssSelector(".page.messages>div>div>div>div>a");
    private By ukloni = By.cssSelector(".action.action-delete");


    public void kreirajKorpu (){
        driver.findElement(nadjiKalendar).click();
        driver.findElement(ubaciUKorpu).click();
        driver.findElement(proveriKorpu).click();


//    }
//    public void ukloniIzKorpe(){
//        driver.findElement(ukloni).click();
    }

}
