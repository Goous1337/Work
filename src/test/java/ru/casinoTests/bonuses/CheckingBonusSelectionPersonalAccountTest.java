package ru.casinoTests.bonuses;

import org.example.pages.PersonalAccountPage;
import ru.casinoTests.BaseUITest;
import org.junit.jupiter.api.Test;


    public class CheckingBonusSelectionPersonalAccountTest extends BaseUITest {

        @Test
        public void checkingBonusesSwitcher(){

            PersonalAccountPage personalAccountPage = new PersonalAccountPage();

            baseRouter.mainPage()
                    .clickLoginButton()
                    .senKeysEmailOrIdInputField("1099464403")
                    .senKeysPasswordInputField("rxn8tc42")
                    .clickSubmitButton();
            baseRouter.personalAccountPage()
                    .clickPersonalAccountButton()
                    .clickBonusesOrDepositButton()
                    .clickBonusesSwitcherGiftButton()
                    .clickBonusesSwitcherButton()
                    .clickBonusGiftRulesButton()
                    .verifyModalWindowRulesBonusesOrGiftText();
        }
}
