package Objects;

import BaseClass.BaseDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(BaseDrivers.driver, this);
    }


    public By username = By.id("user-name");
    public By password = By.id("password");
    public By loginBTN = By.id("login-button");


    public WebElement username(){
        return BaseDrivers.driver.findElement(username);
    }

    public WebElement password(){
        return BaseDrivers.driver.findElement(password);
    }

    public WebElement loginBTN(){
        return BaseDrivers.driver.findElement(loginBTN);
    }
}
