package com.imoving.UI.methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class CustomAssertions {


    public static void assertText(String message, String expectedTxt, WebElement actualElement){
        Helper.waitElementToBeDisplayed(actualElement);
        Assertions.assertEquals(expectedTxt, Helper.getTextValue(actualElement), "Comparing: "+message);
    }
}
