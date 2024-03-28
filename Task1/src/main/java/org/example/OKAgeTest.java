package org.example;

import com.codeborne.selenide.Configuration;
import org.example.PageObjects.OKProfilePage;
import org.junit.jupiter.api.Test;

public class OKAgeTest extends BaseTest{
    private final int minAge = 18;
    private static final String userURLExist = "/589739803866";
    private static final String profilePath = "/profile";

    @Test
    public void checkAge() {
        OKProfilePage okProfilePage = new OKProfilePage(Configuration.baseUrl+profilePath+userURLExist);
        System.out.println(okProfilePage.getAge());
    }
}
