package pom_classes.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    WebDriver driver;
    public GoogleSearchPage (WebDriver driver){
        this.driver = driver;
    }
    private By googleSearchBox = By.cssSelector("[name='q']");
    private By getGoogleSearchButton = By.cssSelector(".aajZCb>.tfB0Bf>center>[name='btnK']");

    public void setSearchFor(String searchFor){
        driver.findElement(googleSearchBox).sendKeys(searchFor);
    }
    public void performSearch(){
        driver.findElement(getGoogleSearchButton).click();
    }
    public void searchGoogle (String searchFor){
        this.setSearchFor(searchFor);
        this.performSearch();
    }

}
