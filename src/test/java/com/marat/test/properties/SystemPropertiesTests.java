package com.marat.test.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    @Tag("properties")
    void operaTest() {
        String browser = System.getProperty("browser", "opera");
        String version = System.getProperty("version", "85");
        String bit = System.getProperty("bit", "64");
        String browserSize = System.getProperty("browserSize", "1600x1100");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(bit);
        System.out.println(browserSize);
    }

    @Test
    @Tag("properties")
    void fireFoxTest() {
        String browser = System.getProperty("browser", "firefox");
        String version = System.getProperty("version", "97");
        String bit = System.getProperty("bit", "64");
        String browserSize = System.getProperty("browserSize", "1600x1100");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(bit);
        System.out.println(browserSize);
    }

    @Test
    @Tag("properties")
    void chromeTest() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "110");
        String bit = System.getProperty("bit", "64");
        String browserSize = System.getProperty("browserSize", "1600x1100");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(bit);
        System.out.println(browserSize);
    }

}
