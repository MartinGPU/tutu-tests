package com.marat.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BookingAHotelPage {

    public static SelenideElement
            hotelTab = $$("[data-type='hotels']").get(1),
            checkBox = $(".o33616"),
            cityInputArea = $("[data-ti='hotels-destination-input']"),
            approveSelect = $$("[data-ti='suggest-item']").get(0),
            dateInputArea = $("[data-ti='date-input']"),
            buttonRight = $("[data-ti='order-calendar-navigation-next']"),
            dayBegins = $("[data-ti-date='2023-04-01T08:00:00.000Z']"),
            dayEnds = $("[data-ti-date='2023-04-30T08:00:00.000Z']"),
            guestSelectArea = $("[data-ti='guest-input']"),
            adultsGuests = $$("[data-ti='order-button-slot-content']").get(2),
            childrenGuests = $$("[data-ti='order-button-slot-content']").get(4),
            approveSelectedGuests = $("[data-ti='hotels-guest-bottom-button']"),
            slideAgeChildOne = $$("._3JhjQiplIukA_-M_xkpNAt").get(0),
            slideAgeChildTwo = $$("._3JhjQiplIukA_-M_xkpNAt").get(1),
            searchButton = $("[data-ti='order-button-slot-content']"),
            cityCheck = $$("span").get(23),
            dateAndGuestsCheck = $$("span").get(24),
            hotelCheck = $$(".Cu8QgpxhPYAa62VjVVpH").get(0);
}
