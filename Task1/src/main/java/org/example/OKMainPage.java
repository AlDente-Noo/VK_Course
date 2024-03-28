package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OKMainPage {
    private final SelenideElement fieldEmail = $(byName("st.email"));
    private final SelenideElement fieldPassword = $(byName("st.password"));
    private final SelenideElement buttonLoginToOK = $(byValue("Войти в Одноклассники"));
    public OKMainPage (String URL) {
        Selenide.open(URL);
    }

    public void enterEmail (String email){
        fieldEmail.setValue(email);
    }
    public void enterPassword (String password){
        fieldPassword.setValue(password);
    }
    public void pressLogin (){
        buttonLoginToOK.click();
    }
}
