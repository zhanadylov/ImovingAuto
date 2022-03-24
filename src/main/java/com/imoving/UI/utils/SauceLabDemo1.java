package com.imoving.UI.utils;

import com.imoving.UI.methods.Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SauceLabDemo1 {
    public static void main(String[] args) throws MalformedURLException {

        String USERNAME = "oauth-zhanadylov.kg-44f0f";
        String ACCESS_KEY = "66f624b9-9cb7-453c-bb16-2b763b1fe0e2";

        String url = "https://oauth-zhanadylov.kg-44f0f:66f624b9-9cb7-453c-bb16-2b763b1fe0e2@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.MOJAVE);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(url), capabilities);

        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("iPhone" + Keys.ENTER);
        searchBox.click();
        Helper.pause(5000);

        List<WebElement> brands = driver.findElements(By.id("brandsRefinements"));
        for (WebElement e : brands) {
            System.out.println(e.getText());
        }

    }
}
