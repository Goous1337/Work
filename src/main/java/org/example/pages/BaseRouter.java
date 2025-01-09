package org.example.pages;

import static com.codeborne.selenide.Selenide.page;

public class BaseRouter {

    public MainPage mainPage() {
        return page(MainPage.class);
    }

    public PromoPage promoPage() {
        return page(PromoPage.class);
    }

    public PersonalAccountPage personalAccountPage() {
        return page(PersonalAccountPage.class);
    }


}
