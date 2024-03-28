package org.example;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class OdnoklassnikiTest extends BaseTest{
    private final static String email = "technopol61";
    private final static String password = "technopolisPassword";

    GooglePage google = new GooglePage();
    @Test
    public void canLogin(){
        OKMainPage loginPage = new OKMainPage(Configuration.baseUrl);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.pressLogin();
    }
}
