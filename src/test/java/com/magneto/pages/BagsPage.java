package com.magneto.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BagsPage {
    private final SelenideElement gearsPage = $x("//nav/ul/li[4]/a");
    private final SelenideElement heading = $x("//h1/span");
    private final SelenideElement bagsPage = $x("//dd//ol//li[1]//a");
    private final SelenideElement bagsHeading = $x("//h1/span");



    public void goToGears() {
        gearsPage.click();
    }

    public String checkHeading() {
        return heading.getText();
    }

    public void goToBagsPage() {
        bagsPage.click();
    }

    public String checkBagsHeading() {
        return bagsHeading.getText();
    }


}
