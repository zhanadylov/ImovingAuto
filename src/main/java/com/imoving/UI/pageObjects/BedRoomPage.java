package com.imoving.UI.pageObjects;

import com.imoving.UI.methods.SelectRandom;
import com.imoving.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BedRoomPage {
    public BedRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    public List<WebElement> test = Driver.getDriver().findElements(By.xpath("/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div"));
    public List<WebElement> elements = Driver.getDriver().findElements(By.className("itemsContainer"));


    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement dresserPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/img")
    public WebElement bedPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement nightStandPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement mirrorPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement lampPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement tvPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement deskPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement mattressPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement officeChairPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement bookcasePicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement armChairPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement totePlasticPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement posterPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement walkInClosedPicture;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement otherPicture;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement addDresser;
    @FindBy(linkText = "Add to Inventory")
    public WebElement addBed;

    @FindBy(className = "quantity-buttons")
    public WebElement addInventory;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[3]/div[1]/button")
    public WebElement buttonNext;

}
