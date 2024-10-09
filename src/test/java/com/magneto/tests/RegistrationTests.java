package com.magneto.tests;

import com.magneto.BaseTest;
import com.magneto.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests extends BaseTest {

    @Test
    public void registrationTest() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        String password = System.getProperty("USER_PASSWORD");

        open("/customer/account/create/");
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.toRegistration();
        registrationPage.fillInputs(password);
    }

}
