package com.imoving.UI.methods;

import com.imoving.UI.pageObjects.FullInventoryPage;
import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
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
        int index = 0;
            index = random.nextInt(cssSelector);
        if(index == 0){
            select.selectByIndex(index);
        }else{
            select.selectByIndex(index);
        }
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

    public void test(List<WebElement> picture, WebElement btn){
        Random random = new Random();
        int chooseRandom = random.nextInt(picture.size());
        WebElement res = picture.get(chooseRandom);
        Helper.pause(3000);
        Helper.navigateToElement(res);
//        Helper.pause(3000);
//        Helper.click(btn);
//        for (int i= 0;i < picture.size(); i++) {
//        }
//        System.out.println(Helper.color("cyan")+rand+Helper.color("reset"));
    }

    public void savePhoto(List<WebElement> picture) throws IOException {
        int count = 1;
        for (WebElement element : picture) {
            String src = element.getAttribute("src");
            System.out.println(src);
            URL imageURL = new URL(src);
            //read image from given web URL
            BufferedImage savelmage = ImageIO.read(imageURL);
            //writing the image on disk
            ImageIO.write(savelmage, "jpg", new File(count + ".jpg"));
            count++;
        }
    }
}