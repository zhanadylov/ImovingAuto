package com.imoving.UI.stepDefs;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.methods.SelectRandom;
import com.imoving.UI.pageObjects.FullInventoryPage;
import com.imoving.UI.pageObjects.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Random;

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
    public void user_should_choose_all_categories() throws IOException {
        Random random = new Random();
        Helper.pause(4000);
        List<WebElement> picture = driver.findElements(By.xpath("//img[@class='hidden-xs']"));
            int chooseRandom = random.nextInt(picture.size());
        System.out.println("======= Chosen item: "+chooseRandom);
        Actions actions = new Actions(driver);
//        WebElement btn = driver.findElement(By.xpath("//a[@class='btn btn-blue' or @text()='']"));
        actions.moveToElement(picture.get(chooseRandom)).perform();
        Helper.pause(2000);
        WebElement btn = driver.findElement(By.xpath("//a[@class='btn btn-blue']"));
        actions.moveToElement(btn).perform();
        System.out.println("Going to click");
        Helper.click(btn);
            Helper.pause(3000);
    }
    @Then("user should click add items on room")
    public void user_should_click_add_items_on_room() {
//        selectRandom.test();
    }
    @Then("user should click add items on next room")
    public void user_should_click_add_items_on_next_room() {

    }
}
