package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseTest {
    private WebDriver driver;
    public void setUp(){
        driver = new ChromeDriver();
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.baseUrl = "https://ok.ru/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Before
    public void init(){
        setUp();
    }
    /*@After
    public void tearDown(){
        Selenide.closeWebDriver();
    }*/
}
