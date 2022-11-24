package com.imoving.UI.methods;

import com.imoving.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    private static Logger logger = (Logger) LogManager.getLogger(Helper.class);


    public static void click(WebElement element){
        logger.info("I am trying to click element "+element);

        try{
            waitElementToBeDisplayed(element);
            waitElementToBeClickable(element);
            navigateToElement(element);
            element.click();
            logger.info("Element is clicked");
        }catch (ElementClickInterceptedException e){
            logger.warn("Element is not clickable but i clicked with JS click");
            jsClick(element);
        }
    }

    public static void waitElementToBeDisplayed(WebElement waitElement){
        logger.debug("Waiting for element to be displayed "+waitElement);
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOf(waitElement));
    }

    public static void waitElementToBeClickable(WebElement clickableElement){
        logger.info("Waiting for element to be clickable ");
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(clickableElement));
    }

    public static void sendKeys(WebElement sendElement, String value){
        sendElement.sendKeys(value);
    }

    public static void pause(Integer pause){
        logger.info("Pausing the system for "+pause);
        try{
            logger.debug("Trying pause the system ");
            TimeUnit.MILLISECONDS.sleep(pause);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static String getTextValue(WebElement getTextValue){
        waitElementToBeDisplayed(getTextValue);
        return getTextValue.getText();
    }

    public static void jsClick(WebElement element){
        waitElementToBeDisplayed(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("argument[0].click();",element);
    }

    public static void navigateToElement(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void multiClick(WebElement element, int howManyTimes){
        int counter = howManyTimes;
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        while(counter > 0){
            element.click();
            counter--;
        }
    }

    public static String color(String color){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        switch (color){
            case "reset":
                return ANSI_RESET;
            case "black":
                return ANSI_BLACK;
            case "red":
                return ANSI_RED;
            case "green":
                return ANSI_GREEN;
            case "yellow":
                return ANSI_YELLOW;
            case "blue":
                return ANSI_BLUE;
            case "purple":
                return ANSI_PURPLE;
            case "cyan":
                return ANSI_CYAN;
            case "white":
                return ANSI_WHITE;
            default: return "No color!";
        }
    }
}
