package com.magneto;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.magneto.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {


    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x720";
        Configuration.baseUrl = "https://magento.softwaretestingboard.com";
        Configuration.headless = true;
    }

    public void singIn() throws IOException {
        open("/customer/account/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
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
