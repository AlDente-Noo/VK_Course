package org.example;
import com.codeborne.selenide.Configuration;
import org.example.PageObjects.OKMainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



/*
Тест, который проверят (не) возможность входа по (неправильному)правильному паролю.
В качестве условия входа проверяется наличие кнопки настройки профиля
В качестве условия не входа проверяется отсутствие кнопки настройки профиля
 */
public class OKLoginTest extends BaseTest{
    private final static String email = "technopol61";
    private final static String passwordRight = "technopolisPassword";
    private final static String passwordWrong = "zzzzzz1488123123zzz";

    @Test
    public void canLogin(){
        OKMainPage loginPage = new OKMainPage(Configuration.baseUrl);
        loginPage.enterEmail(email);
        loginPage.enterPassword(passwordRight);
        loginPage.pressLogin();
        assertTrue(loginPage.checkProfileSettingButton());
    }
    @Test
    public void cantLogin(){
        OKMainPage loginPage = new OKMainPage(Configuration.baseUrl);
        loginPage.enterEmail(email);
        loginPage.enterPassword(passwordWrong);
        loginPage.pressLogin();
        assertFalse(loginPage.checkProfileSettingButton());
    }
}
