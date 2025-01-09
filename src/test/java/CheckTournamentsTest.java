import org.junit.jupiter.api.Test;

public class CheckTournamentsTest extends BaseUITest{

    @Test
    public void checkTournaments() {
        baseRouter.mainPage()
                .clickLoginButton()
                .senKeysEmailOrIdInputField("1099464403")
                .senKeysPasswordInputField("rxn8tc42")
                .clickSubmitButton()
                .clickCategoryPromoButton();
        baseRouter.promoPage()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentWinterRoulette()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentHolidayBlackjack()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentHolidayFuss()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentBetWinButton()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentGodziDropButton()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentSpinoLeagueButton()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentCashYourFlyWithUSButton()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton()
                .clickTournamentNonStopDropButton()
                .clickReturnTournamentButton()
                .clickCategoryUIBarCasinoButton()
                .clickCategoryBonusesContendTournamentsButton();
    }
}
