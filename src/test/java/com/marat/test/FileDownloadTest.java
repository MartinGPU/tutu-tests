package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

@Feature("Download pdf file")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileDownloadTest extends TestBase {

    @Order(4)
    @Tag("downloads")
    @DisplayName("Download pdf file")
    @AllureId("16019")
    @Test
    @Owner("Marat")
    public void downloadPdfFile() {
        fileDownloadPage.clientPage();
    }
}
