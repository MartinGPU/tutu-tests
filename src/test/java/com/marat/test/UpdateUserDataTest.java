package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

@Feature("Update user data")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UpdateUserDataTest extends TestBase {

    @Order(7)
    @Tag("update")
    @DisplayName("Update user data")
    @AllureId("16020")
    @Test
    @Owner("Marat")
    public void updateData() {
        updateUserDataPage.updateData();
        updateUserDataPage.checkProfile();
        updateUserDataPage.clearData();
    }
}
