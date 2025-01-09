import org.junit.jupiter.api.Test;

public class CheckingVipCashbackRulesTest extends BaseUITest {

    @Test
    public void vipCashbackRules() {
        baseRouter.mainPage()
                .clickLoginButton()
                .senKeysEmailOrIdInputField("1099464403")
                .senKeysPasswordInputField("rxn8tc42")
                .clickSubmitButton();
        baseRouter
                .personalAccountPage()
                .clickPersonalAccountButton();
    }

}
