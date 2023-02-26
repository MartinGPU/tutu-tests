package com.marat.test;

import com.codeborne.selenide.Condition;
import com.marat.config.CredentialsConfig;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.marat.pages.BookingAHotelPage.*;
import static com.marat.test.TestData.*;
import static io.qameta.allure.Allure.step;

@Feature("Booking a hotel")
public class BookingAHotelTest extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("smoke")
    @DisplayName("Hotels")
    @AllureId("15212")
    public void searchHotel() {
        step("Open home page", () -> {
            open(credentials.url());
        });

        step("Click on hotels", () -> {
            $(hotelTab).click();
        });

        step("Click on checkbox", () -> {
            $(checkBox).click();
        });

        step("Set town", () -> {
            $(cityInputArea).setValue(cityHotel);
            sleep(2000);
            $(approveSelect).click();
        });

        step("Set date", () -> {
            $("._3CiITpDw1x-x7RK80YSACL").scrollTo();
            $(dateInputArea).click();
            $(buttonRight).doubleClick();
        });

        step("Select day", () -> {
            $(dayBegins).click();
            $(dayEnds).click();
        });

        step("Select guests and age", () -> {
            $(guestSelectArea).click();
            $(adultsGuests).click();
            $(childrenGuests).doubleClick();
            actions().dragAndDropBy(slideAgeChildOne, -10, 0).perform();
            actions().dragAndDropBy(slideAgeChildTwo, -70, 0).perform();
            sleep(3000);
        });

        step("Approve selected guests", () -> {
            $(approveSelectedGuests).click();
            sleep(3000);
        });

        step("Search hotel - results", () -> {
            $(searchButton).click();
            sleep(4000);
        });

        step("Check availability", () -> {
            $(cityCheck).shouldHave(Condition.text("Сочи"));
            $(dateAndGuestsCheck).shouldHave(Condition.text("1 апр - 30 апр • 5 гостей"));
            $(hotelCheck).shouldBe(Condition.exist);
        });
    }
}
