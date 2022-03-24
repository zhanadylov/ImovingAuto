package com.imoving.UI.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class MicrosoftEdgeWebDriver {

    public static WebDriver loadEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size=1920,1080");


        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
}
