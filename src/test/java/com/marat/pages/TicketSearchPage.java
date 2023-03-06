package com.marat.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static com.marat.test.TestData.fromTown;
import static com.marat.test.TestData.toTown;
import static io.qameta.allure.Allure.step;

public class TicketSearchPage {

    private final SelenideElement
            busTab = $("[data-content='bus']"),
            routBeginsField = $$("[data-ti='suggest-selector']").get(0),
            routEndsField = $$("[data-ti='suggest-selector']").get(1),
//            dateDepartureField = $("[data-ti='date-input']"),
            selectDay = $$("[data-ti='date-link']").get(1),
            passengersField = $("[data-ti='passengers-input']"),
            addPassenger = $$("[data-ti='passenger-counter-button']").get(1),
            addChildPassenger = $$("[data-ti='passenger-counter-button']").get(3),
            runSearch = $("[data-ti='submit-button']"),
            orderButton = $("[data-ti='order-button-slot-content']");
//            departureResultContent = $$("[data-ti='stopover-place']").get(0),
//            arrivalResultsContent = $$("[data-ti='stopover-place']").get(1);

    public void tickets() {
        step("Open home page", () -> {
            open("");
            //sleep(3000);
        });

        step("Select bus tab", () -> {
            busTab.click();
            //sleep(1000);
        });

        step("Set rout begins", () -> {
            routBeginsField.click();
            routBeginsField.setValue(fromTown);
            //sleep(1000);
        });

        step("Set rout ends", () -> {
            routEndsField.click();
            routEndsField.setValue(toTown);
            //sleep(1000);
        });

        step("Set departure date", () -> {
            selectDay.click();
            //sleep(1000);
        });

        step("Set passengers quantity", () -> {
            passengersField.click();
            //sleep(1000);
            addPassenger.click();
            //sleep(1000);
            addChildPassenger.click();

        });

        step("Run searching process", () -> {
            runSearch.click();
            //sleep(6000);
        });

        step("Checking search results", () -> {
            orderButton.shouldBe(exist);
        });
    }
}
