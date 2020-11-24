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

    public void login(String email,String passwordT) throws InterruptedException {
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(passwordT);
        driver.findElement(signIn).click();
        Thread.sleep(3000); //ovo treba zameniti, ali nisam uspela

    }
    public String warningMsg(){
       return driver.findElement(warning).getText();
    }


}

