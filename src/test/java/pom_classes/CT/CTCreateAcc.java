package pom_classes.CT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CTCreateAcc {
    WebDriver driver;
    String result;
    public CTCreateAcc(WebDriver driver){
        this.driver = driver;
    }
    private By ime = By.cssSelector("#firstname");
    private By prezime = By.cssSelector("#lastname");
    private By email = By.cssSelector("#email_address");
    private By sifra = By.cssSelector("#password");
    private By potvrda = By.cssSelector("#confirmation");
    private By posalji = By.cssSelector("[title='Submit']");

    public void popuni(String imeT, String prezimeT, String emailT, String sifraT){
        driver.findElement(ime).sendKeys(imeT);
        driver.findElement(prezime).sendKeys(prezimeT);
        driver.findElement(email).sendKeys(emailT);
        driver.findElement(sifra).sendKeys(sifraT);
        driver.findElement(potvrda).sendKeys(sifraT);

    }
    public void posalji(){
        driver.findElement(posalji).submit();
    }

    public void createAcc(String imeT, String prezimeT, String emailT, String sifraT){
        popuni(imeT, prezimeT, emailT, sifraT);
        posalji();
    }


}
