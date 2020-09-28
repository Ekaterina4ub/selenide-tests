package ru.mail.pages;

import org.openqa.selenium.By;
import ru.mail.pages.mail.SearchMainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public void inputToSearch(String text) {
        $(By.name("q")).sendKeys(text);
    }

    public SearchMainPage pressSearchButton() {
        String searchButtonClass = ".gNO89b";
        $(searchButtonClass).click();
        return page(SearchMainPage.class);
    }
}
