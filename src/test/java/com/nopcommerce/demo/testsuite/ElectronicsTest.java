package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    Electronics electronics = new Electronics();
    Computers computers = new Computers();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){

        electronics.hoverOnElectronics();
        electronics.clickOnElectronics();
        electronics.hoverToCellphones();
        electronics.clickOnCellphones();

        String expectedText = "Cell phones";
        String actualText =electronics.verifyByCellphones();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        electronics.hoverOnElectronics();
        electronics.clickOnElectronics();
        electronics.hoverToCellphones();
        electronics.clickOnCellphones();

        String expectedText = "Cell phones";
        String actualText =electronics.verifyByCellphones();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");

        electronics.clickOnListView();
        electronics.clickOnNokiaLumia();

        String expectedText1 = "Nokia Lumia 1020";
        String actualText1 =electronics.verifyByNokiaLumia();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");

        String expectedText2 = "$349.00";
        String actualText2 =electronics.by$349();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");

        electronics.clear();
        electronics.changeQuantity();
        electronics.addToCart();
        electronics.hoverToShoppingCart();
        electronics.clickOnGoToCart();

        String expectedText3 = "Shopping cart";
        String actualText3 =electronics.byShoppingCart();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");

        String expectedText4 = "2";
        String actualText4 =electronics.by2();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");

        String expectedText5 = "$698.00";
        String actualText5 =electronics.byTotal();
        Assert.assertEquals(actualText5,expectedText5,"Message not displayed");

        electronics.clickOnCheckBox();
        computers.clickOnCheckout();

        String expectedText6 = "Welcome, Please Sign In!";
        String actualText6 =electronics.byWelcomeText();
        Assert.assertEquals(actualText6,expectedText6,"Message not displayed");

        electronics.clickOnRegister();

        String expectedText7 = "Register";
        String actualText7 =electronics.byRegister();
        Assert.assertEquals(actualText7,expectedText7,"Message not displayed");

        electronics.clickOnGender();

        computers.enterName();
        computers.enterSurname();
        computers.enterEmail();
        electronics.enterPassword();
        electronics.enterConfirmPassword();
        electronics.clickOnRegister();


        String expectedText8 = "Your registration completed";
        String actualText8 =electronics.byRegistrationCompleted();
        Assert.assertEquals(actualText8,expectedText8,"Message not displayed");

        computers.clickingContinue();

        String expectedText9 = "Shopping cart";
        String actualText9 =electronics.byshoppingCart();
        Assert.assertEquals(actualText9,expectedText9,"Message not displayed");
    }



}
