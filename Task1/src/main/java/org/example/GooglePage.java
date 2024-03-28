package org.example;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public GooglePage open() {
        Selenide.open("/");
        return this;
    }
}
