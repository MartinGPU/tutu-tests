package com.marat.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.marat.test.TestBase.credentials;
import static io.qameta.allure.Allure.step;

public class UpdateUserDataPage {

    private final SelenideElement
            userItem = $("[data-ti='login_link']"),
            loginTextInput = $("[data-ti='email-field']"),
            passwordTextInput = $("[data-ti='password-field']"),
            submitButton = $("[data-ti='submit-trigger']"),
            adventures = $$(".nfzNIdRXlNVIbpPim3zpN").get(5),
            adventureProfile = $("[data-ti='adventures_profile_link']"),
            radioButton = $$("[data-ti='organizer_type_radiobutton']").findBy(Condition.exactValue("1")),
            imageField = $("[name='image']"),
            publicName = $("#name"),
            description = $("#description"),
            agreementBox = $("#agreement"),
            hotel = $$("[data-type='hotels']").get(1),
            saveDataButton = $$("[data-ti='order-button-slot-content']").findBy(Condition.text("Сохранить")),
            imageExist = $("._2cwRMtj___imgPreview"),
            userEmail = $("#contactEmail"),
            imageField2 = $("[data-ti = 'remove_image_button']");

    public void updateData() {
        step("Open home page", () -> {
            open("https://go.tutu.ru/");
        });

        step("Log in", () -> {
            userItem.click();
            loginTextInput.setValue(credentials.login());
            passwordTextInput.setValue(credentials.password());
            submitButton.click();
        });

        step("Go to profile", () -> {
//            adventures.click();
//            sleep(10000);
            adventureProfile.click();
            radioButton.click();
            imageField.uploadFromClasspath("img/Avatar.jpg");
            publicName.setValue("Фролов Анатолий");
            description.setValue("Краткое описание");
            agreementBox.click();
            saveDataButton.click();
            sleep(5000);
        });
    }

    public void checkProfile() {
        step("Check user profile", () -> {
            imageExist.shouldBe(Condition.exist);
            publicName.shouldHave(Condition.value("Фролов Анатолий"));
            userEmail.shouldHave(Condition.value("wwugoydwcyblc@eurokool.com"));
            description.shouldHave(Condition.value("Краткое описание"));
        });
    }

    public void clearData() {
        imageField2.click();
        publicName.clear();
        description.clear();
        saveDataButton.click();
    }
}
