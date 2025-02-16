package ru.casinoTests.bonuses;

import ru.casinoTests.BaseUITest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Проверка")
public class CheckBonusesTest extends BaseUITest {

    @Test
    @Story("Пользователь может зарегистрировать новый аккаунт")
    @DisplayName("Регистрации нового аккаунта")
    public void CheckBonuses() {
        baseRouter.mainPage()
                .clickLoginButton()
                .senKeysEmailOrIdInputField("1099464403")
                .senKeysPasswordInputField("rxn8tc42")
                .clickSubmitButton()
                .clickCategoryPromoButton();
        baseRouter.promoPage()
                .clickCategoryUIBarCasinoButton()
                .clickBonusWelcomePackageButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickLoyaltyWorthWeighGoldButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusVipCashbackButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusJackysBetButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusBigGameButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusDealOfDayButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusFridayButton()
                .clickReturnPromotionsBonusesButton()
                .clickCategoryUIBarCasinoButton()
                .clickBonusHuntSpinButton();
    }
}
