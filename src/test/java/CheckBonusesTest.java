
import org.junit.jupiter.api.Test;

public class CheckBonusesTest extends BaseUITest {

    @Test
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
                .clickLoyaltyWorthWeighGoldButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusVipCashbackButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusJackysBetButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusBigGameButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusDealOfDayButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusFridayButton()
                .clickReturnPromotionsBonusesButton()
                .clickBonusHuntSpinButton();
    }
}
