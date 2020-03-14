package pageObjectModel;

import org.apache.commons.math3.analysis.function.Abs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class itemPage extends AbstractClass {

    WebDriver driver = Driver.getDriver();

    public itemPage(){

        PageFactory.initElements( driver , this );

    }

    @FindAll( {
            @FindBy(xpath = "//select[@class='wt-select__element  variation-selector']")
    } )
    private List<WebElement> dropdownList;

    public void chooseRandomInDropdownList(){

        for(int i = 0 ; i < dropdownList.size() ; i++){
            selectInTheDropdown( dropdownList.get( i ) );
        }

    }

    @FindAll( {
            @FindBy(xpath = "//textarea[@class='wt-textarea']")
    } )
    private List<WebElement> inputList;




}


