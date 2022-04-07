package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DiningRoomPage {
    public DiningRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public List<WebElement> elements = Driver.getDriver().findElements(By.className("itemsContainer"));

    @FindBy(linkText = "Add to Inventory")
    public WebElement addDining;

    @FindBy(className = "quantity-buttons")
    public WebElement addInventory;
}
