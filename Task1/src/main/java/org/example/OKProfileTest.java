package org.example;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Configuration;
import org.example.PageObjects.OKProfilePage;
import org.junit.jupiter.api.Test;

/*
Тест, который проверяет, существует ли пользователь
Если не существует, то должна появляться плашка "Такой страницы в одноклассниках нет".
Иначе - существует.
Если существует, проверяем, что это именно тот пользователь, которого мы искали (сверяем имя).
 */
public class OKProfileTest extends BaseTest{
    private static final String profilePath = "/profile";
    private static final String userURLExist = "/589739803866";
    private static final String userURLNotExist = "/589739803861";
    private static final String userName = "technopol61 ";
    @Test
    public void profileExists(){
        OKProfilePage profilePage = new OKProfilePage(Configuration.baseUrl+profilePath+userURLExist);
        if (profilePage.checkProfileExist()) {
            assertTrue(profilePage.checkProfileName(userName));
        }
    }
    @Test
    public void profileDntExists(){
        OKProfilePage profilePage = new OKProfilePage(Configuration.baseUrl+profilePath+userURLNotExist);
        assertFalse(profilePage.checkProfileExist());
    }
}
