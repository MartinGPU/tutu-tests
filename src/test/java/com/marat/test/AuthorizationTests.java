package com.marat.test;

import com.codeborne.selenide.Condition;
import com.marat.config.CredentialsConfig;
import com.marat.pages.AuthPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.*;
import static com.marat.pages.AuthPage.*;
import static io.qameta.allure.Allure.step;

@Feature("Authorization")
public class AuthorizationTests extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    AuthPage authPage = new AuthPage();

    static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of("tndlhbnfecdnf@eurokool.ru", "adUlA}'y"),
                Arguments.of("tndlhbnfecdnf@eurokool.com", "123"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @Tag("smoke1")
    @DisplayName("Unsuccessful auth")
    @MethodSource
    @AllureId("15211")
    public void methodSource(String str1, String str2) {
        authPage.setInvalidLogin(str1, str2);
    }

    @Test
    @Tag("smoke2")
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
