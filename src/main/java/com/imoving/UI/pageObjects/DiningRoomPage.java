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
    public List<WebElement> allItemDining = Driver.getDriver().findElements(By.xpath("/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div"));

    public List<WebElement> allPictureDiningRoom = Driver.getDriver().findElements(By.xpath("//img[@class='hidden-xs']"));
    @FindBy(xpath = "//img[@class='hidden-xs']")
    public WebElement allinWEb;

    public List<WebElement> allNameOfPictureDiningRoom = Driver.getDriver().findElements(By.xpath("//figcaption[@class='hidden-xs hidden-sm']"));
//    @FindBy(xpath = "//img[@class='hidden-xs']")
//    public WebElement allinWEb;

    @FindBy(linkText = "Add to Inventory")
    public WebElement addDining;

    @FindBy(className = "quantity-buttons")
    public WebElement addInventory;
}
