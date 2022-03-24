package com.imoving.UI.methods;

import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectRandom {
    private static Logger logger = (Logger) LogManager.getLogger(Helper.class);

    public SelectRandom(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Work with selector
    public static void SelectHomePage(WebElement element, int cssSelector){
        Select select = new Select(element);
        Random random = new Random();
        int index = random.nextInt(cssSelector);
        select.selectByIndex(index);
    }

    public static void randomChooseItems(List<WebElement> element, int numberItems){
        logger.info("I'm trying to choose items");
        Random random = new Random();
        for(int i = 0; i < numberItems; i++) {
            int item = random.nextInt(element.size());
            Helper.click(element.get(item));
        }
    }
}
