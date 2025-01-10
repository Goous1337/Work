package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PersonalAccountPage {

    private final SelenideElement personalAccountButton =$x("//a[@href='/ru/office/account']");
    private final SelenideElement bonusesOrDepositButton = $x("//a[@href='/ru/office/bonuses/deposit']");
    private final SelenideElement vipCashbackButton = $x("//a[@href='/ru/office/casino/vipcashback']");
    private final SelenideElement bonusesSwitcherButton = $x("//a[@href='/ru/office/bonuses/deposit']");
    private final SelenideElement bonusesSwitcherGiftButton = $x("//a[@href='/ru/office/bonuses/wager']");
    private final SelenideElement bonusGiftRulesButton = $x("//button[contains(@class, 'bonuses-and-gifts-page-rules__button') and text()='Правила']");
    private final SelenideElement modalWindowRulesBonusesOrGift = $x("//div[@class[contains(., 'bonuses-and-gifts-rules-modal')]]//li[normalize-space(text())" +
            " = 'Подарок - особый тип бонуса, не требующий внесения депозита и доступный только при наличии согласия на бонусные предложения в казино.']");
    private final SelenideElement menuNavigationVipCashbackButton = $x("//a[@href='/ru/office/casino/vipcashback']");
    private final SelenideElement vipCashbackRulesButton =$x("//span[@class='office-vip-cashback-control-panel-total-rules__caption']");


    public void verifyModalWindowRulesBonusesOrGiftText(){
        String expectedText = "Подарок - особый тип бонуса, не требующий внесения депозита и доступный только при наличии согласия на бонусные предложения в казино.";

        String actualText = modalWindowRulesBonusesOrGift.getText().trim();

        if (actualText.equals(expectedText)) {
            System.out.println("Текс совподает ожидаемому");
        } else {
            throw new AssertionError("Текс не соотвествует "
                    + expectedText  + "' но было:'" + actualText + "'");
        }
    }

    public PersonalAccountPage clickVipCashbackRulesButton() {
        vipCashbackRulesButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'VIP кешбэк казино'")
    public PersonalAccountPage clickMenuNavigationVipCashbackButton() {
        menuNavigationVipCashbackButton
                .shouldHave(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Бонусы и подарки'")
    public PersonalAccountPage clickBonusGiftRulesButton() {
        bonusGiftRulesButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Личный кабинет'")
    public PersonalAccountPage clickPersonalAccountButton() {
        personalAccountButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимем на кнопку 'Бонусы и подарки'")
    public PersonalAccountPage clickBonusesOrDepositButton(){
        bonusesOrDepositButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Vip cashback'")
    public PersonalAccountPage clickVipCashbackButton(){
        vipCashbackButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Переключение бонусов'")
    public PersonalAccountPage clickBonusesSwitcherButton(){
        bonusesSwitcherButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Нажимем на кнопку 'Подарки'")
    public PersonalAccountPage clickBonusesSwitcherGiftButton(){
        bonusesSwitcherGiftButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

}
