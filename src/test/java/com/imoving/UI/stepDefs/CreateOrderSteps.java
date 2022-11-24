package com.imoving.UI.stepDefs;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.methods.SelectRandom;
import com.imoving.UI.pageObjects.FullInventoryPage;
import com.imoving.UI.pageObjects.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateOrderSteps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();
    SelectRandom selectRandom = new SelectRandom();

    @Given("User should choose value in What are You moving? field")
    public void user_should_choose_value_in_what_are_you_moving_field() {
        int size = driver.findElements(By.cssSelector("#houseTypeSelectList >option")).size();
        SelectRandom.SelectHomePage(homePage.orderType, size);
    }
    @Given("User should choose size in Move Size field")
    public void user_should_choose_size_in_move_size_field() {
        int size = driver.findElements(By.cssSelector("#hp-nav-select-house >option")).size();
        SelectRandom.SelectHomePage(homePage.movingSizeOption, size);
    }
    @Then("User should be on {string}")
    public void user_should_be_on(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("user should choose all categories")
    public void user_should_choose_all_categories() {
//        List<WebElement> elements = driver.findElements(By.xpath("//ul/li[@ng-repeat='item in vmDropDownSelect.items']"));
        selectRandom.test();
    }
    @Then("user should click add items on room")
    public void user_should_click_add_items_on_room() {
//        selectRandom.test();
    }
    @Then("user should click add items on next room")
    public void user_should_click_add_items_on_next_room() {

    }
}
