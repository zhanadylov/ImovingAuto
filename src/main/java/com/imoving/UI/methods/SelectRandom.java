package com.imoving.UI.methods;

import com.imoving.UI.pageObjects.FullInventoryPage;
import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SelectRandom {
    WebDriver driver = Driver.getDriver();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();

    private static Logger logger = (Logger) LogManager.getLogger(Helper.class);

    public SelectRandom(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Dropdown Helper
    public static void selectUsingVisibleText(WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    //Random select from selector
    public static void SelectHomePage(WebElement element, int cssSelector){
        Select select = new Select(element);
        Random random = new Random();
        int index = random.nextInt(cssSelector);
        select.selectByIndex(index);
    }

    //Select items randomly
    public static void randomChooseItems(List<WebElement> element, int numberItems){
        logger.info("I'm trying to choose itemsыы");
        Random random = new Random();
        for(int i = 0; i < numberItems; i++) {
            WebElement randomCheckbox = element.get(random.nextInt(element.size()));
            if(randomCheckbox == FullInventoryPage.typeOption){
                logger.info("Choose item type");
                SelectHomePage(FullInventoryPage.typeOption, FullInventoryPage.dropDownCount);
                Helper.navigateToElement(randomCheckbox);
                Helper.click(randomCheckbox);
            }else {
                Helper.navigateToElement(randomCheckbox);
                Helper.click(randomCheckbox);
            }
        }
//        List<WebElement> checkboxes = driver.findElements(By.cssSelector(".myCheckboxClass"));
//        WebElement randomCheckbox = checkboxes.get(new Random().nextInt(list.size()));
    }

    //Select from elements
    public static void selectItems(WebElement element) throws InterruptedException {
        List<WebElement> all = Collections.singletonList(element);
        Random random = new Random();
        int one;
        for (int i = 0; i < all.size();i++){
            all.get(random.nextInt(5));
            Helper.click((WebElement) all);
        }
//        for (WebElement e : all) {
//            all.get(random.nextInt(3));
//            click1(e);
//        }
        Thread.sleep(5000);
    }

    public void test(){
//        List<WebElement> allItems = fullInventoryPage.categories.findElements(By.className("hidden-xs hidden-sm"));
        List<WebElement> allItems = driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
        int counter = 0;
        for(WebElement selectLi: allItems)
        {
            String name = selectLi.getText();
            System.out.println(Helper.color("cyan")+"Test list: "+name+Helper.color("reset"));
        }
    }
}
