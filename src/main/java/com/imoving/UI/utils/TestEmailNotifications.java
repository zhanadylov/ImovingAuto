package com.imoving.UI.utils;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.SearchCriteria;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestEmailNotifications {
    public static void main(String[] args) throws MailosaurException, IOException {

        String apiKey = "WwDzzjFLvcklZE0H";
        String serverId = "hjqyapn4";
        String serverDomain = "hjqyapn4.mailosaur.net";

        MailosaurClient mailoSaur = new MailosaurClient(apiKey);
        SearchCriteria searchCriteria = new SearchCriteria();

        searchCriteria.withSentFrom("zhanadylov.kg@gmail.com");
        searchCriteria.withSubject("Amazon");

        Message message = mailoSaur.messages().get(serverId, searchCriteria);
        System.out.println(message.subject());
//        System.out.println(message.text().body());
        System.out.println(message.html().links().get(0).href());
        String link = message.html().links().get(0).href();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(link);

    }
}
