package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.homePage;
import pageObjectModel.itemPage;
import pageObjectModel.searchPage;
import utilities.Driver;
import utilities.readProperties;

public class addToCartSteps {

    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();
    searchPage searchPage = new searchPage();
    itemPage itemPage = new itemPage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {
        driver.get( readProperties.getData( "URL" ) );
        driver.manage().window().maximize();
    }

    @And("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
        homePage.writeInSeachButton( arg1 );
    }

    @And("^Click on search button$")
    public void click_on_search_button() {
        homePage.clickOnButtonSearch();
    }

    @And("^Click on any item$")
    public void click_on_any_item() {
        searchPage.clickAnyProducts();
    }

    @And("^Fill all the required fields$")
    public void fill_all_the_required_fields() {

        itemPage.chooseRandomInDropdownList();
        itemPage.typeInInputList();

//        click on add to cart button

//        verify the title

    }

    @And("^Click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        itemPage.clickOnAddToCart();

    }

    @Then("^Verify I am in the cart page$")
    public void verify_I_am_in_the_cart_page() {
        itemPage.verifyURL( "cart" );
    }


}
