package ru.casinoTests;

import ru.casinoTests.BaseUITest;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseUITest {

    @Test
    public void approveTestButton() {
        baseRouter
                .mainPage()
                .clickCategoryPromoButton();
        baseRouter
                .promoPage()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickSpinOfThronesThree();
    }

}
