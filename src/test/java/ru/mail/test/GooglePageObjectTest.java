package ru.mail.test;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import ru.mail.pages.MainPage;
import ru.mail.pages.mail.SearchMainPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class GooglePageObjectTest {

    @Test
    public void searchWiki() {

        Configuration.browser = "firefox";
        Configuration.timeout = 1000;
        String startLink = "https://www.google.com";
        String inputText = "Steve Jobs";
        String expectedText = "Steve.*Jobs";

        WebDriverManager.firefoxdriver().setup();
        open(startLink);

        MainPage mainPage = new MainPage();
        mainPage.inputToSearch(inputText);
        SearchMainPage searchMainPage  = mainPage.pressSearchButton();
        assertTrue(searchMainPage.checkFirstHeader(expectedText));
    }

}
