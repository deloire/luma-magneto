package com.magneto;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {


    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x720";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    public void init(){
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
