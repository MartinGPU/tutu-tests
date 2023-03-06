package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature("Story search")
public class SearchStoriesTest extends TestBase {

    @Test
    @Owner("Marat")
    @Tag("smoke")
    @DisplayName("Stories")
    @AllureId("15136")
    public void searchStories() {
        searchStoriesPage.stories();
        searchStoriesPage.checkResults();
    }
}
