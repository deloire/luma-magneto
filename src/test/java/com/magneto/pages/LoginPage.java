package com.magneto.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement emailInput = $x("//div//input[@id='email']");
    private final SelenideElement passwordInput = $x("//div//input[@name='login[password]']");
    private final SelenideElement signInButton = $x("//*[@id=\"send2\"]");
    private final SelenideElement myAccount = $x("//h1/span");
    private final SelenideElement loginAlert = $x("//div[@class='messages']//div//div");


    public void login() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        String email = System.getProperty("USER_EMAIL");
        String password = System.getProperty("USER_PASSWORD");

        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public String checkLogin() {
        return myAccount.getText();
    }

    public void incorrectLogin() {
        emailInput.sendKeys("randomIncorrectEmail@gmail.com");
        passwordInput.sendKeys("randomIncorrectLogin");
        signInButton.click();
    }

    public String checkIncorrectLogin() {
        return loginAlert.getText();
    }


}
