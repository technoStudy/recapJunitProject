package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.searchPage;

public class searchPriceFilterSteps {

    searchPage searchPage = new searchPage();

    @And("^click on price filter seventy five to hundred$")
    public void click_on_price_filter_seventy_five_to_hundred() {
        searchPage.clickOnRadioButton75to100();
    }

    @Then("^Verify all prices are between seventy five and hundred$")
    public void verify_all_prices_are_between_seventy_five_and_hundred() {
        searchPage.verifyBetween();
    }

    @And("^click on price filter twenty five to seventy five$")
    public void click_on_price_filter_twenty_five_to_seventy_five() {
        searchPage.clickOnbutton25to50();
    }

    @Then("^Verify all prices are between twenty five to seventy five$")
    public void verify_all_prices_are_between_twenty_five_to_seventy_five() {
        searchPage.verifyBetween25to75();
    }

}
