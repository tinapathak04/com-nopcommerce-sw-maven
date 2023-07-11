package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {

    By clickComputerMenu = By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']");
    By hoverDesktop = By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']");
    By clickDesktop = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By selectSortPosition = By.xpath("//select[@id='products-orderby']");
    By verifyProductArrangeDescendingOrder = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By clickComputer = By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']");
    By selectSortName = By.xpath("//select[@id='products-orderby']");
    By clickAddCart = By.xpath("//div[@class='buttons']//button[text()='Add to cart']");
    By verifyText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectGHzIntel = By.xpath("//select[@id='product_attribute_1']");
    By select8GB = By.xpath("//select[@id='product_attribute_2']");
    By selectHDDradio = By.xpath("//input[@id='product_attribute_3_7']");
    By clickVistPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By MicrosoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By addCard = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductShoppingCart = By.xpath("//p[@class='content']");
    By clickElement = By.xpath("//span[@class='close']");
    By verifyTotal = By.xpath("//span[text()='$2,950.00']");
    By clickCheckBox = By.xpath("//input[@id='termsofservice']");
    By clickCheckout = By.xpath("//button[@id='checkout']");
    By verifyWelcome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickCheckoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    By name = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By surname = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By state = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickContinue = By.xpath("//div[@id='billing-buttons-container']//button[text()='Continue']");
    By clickNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By pressContinue = By.xpath("//div[@id='shipping-method-buttons-container']//button[text()='Continue']");
    By selectRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    By selectMasterCard = By.xpath("//option[contains(text(),'Master card')]");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By enterContinue = By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']");
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Payment Method:')]");
    By verifyShippingMethod = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By textTotal = By.xpath("//td[@class='subtotal']//span[text()='$2,950.00']");

    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickContinueText = By.xpath("//button[contains(text(),'Continue')]");
    By welcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");





    public void clickOnComputerMenu(){
        clickOnElement(clickComputerMenu);
    }
    public void hoverOnDesktop(){
        mouseHoverToElement(hoverDesktop);
    }
    public void clickOnDesktop(){
        clickOnElement(clickDesktop);
    }
    public void selectNameZtoA(){
        selectByContainsTextFromDropDown(selectSortPosition,"Name: Z to A");
    }
    public String descendingOrder(){
        return getTextFromElement(verifyProductArrangeDescendingOrder);
    }
    public void clickOnComputer(){
        clickOnElement(clickComputer);
    }
    public void selectNameAtoZ(){
        selectByIndexFromDropDown(selectSortName,1);
    }
    public void addOnCart(){
        clickOnElement(clickAddCart);
    }
    public String verifyByText(){
        return getTextFromElement(verifyText);
    }
    public void selectOnGHzDualE2200(){
        selectByValueFromDropDown(selectGHzIntel,"1");
    }
    public void selectOn8GB(){
        selectByValueFromDropDown(select8GB,"5");
    }
    public void clickOnRadio(){
        clickOnElement(selectHDDradio);
    }
    public void OsRadioVistaPremium(){
        clickOnElement(clickVistPremium);
    }
    public void tickOnMicrosoft(){
        clickOnElement(MicrosoftOffice);
    }
    public void tickOnTotalCommander(){
        clickOnElement(totalCommander);
    }
    public String verifyThePrice(){
        return getTextFromElement(verifyPrice);
    }
    public void clickAddOnCard(){
        clickOnElement(addCard);
    }
    public String VerifyShoppingCart(){
        return getTextFromElement(verifyProductShoppingCart);
    }
    public void clickOnElement(){
        clickOnElement(clickElement);
    }
    public String verifyByTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void tickOnCheckBox(){
        clickOnElement(clickCheckBox);
    }
    public void clickOnCheckout(){
        clickOnElement(clickCheckout);
    }
    public String verifyByWelcome(){
        return getTextFromElement(verifyWelcome);
    }
    public void clickOnCheckoutGuest(){
        clickOnElement(clickCheckoutGuest);
    }
    public void enterName(){
        sendTextToElement(name,"Tina");
    }
    public void enterSurname(){
        sendTextToElement(surname,"Pathak");
    }
    public void enterEmail(){
        sendTextToElement(email,"tinaPathak@yahoo.com");
    }
    public void enterCountry(){
        sendTextToElement(country,"United States");
    }
    public void enterState (){
        sendTextToElement(state,"New York");
    }
    public void enterCity(){
        sendTextToElement(city,"New York");
    }
    public void enterAddress(){
        sendTextToElement(address,"47 W 13th St, New York");
    }
    public void enterPostCode(){
        sendTextToElement(postCode,"NY 10011");
    }
    public void enterPhoneNumber(){
        sendTextToElement(phoneNumber,"2770000");
    }
    public void withContinue(){
        clickOnElement(clickContinue);
    }
    public void ButtonNextDayAir(){
        clickOnElement(clickNextDayAir);
    }
    public void clickingContinue(){
        clickOnElement(pressContinue);
    }
    public void clickCreditCard(){
        clickOnElement(selectRadioButton);
    }
    public void selectMasterCard(){
        selectByValueFromDropDown(selectMasterCard,"MasterCard");
    }
    public void enterCardHolderName(){
        sendTextToElement(cardHolderName,"T Pathak");
    }
    public void enterCardNumber(){
        sendTextToElement(cardNumber,"5425233430109903");
    }
    public void enterExpireMonth(){
        sendTextToElement(expireMonth,"12");
    }
    public void enterExpireYear(){
        sendTextToElement(expireYear,"2026");
    }
    public void enterCardCode(){
        sendTextToElement(cardCode,"0136");
    }
    public void enteringContinue(){
        clickOnElement(enterContinue);
    }
    public String byPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    public String byShippingMethod(){
        return getTextFromElement(verifyShippingMethod);
    }
    public String byTotal(){
        return getTextFromElement(textTotal);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }
    public String byThankYou(){
        return getTextFromElement(thankYouText);
    }
    public String byProcessed(){
        return getTextFromElement(verifyProcessed);
    }
    public void onContinue(){
        clickOnElement(clickContinueText);
    }
    public String byWelcomeStore(){
        return getTextFromElement(welcomeToStore);
    }




}
