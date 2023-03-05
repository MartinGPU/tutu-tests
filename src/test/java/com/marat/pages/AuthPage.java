package com.marat.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.marat.test.TestBase.credentials;
import static com.marat.test.TestData.*;
import static io.qameta.allure.Allure.step;

public class AuthPage {
    private final SelenideElement
            userItem = $("[data-ti='login_link']"),
            loginTextInput = $("[data-ti='email-field']"),
            passwordTextInput = $("[data-ti='password-field']"),
            submitButton = $("[data-ti='submit-trigger']"),
            userItem2 = $("[data-ti='user_name_link']"),
            authAlert = $("[data-ti-error='authApi']"),
            authAlertEmail = $("[data-ti-error='email']"),
            authAlertPassword = $("[data-ti-error='password']");

    public void setInvalidLogin(String userEmail, String userPassword) {
        step("Open home page", () -> {
            open("");
        });

        step("Set invalid creds", () -> {
                    userItem.click();
                    loginTextInput.setValue(userEmail);
                    passwordTextInput.setValue(userPassword);
                    submitButton.click();

                    if (userEmail == null & userPassword == null) {
                        authAlertEmail.shouldHave(Condition.text(alertMessage2));
                        authAlertPassword.shouldHave(Condition.text(alertMessage3));
                    } else {
                        authAlert.shouldHave(Condition.text(alertMessage));
                        loginTextInput.clear();
                        passwordTextInput.clear();
                    }
                }
        );
    }

    public void setValidLogin() {
        step("Open home page", () -> {
            open("");
        });

        step("Set login", () -> {
            userItem.click();
            loginTextInput.setValue(credentials.login());
        });

        step("Set password", () -> {
            passwordTextInput.setValue(credentials.password());
        });

        step("Click on login", () -> {
            submitButton.click();
        });

        step("Check successful auth", () -> {
            userItem2.shouldHave(Condition.text("wwugoydwcyblc@eurokool.com"));
        });
    }
}

