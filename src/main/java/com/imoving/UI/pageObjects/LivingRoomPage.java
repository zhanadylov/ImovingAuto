package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LivingRoomPage {

    public LivingRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriver driver = Driver.getDriver();


//    public List<WebElement> allProducts = driver.findElements(By.xpath("/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div"));


    //For random select Items Living room
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div")
    public List<WebElement> navigateToItemsContainer;
    @FindBy(css = "#body > div > div > div > div.shuffle-animation > main > div > div:nth-child(1) > section > div.itemsContainer > div >option")
    public int chooseItems;


    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/img")
    public WebElement sofaPicture;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement addToInventorySofa;

    @FindBy(xpath = "")
    public WebElement tvPicture;
    @FindBy(xpath = "")
    public WebElement addToInventoryTV;


}
