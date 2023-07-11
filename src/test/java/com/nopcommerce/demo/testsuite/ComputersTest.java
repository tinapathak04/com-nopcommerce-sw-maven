package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends BaseTest {

    Computers computer = new Computers();
    Electronics electronics = new Electronics();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computer.clickOnComputerMenu();
        computer.hoverOnDesktop();
        computer.clickOnDesktop();
        computer.selectNameZtoA();

        String expectedText = "Name: Z to A";
        String actualText =computer.descendingOrder();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.hoverOnDesktop();
        computer.clickOnDesktop();
        computer.selectNameAtoZ();
        computer.addOnCart();

        String expectedText = "Build your own computer";
        String actualText =computer.verifyByText();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");

        computer.selectOnGHzDualE2200();
        computer.selectOn8GB();
        computer.clickOnRadio();
        computer.OsRadioVistaPremium();
        computer.tickOnMicrosoft();
        computer.tickOnTotalCommander();

        String expectedText1 = "$1,425.00";
        String actualText1 =computer.verifyThePrice();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");

        computer.clickAddOnCard();
        String expectedText0 = "The product has been added to your shopping cart";
        String actualText0 =computer.VerifyShoppingCart();
        Assert.assertEquals(actualText0,expectedText0,"Message not displayed");


        computer.clickOnElement();
        String expectedText9 = "$2,950.00";
        String actualText9 =computer.verifyByTotal();
        Assert.assertEquals(actualText9,expectedText9,"Message not displayed");

        computer.verifyByTotal();
        computer.tickOnCheckBox();
        computer.clickOnCheckout();

        String expectedText2 = "Welcome, Please Sign In!";
        String actualText2 =computer.verifyByWelcome();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");

        computer.clickOnCheckoutGuest();
        computer.enterName();
        computer.enterSurname();
        computer.enterEmail();
        computer.enterCountry();
        computer.enterState();
        computer.enterCity();
        computer.enterAddress();
        computer.enterPostCode();
        computer.enterPhoneNumber();
        computer.withContinue();
        computer.ButtonNextDayAir();
        computer.clickingContinue();
        computer.clickCreditCard();
        computer.selectMasterCard();
        computer.enterCardHolderName();
        computer.enterCardNumber();
        computer.enterExpireMonth();
        computer.enterExpireYear();
        computer.enterCardCode();
        computer.enteringContinue();

        String expectedText3 = "Payment Method: Credit Card";
        String actualText3 =computer.byPaymentMethod();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");

        String expectedText4 = "Shipping Method: Next Day Air";
        String actualText4 =computer.byShippingMethod();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

        String expectedText5 = "$2,950.00";
        String actualText5 =computer.byTotal();
        Assert.assertEquals(actualText5,expectedText5,"Message not displayed");

        computer.clickOnConfirm();

        String expectedText6 = "Thank you";
        String actualText6 =computer.byThankYou();
        Assert.assertEquals(actualText6,expectedText6,"Message not displayed");

        String expectedText7 = "Your order has been successfully processed!";
        String actualText7 =computer.byProcessed();
        Assert.assertEquals(actualText7,expectedText7,"Message not displayed");

        computer.onContinue();

        String expectedText8 = "Welcome to our store";
        String actualText8 =computer.byWelcomeStore();
        Assert.assertEquals(actualText8,expectedText8,"Message not displayed");

    }

}
