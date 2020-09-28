package ru.mail.pages.mail;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ResultPage {

    public FirstResultPage clickOnFirstResult() {
        String searchResultClass = ".g";
        $(searchResultClass).click();
        return page(FirstResultPage.class);
    }
}
