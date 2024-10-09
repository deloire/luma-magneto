package com.magneto.tests;

import com.codeborne.selenide.Selenide;
import com.magneto.BaseTest;
import com.magneto.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends BaseTest {

    @Test
    public void correctLogin() throws IOException {
        open("/customer/account/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assertions.assertTrue(loginPage.checkLogin().contains("My Account"));
    }

    @Test
    public void loginError() {
        open("/customer/account/login");
        LoginPage loginPage = new LoginPage();
        loginPage.incorrectLogin();
        Selenide.sleep(3000);
        Assertions.assertTrue(loginPage.checkIncorrectLogin().contains("sign-in was incorrect"));
    }


}
