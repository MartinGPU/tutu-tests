package com.marat.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.marat.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.marat.test.TestData.*;

public class AuthPage {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    public static SelenideElement
            userItem = $("[data-ti='login_link']"),
            loginTextInput = $("[data-ti='email-field']"),
            passwordTextInput = $("[data-ti='password-field']"),
            submitButton = $("[data-ti='submit-trigger']"),
            userItem2 = $("[data-ti='user_name_link']"),
            authAlert = $("[data-ti-error='authApi']"),
            authAlertEmail = $("[data-ti-error='email']"),
            authAlertPaasword = $("[data-ti-error='password']");

    public AuthPage setInvalidLogin(String str1, String str2) {
        open(credentials.url());
        sleep(3000);
        $(userItem).click();
        sleep(1000);
        loginTextInput.setValue(str1);
        passwordTextInput.setValue(str2);
        $(submitButton).click();
        sleep(3000);

        if (str1 == null & str2 == null) {
            $(authAlertEmail).shouldHave(Condition.text(alertMessage2));
            $(authAlertPaasword).shouldHave(Condition.text(alertMessage3));
        } else {
            $(authAlert).shouldHave(Condition.text(alertMessage));
            loginTextInput.clear();
            passwordTextInput.clear();
        }
        return this;
    }
}
