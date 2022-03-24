package com.imoving.UI.methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;

public class DropdownHelper {

    public static void selectUsingVisibleText(WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
}
