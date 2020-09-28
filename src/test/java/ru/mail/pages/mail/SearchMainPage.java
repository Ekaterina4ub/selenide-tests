package ru.mail.pages.mail;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;

public class SearchMainPage {

    public boolean checkFirstHeader(String expectedText) {
        String firstHeaderText = $(".g").getText();
        return Pattern.compile(expectedText).matcher(firstHeaderText).find();
    }

    public void pressOnWikiResult() {
        //TODO
    }
}
