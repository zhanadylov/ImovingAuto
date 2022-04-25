package com.imoving.UI.stepDefs;

import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.methods.SelectRandom;
import com.imoving.UI.pageObjects.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomPageSteps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    Select select;

    @Given("user is on qa environment")
    public void user_is_on_qa_environment(){
        driver.get(ConfigReader.getProperty("environment"));
    }

    @When("user should click labor tab button")
    public void user_should_click_labor_tab_button() {
        Helper.click(homePage.movingTab);
        Helper.pause(5000);

    }
    @Then("user should see {string} and {string} texts")
    public void user_should_see_and_texts(String string, String string2) {

    }

    @Given("User should choose {string} value in What are You moving? field")
    public void user_should_choose_value_in_what_are_you_moving_field(String myHouse) {
        SelectRandom.selectUsingVisibleText(homePage.movingNameDropDown, myHouse);
    }

//    @Then("{string} should be selected")
//    public void user_should_see_and_texts(String selected) {
//        Assertions.assertEquals(selected, Helper.getTextValue(homePage.whatAreYouMovingSelectedValue));
//    }

    @Given("User should choose {string} value in Move Size field")
    public void user_should_choose_value_in_move_size_field(String size) {
        SelectRandom.selectUsingVisibleText(homePage.movingSizeDropDown, size);
    }


    @When("User clicks on Compare Quotes button")
    public void user_clicks_on_compare_quotes_button() {
        Helper.click(homePage.compareQuotesButton);
        Helper.pause(8000);
    }

    @Then("User should see new pop-up window These are recommended rooms for a")
    public void user_should_see_new_pop_up_window_these_are_recommended_rooms_for_a() {

    }

    @Then("Following pop up window should have {string} {string} Please add\\/remove and confirm: text")
    public void following_pop_up_window_should_have_please_add_remove_and_confirm_text(String string, String string2) {


    }

    @Then("User clicks on Continue")
    public void user_clicks_on_continue() {
        Helper.click(homePage.continueButton);
        Helper.pause(2000);
    }

    @Then("User should see recommended items list")
    public void user_should_see_recommended_items_list() {

    }
}