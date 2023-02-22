package com.marat.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchStoriesPage {

    public static SelenideElement
            plots = $("[data-ti-nav-item='story']"),
            searchItem = $("#infinite-top-search"),
            searchBox = $$("[type='text']").get(1),
            searchResults = $(".infinite-page-title");
}
