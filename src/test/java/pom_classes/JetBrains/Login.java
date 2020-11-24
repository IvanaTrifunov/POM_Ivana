package pom_classes.JetBrains;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }
    private By username = By.cssSelector("#username");
    private By password = By.cssSelector("[name='password']");
    private By signIn = By.cssSelector(".js-auth-dialog-btn-signin");
    private By warning = By.cssSelector(".js-auth-dialog-div-errors");
   // private By warning = By.xpath("//p[contains(.,'Incorrect username and/or password')]");

    public void login(String email,String passwordT) throws InterruptedException {
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(passwordT);
        driver.findElement(signIn).click();
        Thread.sleep(3000);

    }
    public String warningMsg(){
       return driver.findElement(warning).getText();
    }


}

