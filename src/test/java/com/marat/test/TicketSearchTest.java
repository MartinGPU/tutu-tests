package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature("Ticket search")
public class TicketSearchTest extends TestBase {


    @Test
    @Owner("Marat")
    @Tag("smoke")
    @DisplayName("Selecting route details")
    @AllureId("15041")
    void ticketSearch() {
        ticketSearchPage.tickets();
    }
}