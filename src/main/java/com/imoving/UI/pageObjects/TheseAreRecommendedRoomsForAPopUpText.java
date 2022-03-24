package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheseAreRecommendedRoomsForAPopUpText {
    public TheseAreRecommendedRoomsForAPopUpText(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/h2/span[1]")
    public WebElement TheseAreRecommendedRoomsForAPopUpText;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a[2]")
    public WebElement TheseAreRecommendedRoomsForAPopUpContinueButton;
}
