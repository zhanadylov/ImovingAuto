package com.imoving.UI.utils;

import com.imoving.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class Driver {

    private Driver(){
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default: driver = ChromeWebDriver.loadChromeDriver();
                break;
                case "Firefox": driver = FireFoxWebDriver.loadFireFoxDriver();
                break;
                case "MicrosoftEdge": driver = MicrosoftEdgeWebDriver.loadEdgeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try{
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
