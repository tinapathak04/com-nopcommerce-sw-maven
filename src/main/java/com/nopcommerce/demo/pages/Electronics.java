package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {

    By hoverElectronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By clickElectronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By hoverOnCellPhones = By.xpath("//h1[normalize-space()='Cell phones']");
    By clickCellphones = By.xpath("//h1[normalize-space()='Cell phones']");
    By verifyCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clickListView = By.xpath("//a[contains(text(),'List')]");
    By clickNokiaLumia = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By verifyNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verify$349 = By.xpath("//span[@id='price-value-20']");
    By clearQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By changeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By clickAddCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By hoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verifyQty2 = By.xpath("//input[@id='itemquantity11222']");
    By verify$698 = By.xpath("//td[@class='subtotal']//span[text()='$698.00']");
    By tickCheckBox = By.xpath("//input[@id='termsofservice']");
    By verifyWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickRegister = By.xpath("//button[contains(text(),'Register')]");
    By verifyRegister = By.xpath("//h1[contains(text(),'Register')]");
    By clickGender = By.xpath("//input[@id='gender-female']");

    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    By verifyRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    By textShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");



    public void hoverOnElectronics(){
        mouseHoverToElement(hoverElectronicsTab);
    }
    public void clickOnElectronics(){
        clickOnElement(clickElectronicsTab);
    }
    public void hoverToCellphones(){
        mouseHoverToElement(hoverOnCellPhones);
    }
    public void clickOnCellphones(){
       clickOnElement(clickCellphones);
    }
    public String verifyByCellphones(){
        return getTextFromElement(verifyCellPhones);
    }
    public void clickOnListView(){
       clickOnElement(clickListView);
    }
    public void clickOnNokiaLumia(){
        clickOnElement(clickNokiaLumia);
    }
    public String verifyByNokiaLumia(){
         return getTextFromElement(verifyNokiaLumia);
    }
    public String by$349(){
         return getTextFromElement(verify$349);
    }
    public void clear(){
        driver.findElement(changeQty).clear();
    }
    public void changeQuantity(){
        sendTextToElement(changeQty,"2");
    }
    public void addToCart(){
       clickOnElement(clickAddCart);
    }
    public void hoverToShoppingCart(){
        mouseHoverToElement(hoverOnShoppingCart);
    }
    public void clickOnGoToCart(){
         clickOnElement(clickGoToCart);
    }
    public String byShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }
    public String by2(){
        return getTextFromElement(verifyQty2);
    }
    public String byTotal(){
        return getTextFromElement(verify$698);
    }
    public void clickOnCheckBox(){
        clickOnElement(tickCheckBox);
    }
    public String byWelcomeText(){
        return getTextFromElement(verifyWelcomeText);
    }
    public void clickOnRegister(){
        clickOnElement(clickRegister);
    }
    public String byRegister(){
        return getTextFromElement(verifyRegister);
    }
    public void clickOnGender(){
        clickOnElement(clickGender);
    }
    public void enterPassword(){
        sendTextToElement(password,"tina123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"tina123");
    }
    public String byRegistrationCompleted(){
        return getTextFromElement(verifyRegistrationCompleted);
    }
    public String byshoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }



}
