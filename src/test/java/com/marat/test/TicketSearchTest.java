package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

@Feature("Ticket search")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TicketSearchTest extends TestBase {

    @Order(3)
    @Tag("smoke")
    @DisplayName("Selecting route details")
    @AllureId("15041")
    @Test
    @Owner("Marat")
    public void ticketSearch() {
        ticketSearchPage.tickets();
    }
}