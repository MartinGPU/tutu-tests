package com.marat.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.*;
import static com.marat.test.TestBase.credentials;
import static io.qameta.allure.Allure.step;

public class UpdateUserDataPage {

    Faker faker = new Faker();

    private final SelenideElement
            userItem = $("[data-ti='login_link']"),
            loginTextInput = $("[data-ti='email-field']"),
            passwordTextInput = $("[data-ti='password-field']"),
            submitButton = $("[data-ti='submit-trigger']"),
            adventures = $$(".styles__caption__LoDUe").get(6),
            adventureProfile = $("[data-ti='adventures_profile_link']"),
            radioButton = $$("[data-ti='organizer_type_radiobutton']").findBy(Condition.exactValue("2")),
            imageField = $("[name='image']"),
            publicName = $("#name"),
            description = $("#description"),
            agreementBox = $("#agreement"),
            saveDataButton = $$("[data-ti='order-button-slot-content']").findBy(Condition.text("Сохранить"));


    public void updateData() {
        step("Open home page", () -> {
           open("");
        });

        step("Log in", () -> {
            userItem.click();
            loginTextInput.setValue(credentials.login());
            passwordTextInput.setValue(credentials.password());
            submitButton.click();
        });

        step("Go to profile", () -> {
            adventures.click();
            adventureProfile.click();
            radioButton.click();
            imageField.uploadFromClasspath("img/Avatar.jpg");
            publicName.setValue(faker.name().fullName());
            description.setValue(faker.yoda().quote());
            agreementBox.click();
            saveDataButton.click();
        });
    }
}
