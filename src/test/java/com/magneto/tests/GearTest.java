package com.magneto.tests;


import com.magneto.BaseTest;
import com.magneto.pages.BagsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class GearTest extends BaseTest {

    @Test
    public void goToGearsPageTest() throws IOException {
        singIn();

        BagsPage bagsPage = new BagsPage();
        bagsPage.goToGears();
        Assertions.assertTrue(bagsPage.checkHeading().contains("Gear"));
    }

    @Test
    public void goToBagsPageTest() throws IOException {
        singIn();

        open("/gear.html");
        
        BagsPage bagsPage = new BagsPage();
        bagsPage.goToBagsPage();
        Assertions.assertTrue(bagsPage.checkBagsHeading().contains("Bags"));
    }

}
