package com.marat.pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class FileDownloadPage {

    private final SelenideElement
            pdfFile = $$(".btn-xl-l").get(1);

    public void clientPage() {
        step("Open home page", () -> {
            open("https://b2b.tutu.ru/");
            File downloadedFile = pdfFile.download();
            PDF parsedPdf = new PDF(downloadedFile);
            assertThat(parsedPdf.text).contains("");
        });
    }
}

