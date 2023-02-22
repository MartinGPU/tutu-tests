package com.marat.test;

import com.codeborne.selenide.Condition;
import com.marat.config.CredentialsConfig;
import com.marat.test.properties.OwnerTests;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.marat.pages.AuthPage.*;
import static io.qameta.allure.Allure.step;

@Feature("Authorization")
public class AuthorizationTest extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("smoke")
    @DisplayName("Successful auth")
    @AllureId("15024")
    public void loginPage() {

        step("Open home page", () -> {
            open(credentials.url());
            sleep(3000);
        });

        step("Set login", () -> {
            $(userItem).click();
            sleep(1000);
            $(loginTextInput).setValue(credentials.login());
            sleep(1000);
        });

        step("Set password", () -> {
            $(passwordTextInput).setValue(credentials.password());
            sleep(1000);
        });

        step("Click on login", () -> {
            $(submitButton).click();
            sleep(3000);
        });

        step("Check successful auth", () -> {
            $(userItem2).shouldHave(Condition.text("wwugoydwcyblc@eurokool.com"));
            sleep(1000);
        });
    }
}
