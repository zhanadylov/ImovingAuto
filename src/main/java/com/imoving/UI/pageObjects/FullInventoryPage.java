package com.imoving.UI.pageObjects;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInventoryPage {
    public FullInventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //For random select Full items
    @FindBy(className = "itemsContainer")
    public WebElement fullOption;
    @FindBy(css = "#itemsContainer >option")
    public int navigateToItems;

    //Randomly select size
    @FindBy(id = "body > div > div > div > div.shuffle-animation > main > div > div:nth-child(1) > section > div.itemsContainer > div")
    public WebElement movingSizeHouseOption;
    @FindBy(css = "#hp-nav-select-house >option")
    public int dropDownSize;

    //Type selector
    @FindBy(className = "itemTypeSelector")
    public static WebElement typeOption;
    @FindBy(css = "#itemTypeSelector >option")
    public static int dropDownCount;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div")
    public WebElement addToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[3]/div[1]/button")
    public WebElement SaveAndGoToNextButton;

    public void passThePopUp(){
        Helper.click(addToInventoryButton);
    }
}

