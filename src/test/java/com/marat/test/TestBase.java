package com.marat.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.marat.config.CredentialsConfig;
import com.marat.helpers.Attach;
import com.marat.pages.AuthPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    AuthPage authPage = new AuthPage();

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://www.tutu.ru/";
        Configuration.browserSize = "1600x1100";
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
