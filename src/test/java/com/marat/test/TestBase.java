package com.marat.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.marat.config.CredentialsConfig;
import com.marat.helpers.Attach;
import com.marat.pages.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    AuthPage authPage = new AuthPage();
    BookingAHotelPage bookingAHotelPage = new BookingAHotelPage();
    SearchStoriesPage searchStoriesPage = new SearchStoriesPage();
    TicketSearchPage ticketSearchPage = new TicketSearchPage();
    UpdateUserDataPage updateUserDataPage = new UpdateUserDataPage();
    FileDownloadPage fileDownloadPage = new FileDownloadPage();

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://www.tutu.ru/";
        Configuration.browserVersion = System.getProperty("version", "111.0");
        Configuration.browserSize = System.getProperty("size", "1366x900");
        Configuration.browser = System.getProperty("browser", "chrome");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "http://localhost:4444/wd/hub/";
    }

    @BeforeEach
    public void beforeEach() {
        open("");
    }
    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
