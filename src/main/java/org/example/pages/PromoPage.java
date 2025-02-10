package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PromoPage {

    private final SelenideElement categoryUIBarCasinoButton = $x("//label[span[text()='Казино']]");
    private final SelenideElement categoryBonusesContendTournamentsButton =$x("//span[contains(@class, 'caption__label') and text()='Турниры']");
    private final SelenideElement categoryBonusesContendPromotionsButton =$x("//span[contains(@class, 'caption__label') and text()='Бонусы']");
    private final SelenideElement spinOfThronesThree =$x("//a[contains(@class, 'bonuses-preview-tournament') and contains(@href, '/ru/bonus/casino/tournaments/412')]");
    private final SelenideElement bonusWelcomePackageButton = $x("//a[@href='/ru/bonus/casino/promotions/slot_first_deposit']");
    private final SelenideElement bonusLoyaltyWorthWeighGoldButton = $x("//a[@href='/ru/bonus/casino/promotions/slot_ten_deposit']");
    private final SelenideElement bonusVipCashbackButton = $x("//a[@href='/ru/bonus/casino/promotions/vip_cashback']");
    private final SelenideElement bonusBigGameButton =$x("//a[@href='/ru/bonus/casino/promotions/big_play_day']");
    private final SelenideElement returnPromotionsBonusesButton =$x("//span[@class='ui-caption--size-s ui-caption ui-breadcrumbs-point__label'" +
            " and text()='Акции и бонусы']");
    private final SelenideElement hedderCasinoButton =$x("//label[@class='ui-switch--is-active ui-switch--theme-default ui-switch ui-switches-item__switch ui-switches-item-switch']//span[text()='Казино']");
    private final SelenideElement returnTournamentButton =$x("//a[.//span[contains(@class, 'casino-header-breadcrumbs__label') and text()='Турниры']]");
    private final SelenideElement bonusDealOfDayButton =$x("//a[@href='/ru/bonus/casino/promotions/deal_of_the_day']");
    private final SelenideElement bonusFridayBustButton =$x("//a[@class='bonuses-preview-bonus bonuses-preview-bonus--theme-dark bonus-tournaments-list__block'" +
            " and @title='Пятничный буст']//span[@class='caption__label' and text()='Узнать больше']");
    private final SelenideElement bonusWildHuntSpinButton = $x("//a[@class='bonuses-preview-bonus bonuses-preview-bonus--theme-dark bonus-tournaments-list__block'" +
            " and @title='Дикая охота за спинами']//span[@class='caption__label' and text()='Узнать больше']");
    private final SelenideElement bonusJackysBetButton =$x("//a[@href='/ru/bonus/casino/promotions/jackys_bet']");
    private final SelenideElement tournamentFestiveUtopiaButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ПРАЗДНИЧНАЯ УТОПИЯ']]");
    private final SelenideElement tournamentChristmasBellsFestivalButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ПРАЗДНИК РОЖДЕСТВЕНСКИХ КОЛОКОЛЬЧИКОВ']]");
    private final SelenideElement tournamentPlayWinCelebrateNewYearButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ИГРАЙ И ПОБЕЖДАЙ, НОВЫЙ ГОД ВСТРЕЧАЙ!']]");
    private final SelenideElement tournamentAmarixXmasButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='AMARIX XMAS']]");
    private final SelenideElement tournamentTreasuresChristmasButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='СОКРОВИЩА РОЖДЕСТВА']]");
    private final SelenideElement tournamentNewYearMadnessButton = $x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='НОВОГОДНИЙ ПЕРЕПОЛОХ']]");
    private final SelenideElement tournamentFabulousGenerousMonthButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='СКАЗОЧНО ЩЕДРЫЙ МЕСЯЦ']]");
    private final SelenideElement tournamentChristmasExtravaganzaButtonButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='РОЖДЕСТВЕНСКАЯ ФЕЕРИЯ']]");
    private final SelenideElement tournamentWinterShowDownButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ЗИМНЯЯ СХВАТКА']]");
    private final SelenideElement tournamentWinterRouletteButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ЗИМНЯЯ РУЛЕТКА']]");
    private final SelenideElement tournamentHolidayBlackjackButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            " and text()='ПРАЗДНИЧНЫЙ БЛЭКДЖЕК']]");
    private final SelenideElement tournamentHolidayFussButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='ПРАЗДНИЧНАЯ СУМАТОХА']]");
    private final SelenideElement tournamentBetWinButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='СТАВЬ И ВЫИГРЫВАЙ']]");
    private final SelenideElement tournamentGodziDropButton = $x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='GODZIDROP СУПЕРБОНУСНЫЙ ВЗРЫВ']]");
    private final SelenideElement tournamentSpinoLeagueButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='SPINOLEAGUE']]");
    private final SelenideElement tournamentCashYourFlyWithUSButton = $x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='DROPS & WINS 2024']]");
    private final SelenideElement tournamentNonStopDropButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
            "and text()='NON-STOP DROP']]");
     private final SelenideElement tournamentNewYearFestivalHappinessButton = $x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
             "and text()='НОВОГОДНИЙ ФЕСТИВАЛЬ СЧАСТЬЯ']]");
     private final SelenideElement tournamentMidnightWondersButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
             "and text()='ПОЛУНОЧНЫЕ ЧУДЕСА']]");
     private final SelenideElement tournamentJoyfulHolidayButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
             "and text()='РАДОСТНЫЙ ПРАЗДНИК']]");
     private final SelenideElement tournamentIceFestivalButton =$x("//a[.//span[contains(@class, 'bonuses-preview-tournament__text')" +
             "and text()='ЛЕДЯНОЙ ФЕСТИВАЛЬ']]");


     public PromoPage clickHederCasinoButton() {
         hedderCasinoButton
                 .hover()
                 .shouldBe(Condition.appear)
                 .shouldBe(Condition.exist)
                 .click();
         return this;
     }


     @Step("Нажимаем на турниры 'ЛЕДЯНОЙ ФЕСТИВАЛЬ'")
    public PromoPage clickTournamentIceFestivalButton(){
        tournamentIceFestivalButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ПРАДОСТНЫЙ ПРАЗДНИК'")
    public PromoPage clickTournamentJoyfulHolidayButton(){
        tournamentJoyfulHolidayButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ПОЛУНОЧНЫЕ ЧУДЕСА'")
    public PromoPage clickTournamentMidnightWondersButton(){
        tournamentMidnightWondersButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'НОВОГОДНИЙ ФЕСТИВАЛЬ СЧАСТЬЯ'")
    public PromoPage clickTournamentNewYearFestivalHappinessButton(){
        tournamentNewYearFestivalHappinessButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'NON-STOP DROP'")
    public PromoPage clickTournamentNonStopDropButton(){
        tournamentNonStopDropButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'DROPS & WINS 2024'")
    public PromoPage clickTournamentCashYourFlyWithUSButton(){
        tournamentCashYourFlyWithUSButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'SPINOLEAGUE'")
    public PromoPage clickTournamentSpinoLeagueButton(){
        tournamentSpinoLeagueButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'GODZIDROP СУПЕРБОНУСНЫЙ ВЗРЫВ'")
    public PromoPage clickTournamentGodziDropButton(){
        tournamentGodziDropButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'СТАВЬ И ВЫИГРЫВАЙ'")
    public PromoPage clickTournamentBetWinButton(){
        tournamentBetWinButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'СТАВЬ И ВЫИГРЫВАЙ'")
    public PromoPage clickReturnTournamentButton() {
        returnTournamentButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.exist).
                click();
                return this;
    }

    @Step("Нажимаем на турниры 'ПРАЗДНИЧНАЯ СУМАТОХА'")
    public PromoPage clickTournamentHolidayFuss() {
        tournamentHolidayFussButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ЗИМНЯЯ РУЛЕТКА'")
    public PromoPage clickTournamentWinterRoulette() {
        tournamentWinterRouletteButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ПРАЗДНИЧНЫЙ БЛЭКДЖЕК'")
    public PromoPage clickTournamentHolidayBlackjack() {
        tournamentHolidayBlackjackButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ЗИМНЯЯ СХВАТКА'")
    public PromoPage clickTournamentWinterShowDown() {
        tournamentWinterShowDownButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'РОЖДЕСТВЕНСКАЯ ФЕЕРИЯ'")
    public PromoPage clickTournamentChristmasExtravaganzaButton() {
        tournamentChristmasExtravaganzaButtonButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'СКАЗОЧНО ЩЕДРЫЙ МЕСЯЦ'")
    public PromoPage clickTournamentFabulousGenerousMonth() {
        tournamentFabulousGenerousMonthButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'НОВОГОДНИЙ ПЕРЕПОЛОХ'")
    public PromoPage clickTournamentNewYearMadness() {
        tournamentNewYearMadnessButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
    @Step("Нажимаем на турниры 'СОКРОВИЩА РОЖДЕСТВА'")
    public PromoPage clickTournamentTreasuresChristmas() {
        tournamentTreasuresChristmasButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'AMARIX XMAS'")
    public PromoPage clickTournamentAmarixXmasButton() {
        tournamentAmarixXmasButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ИГРАЙ И ПОБЕЖДАЙ, НОВЫЙ ГОД ВСТРЕЧАЙ!'")
    public PromoPage clickTournamentPlayWinCelebrateNewYearButton() {
        tournamentPlayWinCelebrateNewYearButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.exist)
                .click();
        return this;
    }
    @Step("Нажимаем на турниры 'ПРАЗДНИК РОЖДЕСТВЕНСКИХ КОЛОКОЛЬЧИКОВ'")
    public PromoPage clickTournamentChristmasBellsFestivalButton() {
        tournamentChristmasBellsFestivalButton.
                shouldBe(Condition.exist)
                .shouldBe(Condition.exist)
                .click();
        return this;
    }

    @Step("Нажимаем на турниры 'ПРАЗДНИЧНАЯ УТОПИЯ'")
    public PromoPage clickTournamentFestiveUtopiaButton() {
        tournamentFestiveUtopiaButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear).click();
        return this;
    }

    @Step("Нажимаем на бонус 'Jacky's bet'")
    public PromoPage clickBonusJackysBetButton() {
        bonusJackysBetButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Дикая охота за спинами'")
    public PromoPage clickBonusHuntSpinButton() {
        bonusWildHuntSpinButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Пятничный буст'")
    public PromoPage clickBonusFridayButton() {
        bonusFridayBustButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Сделка дня'")
    public PromoPage clickBonusDealOfDayButton() {
        bonusDealOfDayButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на 'Хлебные крошки Акции и бонусы'")
    public PromoPage clickReturnPromotionsBonusesButton() {
        returnPromotionsBonusesButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Большая игра'")
    public PromoPage clickBonusBigGameButton() {
        bonusBigGameButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Vip cashback'")
    public PromoPage clickBonusVipCashbackButton() {
        bonusVipCashbackButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'ЛОЯЛЬНОСТЬ НА ВЕС ЗОЛОТА'")
    public PromoPage clickLoyaltyWorthWeighGoldButton() {
        bonusLoyaltyWorthWeighGoldButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на бонус 'Приветсвенный пакет'")
    public PromoPage clickBonusWelcomePackageButton() {
        bonusWelcomePackageButton
                .hover()
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на турнир 'Spin of Tron'")
    public PromoPage clickSpinOfThronesThree() {
        spinOfThronesThree.
                shouldBe(Condition.exist).
                shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Бонусы'")
    public PromoPage clickCategoryBonusesContendPromotionsButton() {
        categoryBonusesContendPromotionsButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Турниры'")
    public PromoPage clickCategoryBonusesContendTournamentsButton() {
        categoryBonusesContendTournamentsButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку UI Bar 'Казино'")
    public PromoPage clickCategoryUIBarCasinoButton() {
        categoryUIBarCasinoButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}
