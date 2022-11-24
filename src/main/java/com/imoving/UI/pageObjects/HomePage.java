package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //For random select MovingTab
    @FindBy(id = "houseTypeSelectList")
    public WebElement orderType;
    @FindBy(css = "#houseTypeSelectList >option")
    public int dropDownCount;

    //Randomly select size
    @FindBy(id = "hp-nav-select-house")
    public WebElement movingSizeOption;
    @FindBy(css = "#hp-nav-select-house >option")
    public int dropDownSize;

    //Compare Quotes Button
    @FindBy(xpath = "//*[@id=\"roomsForm\"]/div[3]/button")
    public WebElement compareQuotesButton;

    @FindBy(xpath = "//*[@id=\"index\"]/div/main/section[1]/figure/div/div/div[1]/ul/li[1]/a")
    public WebElement movingTab;
    @FindBy(xpath = "//*[@id=\"index\"]/div/main/section[1]/figure/div/div/div[1]/ul/li[2]/a")
    public WebElement laborTab;

    @FindBy(xpath = "//*[@id=\"houseTypeSelectList\"]")
    public WebElement movingNameDropDown;

    @FindBy(xpath = "//*[@id=\"hp-nav-select-house\"]")
    public WebElement movingSizeDropDown;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a[2]/span[1]")
    public WebElement continueButton;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[2]/div[1]/form/div[1]/div/div/ul/li[3]/a/span[1]")
    public WebElement whatAreYouMovingSelectedValue;

}
