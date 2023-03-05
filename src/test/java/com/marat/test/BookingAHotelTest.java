package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature("Booking a hotel")
public class BookingAHotelTest extends TestBase {


    @Test
    @Owner("Marat")
    @Tag("smoke")
    @DisplayName("Hotels")
    @AllureId("15212")
    public void searchHotel() {
        bookingAHotelPage.hotels();
    }
}
