package com.imoving.UI.methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;
import java.util.Random;

public class DropdownHelper {

    public static void selectUsingVisibleText(WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    //Work with selector
    public static void SelectHomePage(WebElement element, int cssSelector){
        Select select = new Select(element);
        Random random = new Random();
        int index = random.nextInt(cssSelector);
        select.selectByIndex(index);
    }
}
