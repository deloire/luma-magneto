package com.magneto.tests;

import com.magneto.BaseTest;
import com.magneto.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends BaseTest {

    @Test
    public void successLogin() throws IOException {
        open("/customer/account/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assertions.assertTrue(loginPage.checkLogin().contains("My Account"));
    }
}
