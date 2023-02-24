package Actions;

import org.openqa.selenium.WebElement;

public class Operations {

    public static void clickMethod(WebElement webElement){
        webElement.click();
    }

    public static void type(WebElement webElement, String text){
        webElement.sendKeys(text);
    }


}
