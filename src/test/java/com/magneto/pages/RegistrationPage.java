package com.magneto.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {
    private final SelenideElement createAccountButton =
            $x("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    private final SelenideElement inputFirstName = $x("//input[@id='firstname']");
    private final SelenideElement inputLastName = $x("//input[@id='lastname']");
    private final SelenideElement inputEmail = $x("//input[@id='email_address']");
    private final SelenideElement inputPassword = $x("//input[@id='password']");
    private final SelenideElement confirmPassword = $x("//input[@id='password-confirmation']");
    private final SelenideElement finishRegistration = $x("//*[@id=\"form-validate\"]/div/div[1]/button");


    public void toRegistration() {
        createAccountButton.click();
    }

    public void fillInputs(String password) throws IOException {
        Faker faker = new Faker();
        inputFirstName.sendKeys(faker.name().firstName());
        inputLastName.sendKeys(faker.name().lastName());
        inputEmail.sendKeys(faker.internet().emailAddress());
        inputPassword.sendKeys(password);
        confirmPassword.sendKeys(password);
        finishRegistration.click();
    }
}
