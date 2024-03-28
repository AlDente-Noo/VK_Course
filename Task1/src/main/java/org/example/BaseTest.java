package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
    @BeforeEach
    public void init(){
        setUp();
    }
    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
