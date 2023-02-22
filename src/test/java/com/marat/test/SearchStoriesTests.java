package com.marat.test;

import com.marat.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.marat.pages.SearchStoriesPage.*;
import static com.marat.test.TestData.desiredStory;
import static io.qameta.allure.Allure.step;

public class SearchStoriesTests extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    @Test
    @Tag("smoke")
    public void searchStories() {
        step("Open home page", () -> {
            open(credentials.url());
        });

        step("Clicking to stories", () -> {
            $(plots).click();
        });

        step("Clicking to search item", () -> {
            $(searchItem).click();
        });

        step("Set desired story", () -> {
            $(searchBox).setValue(desiredStory).pressEnter();
        });

        step("Checking results of story search", () -> {
            $(searchResults).shouldHave(text(desiredStory));
            sleep(6000);
        });
    }
}
