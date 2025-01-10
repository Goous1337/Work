package ru.casinoTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import org.example.pages.BaseRouter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

@Feature("Front")
public class BaseUITest {

    public BaseRouter baseRouter = new BaseRouter();

    protected void authorization() {

    }

    @BeforeEach
    public void setupSelenideConfiguration () {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        String authorizationPageURL = "https://red-direct.com/";
        Selenide.open(authorizationPageURL);
    }

    @AfterEach
    public void closeBrowser () {
        Selenide.closeWebDriver();
    }



}
