package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hints {
    public Hints(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/span")
    public WebElement hintBoxesGotItText;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a")
    public WebElement hintBoxesGotItButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[1]/div/p[1]")
    public WebElement hintHereYouCanSeeAllYourRoomsAndStarMovingText;
    @FindBy(xpath = "//*[@id=\"nextInventoryTutorial\"]")
    public WebElement hintHereYouCanSeeAllYourRoomsAndStarMovingNextButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[2]/div/p[1]")
    public WebElement HereYouCanSeeInventoryItemsForSelectedRoomsText;
    @FindBy(xpath = "//*[@id=\"nextNextRoomTutorial\"]")
    public WebElement HereYouCanSeeInventoryItemsForSelectedRoomsButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[3]/div/p[1]")
    public WebElement PressThisButtonToSaveChoosedItemsText;
    @FindBy(id = "closeTutorial2")
    public WebElement PressThisButtonToSaveChoosedItemsButton;
}
