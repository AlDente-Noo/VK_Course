package org.example.PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OKProfilePage {

    private final SelenideElement fieldDateOfBirth = $(byXpath("//*[@id=\"hook_Block_MiddleColumnAnonUserHead\"]" +
            "/anonym-user-head/div/div/div[2]/div[1]/a[2]/div"));
    private final SelenideElement profileDsntExistsPic = $(byXpath("/html/body/div[1]/h1"));
    private final SelenideElement profileNameField = $(byXpath("//*[@id=\"hook_Block_MiddleColumnAnonUserHead\"]" +
            "/anonym-user-head/div/div/div[2]/span"));
    public OKProfilePage (String URL) {
        Selenide.open(URL);
    }
    public boolean checkProfileName(String expectName){
        return profileNameField.getText().equals(expectName);
    }
    public boolean checkProfileExist() {
        return profileDsntExistsPic.exists();
    }
    //Да, возможно парсер надо было засунуть куда-то в другое место.
    public String getAge (){
        String regex = "^.*?\\([^\\d]*(\\d+)[^\\d]*\\).*$";
        String age = "0";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fieldDateOfBirth.getText());
        while (matcher.find()) {
            age = matcher.group(1);
        }
         return age;
    }
}
