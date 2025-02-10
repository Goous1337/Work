package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement categoryLiveCasinoButton = $x("//a[@href='/ru/casino']");
    private final SelenideElement categoryCasinoButton = $x("//a[@href='/ru/slots']");
    private final SelenideElement categoryPromoButton = $x("//a[@href='/ru/bonus/rules']");
    private final SelenideElement registrationButton = $x("//a[@href='/ru/registration']");
    private final SelenideElement loginButton = $x("//span[@class='ui-button__container']/span[text()='Вход']");
    private final SelenideElement emailOrIDInputField = $x("//input[@id='username']");
    private final SelenideElement passwordInputField = $x("//input[@id='username-password']");
    private final SelenideElement submitButton = $x("//span[@class='ui-button__container']/span[text()='Войти']");


    @Step("Нажать на кнопку 'Войти'")
    public MainPage clickSubmitButton() {
        submitButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear).
                click();
        return this;
    }

    @Step("Вводим значение в поле email")
    public MainPage senKeysPasswordInputField(String password) {
        passwordInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(password);
        return this;
    }

    @Step("Вводим значение в поле password")
    public MainPage senKeysEmailOrIdInputField(String emailOrIDInput) {
        emailOrIDInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(emailOrIDInput);
        return this;
    }

    @Step("Кликаем на кнопку'Вход'")
    public MainPage clickLoginButton() {
        loginButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Клинуть на кнопку 'Регистрация'")
    public MainPage clickRegistrationButton() {
        registrationButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку Live-Casino")
    public MainPage clickCategoryLiveCasinoButton() {
        categoryLiveCasinoButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку Slots")
    public MainPage clickCategoryCasinoButton() {
        categoryCasinoButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    @Step("Кликнуть на кнопку Promo")
    public MainPage clickCategoryPromoButton() {
        categoryPromoButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }



    }



