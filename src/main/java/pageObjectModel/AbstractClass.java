package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class AbstractClass {

//   create a reusable method for click functionality
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 10 );

    public void clickFunctionality(WebElement clickButton){

        wait.until( ExpectedConditions.elementToBeClickable( clickButton ) );
        clickButton.click();
    }

//   create a reusable method for sendkeys functionality
    public void sendKeysFunctionality(WebElement sendKeysButton , String value){

        wait.until( ExpectedConditions.visibilityOf( sendKeysButton ) );
        sendKeysButton.sendKeys( value );
    }

}
