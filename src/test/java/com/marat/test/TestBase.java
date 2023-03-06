package com.marat.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.marat.config.CredentialsConfig;
import com.marat.helpers.Attach;
import com.marat.pages.AuthPage;
import com.marat.pages.BookingAHotelPage;
import com.marat.pages.SearchStoriesPage;
import com.marat.pages.TicketSearchPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.awt.Toolkit.getProperty;

public class TestBase {
    public static SelenideConfig defaults = new SelenideConfig();

    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    AuthPage authPage = new AuthPage();
    BookingAHotelPage bookingAHotelPage = new BookingAHotelPage();
    SearchStoriesPage searchStoriesPage = new SearchStoriesPage();
    TicketSearchPage ticketSearchPage = new TicketSearchPage();

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://www.tutu.ru/";
        Configuration.browserVersion = getProperty("version", defaults.browserVersion());
        Configuration.browserSize = getProperty("size", defaults.browserSize());
        Configuration.browser = getProperty("browser", defaults.browser());
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = String.format("https://%s:%s@%s", credentials.remoteLogin(), credentials.remotePassword(), credentials.remoteUrl());
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
