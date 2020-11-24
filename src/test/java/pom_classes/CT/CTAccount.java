package pom_classes.CT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CTAccount {
    WebDriver driver;
    public CTAccount(WebDriver driver){
        this.driver = driver;
    }
   protected By alert = By.cssSelector(".alert.alert-success>p");
 // protected By alert = By.cssSelector(".alert.alert-warning");



    public void checkMsg(String msg){
        Assert.assertEquals(driver.findElement(alert).getText(), msg);
    }

}
