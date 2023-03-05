package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Feature("Authorization")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AuthTest extends TestBase {

    static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of("tndlhbnfecdnf@eurokool.ru", "adUlA}'y"),
                Arguments.of("tndlhbnfecdnf@eurokool.com", "123"),
                Arguments.of(null, null)
        );
    }

    @Tag("authorization")
    @DisplayName("Unsuccessful auth")
    @MethodSource
    @AllureId("15211")
    @ParameterizedTest
    @Owner("Marat")
    @Order(1)
    public void methodSource(String userEmail, String userPassword) {
        authPage.setInvalidLogin(userEmail, userPassword);
    }

    @Tag("authorization")
    @DisplayName("Successful auth")
    @AllureId("15024")
    @Test
    @Owner("Marat")
    @Order(2)
    public void loginPage() {
        authPage.setValidLogin();
    }
}