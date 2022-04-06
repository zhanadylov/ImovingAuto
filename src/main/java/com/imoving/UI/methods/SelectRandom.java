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

    public static void randomChooseItems(List<WebElement> element, int numberItems){
        logger.info("I'm trying to choose itemsыы");
        Random random = new Random();
        WebElement randomCheckbox;
        for(int i = 0; i < numberItems; i++) {
            randomCheckbox = element.get(new Random().nextInt(element.size()));
//            Helper.click(randomCheckbox);
//            System.out.println(randomCheckbox);

        }
//        List<WebElement> checkboxes = driver.findElements(By.cssSelector(".myCheckboxClass"));
//        WebElement randomCheckbox = checkboxes.get(new Random().nextInt(list.size()));
    }

//    public void clickonRandomCheckBox()
//    {
//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        Random ram = new random.nextInt(1,3);
//        if(!checkboxes.get(ram).isSelected)
//        {
//            checkboxes.get(ram).click();
//        }
//    }

}
